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

}
