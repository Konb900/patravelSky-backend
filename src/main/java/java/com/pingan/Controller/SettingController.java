package java.com.pingan.Controller;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import java.com.pingan.Service.UserClientService;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.com.pingan.Model.Profile;
import java.com.pingan.Model.UserClient;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.annotation.Resource;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping(value = "/setting")
public class SettingController { 
    public UserClientService userService;

    @RequestMapping(value = "/profile")
    public ModelAndView index_profile(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        UserClient uc;
    }

    @RequestMapping(value = "/password")
    public ModelAndView index_password(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        UserClient uc;
    }

}
