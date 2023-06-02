package java.com.pingan.Service;

import java.com.pingan.Model;
import java.util.List;

/**
 * Created by XieJia@pingan.com.cn
 */
public class ApplyService { 

    public int insertBudget(BudgetBean budgetBean) {
    }

    public List<ApplyShort> selectAllApplyShortByUserDepartment(String department) {
    }

    public int updateApplyState(String applyState, String apply_id) {
    }

    public int insertApplyInfo(Apply apply) {
    }

    public int caculateApplyBudget(List<Budget> list) {
    }

    public Apply selectApplyByapplyId(String apply_id) {
    }

    public int sendApplyNotification(UserClient userClient, String apply_id) {
    }

    public int insertBudgets(List<Budget> list) {
    }

    public int deleteBudgetByApplyId(String applyid) {
    }

    public List<BudgetBean> selectAllBudgetByApplyId(String apply_id) {
    }

    public float getApplyBudgetMoney(String apply_id) {
    }

    public String getApplyStateByApplyId(String id) {
    }

    public String getApplyRes(String apply_id) {
    }

    public List<ApplyShort> selectAllApplyShortByuserId(String user_id) {
    }

    public int updateApplyInfo(Apply apply) {
    }

}
