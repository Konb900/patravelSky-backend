package java.com.pingan.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import java.io.IOException;
import java.com.pingan.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.ParseException;
import java.com.pingan.Service.ApplyService;
import java.com.pingan.Service.UserClientService;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import java.com.pingan.Utils.IDworker;
import javax.servlet.http.HttpServletResponse;
import java.com.pingan.Utils.DateTransform;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
@RequestMapping("/mytrip")
public class MyTripController { 
    public ApplyService applyService;
    public UserClientService userService;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    @ResponseBody
    public String MyTripNew(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Date time_begin = null,time_end = null;
        String user_name = request.getParameter("user_name");
        String user_department = request.getParameter("user_department");
        String user_apply_time = request.getParameter("user_apply_time");
    }

}
