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
    }

}
