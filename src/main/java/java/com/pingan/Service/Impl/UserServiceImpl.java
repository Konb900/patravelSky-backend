package java.com.pingan.Service.Impl;

import java.com.pingan.Service.UserClientService;
import java.util.List;
import java.com.pingan.DAO.WeiboDao;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.com.pingan.DAO.UserDao;
import java.com.pingan.Model.UserClient;
import java.com.pingan.Model.Profile;

/**
 * Created by XieJia@pingan.com.cn
 */
@Service
public class UserServiceImpl { 
    public UserDao userDao;
    public WeiboDao weiboDao;

}
