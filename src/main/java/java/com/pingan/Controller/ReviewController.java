package java.com.pingan.Controller;

import java.com.pingan.Model;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import java.com.pingan.Service.ReviewService;
import java.util.List;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
import java.sql.Date;
import java.com.pingan.Service.UserClientService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import java.com.pingan.Service.ApplyService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.com.pingan.Utils.DateTransform;

/**
 * Created by PanJianHua@pingan.com.cn
 */
@Controller
@RequestMapping("/review")
public class ReviewController { 
    private ApplyService applyService;
    private ReviewService reviewService;
    private UserClientService userService;

    @RequestMapping
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        if (!user_id.equals("")) 
        {
            UserClient uc = userService.selectUserById(user_id);
            List<ApplyShort> applyShorts = applyService.selectAllApplyShortByUserDepartment(uc.getUser_department());
            mv.addObject("user", uc);
            mv.addObject("applyShorts", applyShorts);
        }
    }

    @RequestMapping(value = "/{apply_id}")
    public ModelAndView applyReview(String apply_id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        Apply apply = applyService.selectApplyByapplyId(apply_id);
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        UserClient uc = userService.selectUserById(user_id);
        List<BudgetBean> budgets = applyService.selectAllBudgetByApplyId(apply_id);
        mv.addObject("user", uc);
    }

}
