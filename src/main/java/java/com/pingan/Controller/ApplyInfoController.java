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

}
