package java.com.pingan.Controller;

import java.com.pingan.Model.Weibo;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import java.com.pingan.Service.UserClientService;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.com.pingan.Model.UserClient;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletResponse;
import java.com.pingan.Service.WeiboService;

/**
 * Created by PanJianHua@pingan.com.cn
 */
@Controller
@RequestMapping("/home")
public class HomeController { 
    private WeiboService weiboService;
    private UserClientService service;

}
