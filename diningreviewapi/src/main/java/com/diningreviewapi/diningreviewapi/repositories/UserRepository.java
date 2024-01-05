package com.diningreviewapi.diningreviewapi.repositories;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.diningreviewapi.diningreviewapi.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
 //main repository ideas gotten from codecademy   
 
    List<User> findByUsername(String username);
    List<User> findByProvince(String province);
    List<User> findByIsInterestedInDairyAllergy(Boolean isInterestedInDairyAllergy);
    List<User> findByIsInterestedInEggAllergy(Boolean isInterestedInEggAllergy);
    List<User> findByIsInterestedInPeanutAllergy(Boolean isInterestedInPeanutAllergy);
}
