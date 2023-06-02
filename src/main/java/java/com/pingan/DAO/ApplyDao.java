package java.com.pingan.DAO;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import java.com.pingan.Model.Apply;
import java.com.pingan.Model.BudgetBean;
import java.com.pingan.Model.ApplyShort;
import org.springframework.stereotype.Repository;

/**
 * Created by PanJianHua@pingan.com.cn
 */
@Repository
public class ApplyDao { 

    public String getApplyStateByApplyId(String apply_id) {
    }

    public int deleteBudgetByApplyId(String apply_id) {
    }

    public int updateApplyInfo(Apply apply) {
    }

    public List<ApplyShort> selectApplyShortByuserId(String user_id) {
    }

    public int updateBudget(BudgetBean budgetBean) {
    }

    public int updateApplyState(String applyState, String apply_id) {
    }

    public int insertApply(Apply apply) {
    }

    public List<BudgetBean> selectAllBudgetByApplyId(String apply_id) {
    }

    public float getApplyMoney(String apply_id) {
    }

    public String getApplyRes(String apply_id) {
    }

    public Apply selectApplyByapply_id(String apply_id) {
    }

    public int updateApplyMoney(java money, String apply_id) {
    }

    public List<ApplyShort> selectAllApplyShortByDepartment(String department) {
    }

}
