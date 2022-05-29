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

}
