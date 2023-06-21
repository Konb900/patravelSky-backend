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

    @Override
    public List<UserClient> selectManager(String department) {
        return userDao.selectManager(department);
    }

    @Override
    public List<UserClient> selectEmployee(String department) {
        return userDao.selectEmployee(department);
    }

    @Override
    public int updateUserPassword(String password_new, String user_id) {
        return userDao.updateUserPassword(user_id, password_new);
    }

    @Override
    public Profile getUserProfile(String user_account) {
        return userDao.getUserProfile(user_account);
    }

    @Override
    public UserClient selectUserById(String user_id) {
        return userDao.selectUserClientById(user_id);
    }

    @Override
    public boolean userFaceUrlUpload(String user_id, String url, String user_account) {
        int res1 = userDao.updateUserFaceUrl(user_id, url);
        int res2 = weiboDao.updateWeiboFaceUrl(user_account, url);
        int res3 = weiboDao.updateCommentFaceUrl(user_account, url);
        return true;
    }

    @Override
    public UserClient selectUserByAccount(String user_account) {
        return userDao.selectUserClientByAccount(user_account);
    }

    @Override
    public String selectUserIdByAccount(String user_account) {
        return null;
    }

    @Override
    public int saveUserProfile(String user_account, String description, String phone) {
        int res = userDao.updateUserProfile(user_account, description, phone);
        return res;
    }

    @Override
    public boolean userClientLoginCheck(String user_account, String user_password) {
        return false;
    }

}
