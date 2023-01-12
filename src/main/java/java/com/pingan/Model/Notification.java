package java.com.pingan.Model;

import java.sql.Date;

/**
 * Created by XieJia@pingan.com.cn
 */
public class Notification { 
    public String msg;
    public String apply_id;
    public String user_id;
    public String user_account;
    public Date noti_date;
    public String from_who;
    public String read_state;

    public Notification(String user_id, String user_account, Date noti_date, String msg, String read_state, String apply_id, String from_who) {
        This.user_id = user_id;
        This.user_account = user_account;
        This.noti_date = noti_date;
        This.msg = msg;
    }

    public void setUser_id(String user_id) {
    }

    public void setApply_id(String apply_id) {
    }

    public void setFrom(String from) {
    }

    public void setUser_account(String user_account) {
    }

    public String getRead_state() {
    }

    public String getApply_id() {
    }

    public String getMsg() {
    }

    public void setNoti_date(Date noti_date) {
    }

    public void setMsg(String msg) {
    }

}
