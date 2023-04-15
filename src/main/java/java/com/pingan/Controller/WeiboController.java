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

    @RequestMapping("/publish")
    @ResponseBody
    public String weiboPublish(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        String content = request.getParameter("weibo_content");
        String date = new DateTransform();
        Date weibo_date = Date.valueOf(date);
        int res = 0;
        if (!user_id.equals("")) 
        {
            UserClient uc = userService.selectUserById(user_id);
            IDworker iDworker = new IDworker(1);
            String weibo_id = Long.toString(iDworker.nextId());
            Weibo weibo = new Weibo(weibo_id, content, uc.user_account, weibo_date, 0, uc.user_department, "/resources/image/profile-full-male.png");
            res = weiboService.weiboPublish(weibo);
        }
    }

    @RequestMapping(value = "/thumbOn", method = RequestMethod.POST)
    @ResponseBody
    public String weiboThumbOn(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String weibo_id = request.getParameter("weibo_id");
        int num = Integer.parseInt(request.getParameter("num"));
        int res = weiboService.weiboThumbOn(weibo_id, num);
    }

    @RequestMapping(value = "/comments/publish", method = RequestMethod.POST)
    @ResponseBody
    public String commentsPublish(HttpServletRequest request, HttpServletResponse response) {
        String weibo_id = request.getParameter("weibo_id");
        String comment = request.getParameter("comment");
        String pre_date = new DateTransform();
        HttpSession session = request.getSession();
        String user_id = (String) session.getAttribute("user_id");
        Date date = Date.valueOf(pre_date);
        UserClient uc;
        if (!user_id.equals("")) 
        {
            uc = userService.selectUserById(user_id);
            IDworker iDworker = new IDworker(1);
            String comment_id = Long.toString(iDworker.nextId());
            Comment comment1 = new Comment(comment_id, weibo_id, comment, uc.user_account, date, "/resources/image/profile-full-male.png");
            int res = weiboService.commentPublish(comment1);
        }
    }

}
