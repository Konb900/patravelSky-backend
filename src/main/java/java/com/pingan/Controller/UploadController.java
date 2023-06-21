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

    @RequestMapping(value = "upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(HttpServletRequest request, HttpServletResponse response, ModelMap model, HttpSession session) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile mFile = multipartRequest.getFile("file");
        String user_id = (String) session.getAttribute("user_id");
        String path = request.getSession().getServletContext().getRealPath("/resources/upload");
        String filename = mFile.getOriginalFilename();
        InputStream inputStream = mFile.getInputStream();
        UserClient uc = userService.selectUserById(user_id);
        byte b = new byte[];
        int length = inputStream.read(b);
        Date date = new Date();
        SimpleDateFormat F = new SimpleDateFormat("yyyyMMddHHmmss");
        String prefix = filename.substring(filename.lastIndexOf("."));
        filename = "123" + F.format(date) + prefix;
        String url = path + "/" + filename;
        System.out.println(url);
        FileOutputStream outputStream = new FileOutputStream(url);
        outputStream.write(b, 0, length);
        inputStream.close();
        outputStream.close();
        String url2 = "/BusinessTrip/resources/upload/" + filename;
        boolean res = userService.userFaceUrlUpload(user_id, url2, uc.user_account);
        return "success";
    }

}
