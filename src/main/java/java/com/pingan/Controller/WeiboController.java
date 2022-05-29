package java.com.pingan.Controller;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.com.pingan.Service.WeiboService;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import java.com.pingan.Utils.DateTransform;
import java.com.pingan.Service.UserClientService;
import java.com.pingan.Model.Comment;
import javax.annotation.Resource;
import java.com.pingan.Model.Weibo;
import org.springframework.web.bind.annotation.RequestMethod;
import java.sql.Date;
import org.springframework.web.bind.annotation.ResponseBody;
import java.com.pingan.Model.UserClient;
import java.com.pingan.Utils.IDworker;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping("/weibo")
public class WeiboController { 
    public WeiboService weiboService;
    public UserClientService userService;

}
