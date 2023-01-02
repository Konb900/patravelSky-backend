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
        float totle_budget = 0;
        String apply_id;
        for (list : Budget budget){
            float budget_price;
            int budget_num;
            budget_price = Float.parseFloat(budget.budget_price);
            budget_num = Integer.parseInt(budget.budget_num);
            totle_budget += budget_price * budget_num;
        }
    }

    @Override
    public int updateApplyState(String applyState, String apply_id) {
    }

    @Override
    public List<ApplyShort> selectAllApplyShortByuserId(String user_id) {
    }

    @Override
    public int insertBudgets(List<Budget> list) {
    }

    @Override
    public List<ApplyShort> selectAllApplyShortByUserDepartment(String department) {
    }

    @Override
    public float getApplyBudgetMoney(String apply_id) {
    }

    @Override
    public int insertApplyInfo(Apply apply) {
    }

    @Override
    public int insertBudget(BudgetBean budgetBean) {
    }

    @Override
    public Apply selectApplyByapplyId(String apply_id) {
    }

    @Override
    public List<BudgetBean> selectAllBudgetByApplyId(String apply_id) {
    }

}
