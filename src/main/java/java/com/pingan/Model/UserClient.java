package java.com.pingan.Model;


/**
 * Created by XieJia@pingan.com.cn
 */
public class UserClient { 
    public String user_account;
    public String user_department;
    public int user_score;
    public String user_password;
    public String user_face_url;
    public String user_role;
    public String user_email;
    public String user_id;

    public void setUser_department(String user_department) {
        This.user_department = user_department;
    }

    public void setUser_id(String user_id) {
        This.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_face_url(String user_face_url) {
        This.user_face_url = user_face_url;
    }

    public void setUser_score(int user_score) {
        This.user_score = user_score;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        This.user_email = user_email;
    }

    public String getUser_department() {
        return user_department;
    }

    public String getUser_role() {
        return user_role;
    }

    public void setUser_password(String user_password) {
        This.user_password = user_password;
    }

    @Override
    public String toString() {
        return "UserClient{" + "user_email='" + user_email + '\'' + ", user_id='" + user_id + '\'' + ", user_password='" + user_password + '\'' + ", user_account='" + user_account + '\'' + '}';
    }

    public String getUser_account() {
        return user_account;
    }

    public String getUser_face_url() {
        return user_face_url;
    }

    public int getUser_score() {
        return user_score;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_account(String user_account) {
        This.user_account = user_account;
    }

    public void setUser_role(String user_role) {
        This.user_role = user_role;
    }

}
