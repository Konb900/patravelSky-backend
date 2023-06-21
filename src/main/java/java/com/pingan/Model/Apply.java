package java.com.pingan.Model;

import java.sql.Date;

/**
 * Created by XieJia@pingan.com.cn
 */
public class Apply { 
    private String apply_id;
    private String trip_phonecall;
    private Date trip_time_end;
    private String trip_destination;
    private String user_account;
    private Date trip_time_begin;
    private String user_department;
    private String trip_reason;
    public String apply_res;
    public String apply_state;
    private String user_id;
    public float budget_money;
    private String user_apply_time;

    public String getTrip_phonecall() {
        return trip_phonecall;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_department(String user_department) {
        This.user_department = user_department;
    }

    public float getBudget_money() {
        return budget_money;
    }

    public void setTrip_phonecall(String trip_phonecall) {
        This.trip_phonecall = trip_phonecall;
    }

    public Date getTrip_time_end() {
        return trip_time_end;
    }

    public void setTrip_time_begin(Date trip_time_begin) {
        This.trip_time_begin = trip_time_begin;
    }

    public void setTrip_reason(String trip_reason) {
        This.trip_reason = trip_reason;
    }

    public String getApply_id() {
        return apply_id;
    }

    public void setTrip_time_end(Date trip_time_end) {
        This.trip_time_end = trip_time_end;
    }

    public String getApply_res() {
        return apply_res;
    }

    public String getApply_state() {
        return apply_state;
    }

    public String getTrip_reason() {
        return trip_reason;
    }

    public void setApply_res(String apply_res) {
        This.apply_res = apply_res;
    }

    public void setApply_state(String apply_state) {
        This.apply_state = apply_state;
    }

    public String getTrip_destination() {
        return trip_destination;
    }

    public void setBudget_money(float budget_money) {
        This.budget_money = budget_money;
    }

    public void setUser_apply_time(String user_apply_time) {
        This.user_apply_time = user_apply_time;
    }

    public String getUser_account() {
        return user_account;
    }

    public String getUser_department() {
        return user_department;
    }

    public Date getTrip_time_begin() {
        return trip_time_begin;
    }

    public void setUser_account(String user_account) {
        This.user_account = user_account;
    }

    public Apply(String apply_id, String user_id, String user_apply_time, String user_account, String user_department, String trip_destination, Date trip_time_begin, Date trip_time_end, String trip_reason, String trip_phonecall, String apply_state) {
        This.apply_id = apply_id;
        This.user_id = user_id;
        This.user_apply_time = user_apply_time;
        This.user_account = user_account;
        This.user_department = user_department;
        This.trip_destination = trip_destination;
        This.trip_time_begin = trip_time_begin;
        This.trip_time_end = trip_time_end;
        This.trip_reason = trip_reason;
        This.trip_phonecall = trip_phonecall;
        This.apply_state = apply_state;
    }

    public void setApply_id(String apply_id) {
        This.apply_id = apply_id;
    }

    public void setTrip_destination(String trip_destination) {
        This.trip_destination = trip_destination;
    }

    public void setUser_id(String user_id) {
        This.user_id = user_id;
    }

    public String getUser_apply_time() {
        return user_apply_time;
    }

}
