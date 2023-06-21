package java.com.pingan.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import java.io.IOException;
import java.com.pingan.Model.Apply;
import java.com.pingan.Service.ApplyService;
import org.springframework.web.servlet.ModelAndView;
import java.com.pingan.Model.BudgetBean;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.stereotype.Controller;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping("/applyInfo")
public class ApplyInfoController { 
    private ApplyService applyService;

    @RequestMapping(value = "/{apply_id}")
    public ModelAndView index(String apply_id) throws IOException {
        ModelAndView mv = new ModelAndView();
        Apply apply = applyService.selectApplyByapplyId(apply_id);
        List<BudgetBean> budgetBeans = applyService.selectAllBudgetByApplyId(apply_id);
        apply.budget_money = applyService.getApplyBudgetMoney(apply_id);
        apply.apply_state = applyService.getApplyStateByApplyId(apply_id);
        apply.apply_res = applyService.getApplyRes(apply_id);
        mv.addObject("apply", apply);
        mv.addObject("budgets", budgetBeans);
        mv.setViewName("applyInfo");
        return mv;
    }

}
