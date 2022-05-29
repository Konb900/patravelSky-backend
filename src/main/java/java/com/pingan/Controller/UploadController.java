package java.com.pingan.Controller;

import java.text.SimpleDateFormat;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import java.io.InputStream;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.com.pingan.Service.UserClientService;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.com.pingan.Model.UserClient;
import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Controller
public class UploadController { 
    public UserClientService userService;

}
