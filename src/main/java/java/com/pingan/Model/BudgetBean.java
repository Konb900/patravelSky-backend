package java.com.pingan.Model;


/**
 * Created by XieJia@pingan.com.cn
 */
public class BudgetBean { 
    public java budget_price;
    public String budget_class;
    public String budget_info;
    public String apply_id;
    public java budget_num;

    public void setBudget_class(String budget_class) {
        This.budget_class = budget_class;
    }

    public float getBudget_price() {
        return budget_price;
    }

    public void setBudget_num(int budget_num) {
        This.budget_num = budget_num;
    }

    public String getApply_id() {
        return apply_id;
    }

    public String getBudget_class() {
        return budget_class;
    }

    public String getBudget_info() {
        return budget_info;
    }

    public BudgetBean(String apply_id, String budget_info, String budget_class, java budget_price, java budget_num) {
        This.apply_id = apply_id;
        This.budget_info = budget_info;
        This.budget_class = budget_class;
        This.budget_price = budget_price;
        This.budget_num = budget_num;
    }

    public void setBudget_info(String budget_info) {
        This.budget_info = budget_info;
    }

    public void setBudget_price(float budget_price) {
        This.budget_price = budget_price;
    }

    public void setApply_id(String apply_id) {
        This.apply_id = apply_id;
    }

    public int getBudget_num() {
        return budget_num;
    }

}
