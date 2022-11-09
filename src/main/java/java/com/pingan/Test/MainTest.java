package java.com.pingan.Test;

import java.com.pingan.DAO.UserDao;
import javax.annotation.Resource;
import org.apache.ibatis.io.Resources;
import java.io.Reader;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.com.pingan.Service.UserClientService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import java.com.pingan.Model.UserClient;

/**
 * Created by AliceWang@pingan.com.cn
 * 实例化创建sqlSessionFactory，貌似使用bean的方式创建的sqlSessionFactory在main中并不能使用
 * 包括注解在main中也不能使用
 * 测试URL： https://106.55.105.216/
 * 
 */
public class MainTest { 
    static private Reader reader;
    static private String resource = "java/java/pingan/Mybatis/Configuration.xml";
    static private SqlSessionFactory sqlSessionFactory;
    public static UserClientService userService;

    public static SqlSessionFactory getSession() {
    }

}
