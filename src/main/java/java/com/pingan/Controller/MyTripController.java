package java.com.pingan.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import java.io.IOException;
import java.com.pingan.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParseException;
import java.com.pingan.Service.ApplyService;
import java.com.pingan.Service.UserClientService;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import java.com.pingan.Utils.IDworker;
import javax.servlet.http.HttpServletResponse;
import java.com.pingan.Utils.DateTransform;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping("/mytrip")
public class MyTripController { 
    public ApplyService applyService;
    public UserClientService userService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public String MyTripNew(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Date time_begin = null,time_end = null;
        String user_name = request.getParameter("user_name");
        String user_department = request.getParameter("user_department");
        String user_apply_time = request.getParameter("user_apply_time");
        String trip_destination = request.getParameter("trip_destination");
        String trip_time_begin = new DateTransform();
        String trip_time_end = new DateTransform();
        String trip_reason = request.getParameter("trip_reason");
        String trip_phonecall = request.getParameter("user_phonecall");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        IDworker iDworker = new IDworker(1);
        String apply_id = Long.toString(iDworker.nextId());
        UserClient user = userService.selectUserByAccount(user_name);
        time_begin = Date.valueOf(trip_time_begin);
        time_end = Date.valueOf(trip_time_end);
        Apply apply = new Apply(apply_id, user.getUser_id(), user_apply_time, user_name, user_department, trip_destination, time_begin, time_end, trip_reason, trip_phonecall, "待审批");
        long res = applyService.insertApplyInfo(apply);
    }

    @RequestMapping(value = "/addBudget", method = RequestMethod.POST)
    @ResponseBody
    public String addBudget(List<Budget> budgets) throws IOException {
        String apply_id;
        String budget_info;
        String budget_class;
        float budget_price;
        int budget_num;
        applyService.insertBudgets(budgets);
        for (budgets : Budget budget){
            apply_id = budget.apply_id;
            budget_info = budget.budget_info;
            budget_class = budget.budget_class;
            budget_price = Float.parseFloat(budget.budget_price);
            budget_num = Integer.parseInt(budget.budget_num);
            BudgetBean budgetBean = new BudgetBean(apply_id, budget_info, budget_class, budget_price, budget_num);
            applyService.insertBudget(budgetBean);
        }
        int res = applyService.caculateApplyBudget(budgets);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String applyUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Date time_begin = null,time_end = null;
        String user_name = request.getParameter("user_name");
        String user_department = request.getParameter("user_department");
        String user_apply_time = request.getParameter("user_apply_time");
        String trip_destination = request.getParameter("trip_destination");
        String trip_time_begin = new DateTransform();
        String trip_time_end = new DateTransform();
        String trip_reason = request.getParameter("trip_reason");
        String trip_phonecall = request.getParameter("user_phonecall");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String apply_id = request.getParameter("apply_id");
        String apply_state = applyService.getApplyStateByApplyId(apply_id);
        UserClient user = userService.selectUserByAccount(user_name);
        time_begin = Date.valueOf(trip_time_begin);
        time_end = Date.valueOf(trip_time_end);
        Apply apply = new Apply(apply_id, user.getUser_id(), user_apply_time, user_name, user_department, trip_destination, time_begin, time_end, trip_reason, trip_phonecall, apply_state);
    }

    @RequestMapping
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        if (!user_id.equals("")) 
        {
            List<ApplyShort> applyShorts = applyService.selectAllApplyShortByuserId(user_id);
            mv.addObject("applyShorts", applyShorts);
        }
        mv.setViewName("mytrip");
    }

}
