package com.diningreviewapi.diningreviewapi.repositories;
//import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diningreviewapi.diningreviewapi.entities.AdminReview;
import com.diningreviewapi.diningreviewapi.entities.DiningReview;
import java.util.List;


@Repository
public interface AdminReviewRepository extends CrudRepository<AdminReview, Long>{

   // AdminReview save(DiningReview reviewToUpdate);
    List<AdminReview> findByUsername(String username);
    List<AdminReview> findByReview(DiningReview review);
    AdminReview save(DiningReview reviewToUpdate);
    
}
