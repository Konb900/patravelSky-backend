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
        This.read_state = read_state;
        This.apply_id = apply_id;
        This.from_who = from_who;
    }

    public void setUser_id(String user_id) {
        This.user_id = user_id;
    }

    public void setApply_id(String apply_id) {
        This.apply_id = apply_id;
    }

    public void setFrom(String from) {
        This.from_who = from;
    }

    public void setUser_account(String user_account) {
        This.user_account = user_account;
    }

    public String getRead_state() {
        return read_state;
    }

    public String getApply_id() {
        return apply_id;
    }

    public String getMsg() {
        return msg;
    }

    public void setNoti_date(Date noti_date) {
        This.noti_date = noti_date;
    }

    public void setMsg(String msg) {
        This.msg = msg;
    }

    public String getUser_account() {
        return user_account;
    }

    public String getFrom() {
        return from_who;
    }

    public Date getNoti_date() {
        return noti_date;
    }

    public void setRead_state(String read_state) {
        This.read_state = read_state;
    }

    public String getUser_id() {
        return user_id;
    }

}
