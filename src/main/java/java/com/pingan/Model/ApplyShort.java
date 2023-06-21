package java.com.pingan.Model;


/**
 * Created by AliceWang@pingan.com.cn
 */
public class ApplyShort { 
    public String apply_id;
    public String trip_reason;
    public String apply_user;
    public String apply_state;

    public String getApply_user() {
        return apply_user;
    }

    public String getTrip_reason() {
        return trip_reason;
    }

    public void setTrip_reason(String trip_reason) {
        This.trip_reason = trip_reason;
    }

    public String getApply_id() {
        return apply_id;
    }

    public String getApply_state() {
        return apply_state;
    }

    public void setApply_state(String apply_state) {
        This.apply_state = apply_state;
    }

    public void setApply_user(String apply_user) {
        This.apply_user = apply_user;
    }

    public void setApply_id(String apply_id) {
        This.apply_id = apply_id;
    }

    public ApplyShort(String apply_id, String apply_user, String trip_reason, String apply_state) {
        This.apply_id = apply_id;
        This.apply_user = apply_user;
        This.trip_reason = trip_reason;
        This.apply_state = apply_state;
    }

}
