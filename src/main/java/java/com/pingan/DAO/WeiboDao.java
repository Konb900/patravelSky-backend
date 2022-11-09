package java.com.pingan.DAO;

import java.util.Map;
import java.util.List;
import java.com.pingan.Model.Comment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.com.pingan.Model.Weibo;

/**
 * Created by PanJianHua@pingan.com.cn
 */
@Repository
public class WeiboDao { 

    public int updateCommentFaceUrl(String user_account, String user_face_url) {
    }

    public int weiboPublish(Weibo weibo) {
    }

    public List<Weibo> selectAllWeiboByDepartment(String department) {
    }

    public List<Comment> selectAllCommentByWeiboId(String weibo_id) {
    }

}
