package java.com.pingan.Model;

import java.sql.Date;

/**
 * Created by AliceWang@pingan.com.cn
 */
public class Comment { 
    public String comment_id;
    public String weibo_id;
    public String comment;
    public String user_account;
    public String user_face_url;
    public Date comment_date;

    public Date getComment_date() {
    }

    public void setComment_id(String comment_id) {
    }

    public void setComment(String comment) {
    }

    public Comment(String comment_id, String weibo_id, String comment, String user_account, Date comment_date, String user_face_url) {
        This.comment_id = comment_id;
        This.weibo_id = weibo_id;
    }

}
