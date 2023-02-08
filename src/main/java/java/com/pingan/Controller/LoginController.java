package java.com.pingan.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import java.com.pingan.Model.UserClient;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import org.springframework.web.bind.annotation.PathVariable;
import java.com.pingan.Service.UserClientService;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController { 
    public UserClientService userService;

    @RequestMapping(value = "/user_query", method = RequestMethod.POST)
    @ResponseBody
    public String login_query(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user_account = request.getParameter("user_account");
        String user_password = request.getParameter("user_password");
        UserClient user = userService.selectUserByAccount(user_account);
    }

}
