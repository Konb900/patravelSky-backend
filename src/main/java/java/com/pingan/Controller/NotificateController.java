package java.com.pingan.Controller;

import java.io.IOException;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping("/notification")
public class NotificateController { 

    @RequestMapping
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("notification");
        return mv;
    }

}
