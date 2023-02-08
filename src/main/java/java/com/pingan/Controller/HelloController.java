package java.com.pingan.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PathVariable;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.com.pingan.Model.UserClient;
import java.com.pingan.Service.UserClientService;

@Controller
@RequestMapping("/login")
public class HelloController { 
    public UserClientService userService;

    @RequestMapping(value = "/user_query", method = RequestMethod.POST)
    @ResponseBody
    public String login_query(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String user_account = request.getParameter("user_account");
        String user_password = request.getParameter("user_password");
        UserClient user = userService.selectUserByAccount(user_account);
    }

}
