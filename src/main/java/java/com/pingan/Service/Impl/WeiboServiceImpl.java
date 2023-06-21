package java.com.pingan.Service.Impl;

import java.com.pingan.Model.Weibo;
import java.com.pingan.Service.WeiboService;
import java.com.pingan.DAO.WeiboDao;
import java.com.pingan.Model.Comment;
import java.util.HashMap;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by AliceWang@pingan.com.cn
 */
@Service
public class WeiboServiceImpl { 
    public WeiboDao weiboDao;

    @Override
    public Weibo selectWeiboById(String weibo_id) {
        return weiboDao.selectWeiboById(weibo_id);
    }

    @Override
    public int weiboThumbOn(String weibo_id, int num) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("weibo_id", weibo_id);
        map.put("num", num);
        return weiboDao.weiboThumbOn(map);
    }

    @Override
    public int commentPublish(Comment commnet) {
        return weiboDao.insertComment(commnet);
    }

    @Override
    public List<Comment> selectAllCommentsByWeiboId(String id) {
        return weiboDao.selectAllCommentByWeiboId(id);
    }

    @Override
    public int weiboPublish(Weibo weibo) {
        int res = weiboDao.weiboPublish(weibo);
        return res;
    }

    @Override
    public List<Weibo> selectAllWeiboByDepartment(String department) {
        return weiboDao.selectAllWeiboByDepartment(department);
    }

}
