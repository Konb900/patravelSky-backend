package java.com.pingan.Controller;

import java.com.pingan.Model.BudgetBean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.com.pingan.Model.Apply;
import java.util.List;
import javax.annotation.Resource;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import java.com.pingan.Service.ApplyService;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping("/apply")
public class NewTripController { 
    public ApplyService applyService;

    @RequestMapping(value = "/{apply_id}")
    public ModelAndView getUpdateApply(String apply_id) throws IOException {
        ModelAndView mv = new ModelAndView();
        Apply apply = applyService.selectApplyByapplyId(apply_id);
        List<BudgetBean> budgetBeans = applyService.selectAllBudgetByApplyId(apply_id);
        mv.addObject("apply", apply);
        mv.addObject("budgetBeans", budgetBeans);
    }

}
