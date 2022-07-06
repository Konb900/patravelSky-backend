package java.com.pingan.Service.Impl;

import java.com.pingan.DAO.UserDao;
import java.text.SimpleDateFormat;
import java.com.pingan.DAO.ApplyDao;
import java.com.pingan.DAO.NotificationDao;
import org.springframework.stereotype.Service;
import java.com.pingan.Service.ApplyService;
import java.util.Date;
import javax.annotation.Resource;
import java.com.pingan.Model;
import java.util.List;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Service
public class ApplyServiceImpl { 
    public NotificationDao notificationDao;
    public ApplyDao applyDao;

    @Override
    public int caculateApplyBudget(List<Budget> list) {
    }

    @Override
    public int updateApplyState(String applyState, String apply_id) {
    }

}
