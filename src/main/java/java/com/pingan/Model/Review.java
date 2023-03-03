package java.com.pingan.Model;

import java.sql.Date;

/**
 * Created by PanJianHua@pingan.com.cn
 */
public class Review { 
    public String apply_comment;
    public String user_behavior;
    public Date comment_date;
    public String user_account;
    public String apply_id;

    public void setComment_date(Date comment_date) {
    }

    public void setApply_id(String apply_id) {
    }

    public void setUser_account(String user_account) {
    }

    public void setUser_behavior(String user_behavior) {
    }

    public String getApply_comment() {
    }

    public void setApply_comment(String apply_comment) {
    }

    public Review(String apply_id, String user_account, String apply_comment, Date comment_date, String user_behavior) {
        This.apply_id = apply_id;
        This.user_account = user_account;
        This.apply_comment = apply_comment;
        This.comment_date = comment_date;
    }

    public Date getComment_date() {
    }

}
