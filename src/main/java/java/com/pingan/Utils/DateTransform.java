package java.com.pingan.Utils;

import java.util.Date;

/**
 * Created by AliceWang@pingan.com.cn
 */
public class DateTransform { 

    public String date_transform_(String pre_date) {
        if (pre_date.indexOf("/") > 0) 
        {
            String dateString = pre_date.split("/");
            String res = dateString + "-" + dateString + "-" + dateString;
            return res;
        }
        return "";
    }

    public String date_transform(String pre_date) {
        if (pre_date.indexOf("/") > 0) 
        {
            String dateString = pre_date.split("/");
            String res = dateString + "-" + dateString + "-" + dateString;
            return res;
        }
        if (pre_date.indexOf("-") > 0) 
        {
            return pre_date;
        }
        return "";
    }

}
