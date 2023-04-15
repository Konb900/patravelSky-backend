package java.com.pingan.DAO;

import java.com.pingan.Model.UserClient;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.com.pingan.Model.Profile;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Repository
public class UserDao { 

    public List<UserClient> selectManager(String department) {
    }

    public int updateUserFaceUrl(String user_id, String user_face_url) {
    }

    public int updateUserProfile(String user_account, String description, String phone) {
    }

    public int updateUserPassword(String user_id, String password_new) {
    }

    public List<UserClient> selectEmployee(String department) {
    }

    public Profile getUserProfile(String user_account) {
    }

    public UserClient selectUserClientByAccount(String user_account) {
    }

    public String selectUserClientIdByAccount(String user_account) {
    }

    public UserClient selectUserClientById(String user_id) {
    }

}
