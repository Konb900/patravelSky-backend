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
        Profile profile;
        if (!user_id.equals("")) 
        {
            uc = userService.selectUserById(user_id);
            profile = userService.getUserProfile(uc.user_account);
            mv.addObject("user", uc);
            mv.addObject("profile", profile);
        }
    }

    @RequestMapping(value = "/password")
    public ModelAndView index_password(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mv = new ModelAndView();
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        UserClient uc;
        Profile profile;
        if (!user_id.equals("")) 
        {
            uc = userService.selectUserById(user_id);
            profile = userService.getUserProfile(uc.user_account);
            mv.addObject("user", uc);
            mv.addObject("profile", profile);
        }
    }

    @RequestMapping
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        ModelAndView mv = new ModelAndView();
        String user_id = (String) session.getAttribute("user_id");
        UserClient uc;
        if (!user_id.equals("")) 
        {
            uc = userService.selectUserById(user_id);
            mv.addObject("user", uc);
        }
        mv.setViewName("setting");
    }

    @RequestMapping(value = "/password/save", method = RequestMethod.POST)
    @ResponseBody
    public String save_password(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        String user_id = (String) session.getAttribute("user_id");
        String password_new = request.getParameter("password_new");
        String password_old = request.getParameter("password_old");
        UserClient uc;
        if (!user_id.equals("")) 
        {
            uc = userService.selectUserById(user_id);
            if (!password_old.equals(uc.user_password)) 
            {
                return "password_error";
            }
            int res = userService.updateUserPassword(password_new, user_id);
            return "success";
        }
    }

}
