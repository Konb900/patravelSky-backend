package java.com.pingan.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import java.com.pingan.Model.Profile;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.com.pingan.Service.WeiboService;
import org.springframework.web.bind.annotation.RequestMapping;
import java.com.pingan.Service.UserClientService;
import java.io.IOException;
import java.com.pingan.Model.Weibo;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import java.com.pingan.Model.UserClient;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by PanJianHua@pingan.com.cn
 */
@Controller
@RequestMapping("/profile")
public class ProfileController { 
    private UserClientService service;
    private WeiboService weiboService;

    @RequestMapping
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        HttpSession httpSession = request.getSession();
        String user_id = (String) httpSession.getAttribute("user_id");
        Profile profile;
    }

}
