package java.com.pingan.Service.Impl;

import java.com.pingan.Model.Review;
import java.com.pingan.Service.ReviewService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import java.com.pingan.DAO.ReviewDao;
import java.sql.Date;

/**
 * Created by XieJia@pingan.com.cn
 */
@Service
public class ReviewServiceImpl { 
    private ReviewDao reviewDao;

    @Override
    public int makeReview(Review review) {
        return reviewDao.makeReview(review);
    }

}
