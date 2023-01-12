package java.com.pingan.Model;

import java.sql.Date;

/**
 * Created by PanJianHua@pingan.com.cn
 */
public class Weibo { 
    public String user_account;
    public Date weibo_date;
    public String user_face_url;
    public String weibo_content;
    public String user_department;
    public String weibo_id;
    public Integer thumb_on;

    public Integer getThumb_on() {
    }

    public void setWeibo_content(String weibo_content) {
    }

    public String getWeibo_id() {
    }

    public void setWeibo_id(String weibo_id) {
    }

    public String getUser_face_url() {
    }

    public void setUser_department(String user_department) {
    }

    public Weibo(String weibo_id, String weibo_content, String user_account, Date weibo_date, Integer thumb_on, String user_department, String user_face_url) {
        This.weibo_id = weibo_id;
        This.weibo_content = weibo_content;
        This.weibo_date = weibo_date;
        This.thumb_on = thumb_on;
    }

    public void setUser_face_url(String user_face_url) {
    }

    public String getWeibo_content() {
    }

    public String getUser_account() {
    }

}
