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
        return comment_date;
    }

    public void setComment_id(String comment_id) {
        This.comment_id = comment_id;
    }

    public void setComment(String comment) {
        This.comment = comment;
    }

    public Comment(String comment_id, String weibo_id, String comment, String user_account, Date comment_date, String user_face_url) {
        This.comment_id = comment_id;
        This.weibo_id = weibo_id;
        This.comment = comment;
        This.user_account = user_account;
        This.comment_date = comment_date;
        This.user_face_url = user_face_url;
    }

    public void setComment_date(Date comment_date) {
        This.comment_date = comment_date;
    }

    public String getComment() {
        return comment;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setWeibo_id(String weibo_id) {
        This.weibo_id = weibo_id;
    }

    public String getWeibo_id() {
        return weibo_id;
    }

    public void setUser_account(String user_account) {
        This.user_account = user_account;
    }

    public String getUser_face_url() {
        return user_face_url;
    }

    public void setUser_face_url(String user_face_url) {
        This.user_face_url = user_face_url;
    }

    public String getUser_account() {
        return user_account;
    }

}
