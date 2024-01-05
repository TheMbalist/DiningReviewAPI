package com.diningreviewapi.diningreviewapi.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diningreviewapi.diningreviewapi.entities.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {


    List<Restaurant> findByName(String name);
    List<Restaurant> findByAllergy(String allergy);
    List<Restaurant> findByOverallScoreGreaterThan(Double overallScore);
    List<Restaurant> findByOverallScoreLessThan(Double overallScore);
    List<Restaurant> findByNameAndZipcode(String name, Integer zipcode );

    
}
