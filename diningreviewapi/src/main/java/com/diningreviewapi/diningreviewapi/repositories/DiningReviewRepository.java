package com.diningreviewapi.diningreviewapi.repositories;
import com.diningreviewapi.diningreviewapi.entities.DiningReview;
import com.diningreviewapi.diningreviewapi.entities.Restaurant;
import com.diningreviewapi.diningreviewapi.entities.User;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DiningReviewRepository extends CrudRepository<DiningReview, Long> {

    List<DiningReview> findByUser(User user);
    List<DiningReview> findByRestaurant(Restaurant restaurantName);
    List<DiningReview> findByStatus(Integer status);
    List<DiningReview> findByOptionalDairyScore(Double optionalDairyScore);
    List<DiningReview> findByOptionalEggScore(Double optionalEggScore);
    List<DiningReview> findByOptionalPeanutScore(Double optionalPeanutScore);

}
