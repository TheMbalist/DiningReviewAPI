package com.diningreviewapi.diningreviewapi;
import java.lang.Iterable;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;

import com.diningreviewapi.diningreviewapi.entities.AdminReview;
import com.diningreviewapi.diningreviewapi.entities.DiningReview;
import com.diningreviewapi.diningreviewapi.entities.Restaurant;
import com.diningreviewapi.diningreviewapi.entities.User;
import com.diningreviewapi.diningreviewapi.repositories.AdminReviewRepository;
import com.diningreviewapi.diningreviewapi.repositories.DiningReviewRepository;
import com.diningreviewapi.diningreviewapi.repositories.RestaurantRepository;
import com.diningreviewapi.diningreviewapi.repositories.UserRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;





@RestController
@RequestMapping("/diningreview")
public class DiningReviewController {

    private final UserRepository userRepository;
    private final DiningReviewRepository diningReviewRepository;
    private final RestaurantRepository restaurantRepository;
    private final AdminReviewRepository adminReviewRepository;

   
    public DiningReviewController (UserRepository userRepository, RestaurantRepository restaurantRepository, DiningReviewRepository diningReviewRepository, AdminReviewRepository adminReviewRepository ){
        this.userRepository = userRepository;
       this.diningReviewRepository = diningReviewRepository;
        this.restaurantRepository = restaurantRepository;
       this.adminReviewRepository = adminReviewRepository;
    }

    //create methods
    @PostMapping("/create/user")
    public User createNewUser(@RequestBody User user) {
      User newUser = this.userRepository.save(user);
      return newUser;
    }

     @PostMapping("/create/restaurant")
     public Restaurant createNewRestaurant(@RequestBody Restaurant restaurant) {
      Restaurant newRestaurant = this.restaurantRepository.save(restaurant);
      return newRestaurant;
    }

     @PostMapping("/create/review")
    public DiningReview createNewReview(@RequestBody DiningReview diningReview) {
      DiningReview newDiningReview = this.diningReviewRepository.save(diningReview);
      return newDiningReview;
    }

@PostMapping("/admin/updateStatus/{review_id}")
public AdminReview updateStatus(@PathVariable("review_id") Long review_id, @RequestBody AdminReview adminReview) {

//status would represent text from something like a drop down feature
          AdminReview statusChange = new AdminReview();
          Optional<DiningReview> reviewToUpdateOptional = this.diningReviewRepository.findById(review_id);
          statusChange.setUsername(adminReview.getUsername());       
          statusChange.setIsReviewAccepted(adminReview.getIsReviewAccepted());


            if (!reviewToUpdateOptional.isPresent()) {
               return null;
            }

            // Since isPresent() was true, we can .get() the Person object out of the Optional
            DiningReview reviewToUpdate = reviewToUpdateOptional.get();
             statusChange.setReview(reviewToUpdate);

            if (statusChange.getIsReviewAccepted() != null) {

               if(statusChange.getIsReviewAccepted() == true){
                   reviewToUpdate.setStatus(1);
               
               } else{
                  reviewToUpdate.setStatus(0);
                  
               }
                   
            }
           
             this.diningReviewRepository.save(reviewToUpdate);

             AdminReview reviewStatus = this.adminReviewRepository.save(statusChange);
            return reviewStatus;
}

    //read methods
    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
       return this.userRepository.findAll();
    }

    @GetMapping("/reviews")
    public Iterable<DiningReview> getAllReviews(){
       return this.diningReviewRepository.findAll();
    }

    @GetMapping("/restaurants")
    public Iterable<Restaurant> getAllRestaurants(){
       return this.restaurantRepository.findAll();
    }




     @GetMapping("/restaurants/search/name")
    public Iterable<Restaurant> getRestaurant(@RequestParam(name = "Name", required = false) String name){
       return this.restaurantRepository.findByName(name);
    }

    @GetMapping("/restaurants/search/allergy")
    public Iterable<Restaurant> getRestaurantByAllergy(@RequestParam(name = "Allergy", required = false) String allergy){
       return this.restaurantRepository.findByAllergy(allergy);
    }

    @GetMapping("/restaurants/search/largeOverallScores")
    public Iterable<Restaurant> getRestaurantByOverallScoreLargerThan(@RequestParam(name = "Overall_Score", required = false) Double overallScore){
       return this.restaurantRepository.findByOverallScoreGreaterThan(overallScore);
    }

    @GetMapping("/restaurants/searchSmallOverallScores")
    public Iterable<Restaurant> getRestaurantByOverallScoreLessThan(@RequestParam(name = "Overall_Score", required = false) Double overallScore){
       return this.restaurantRepository.findByOverallScoreLessThan(overallScore);
    }


   @GetMapping("/users/search/username")
    public Iterable<User> getUser(@RequestParam(name = "Username", required = false) String username){
       return this.userRepository.findByUsername(username);
    }

     @GetMapping("/users/search/province")
    public Iterable<User> getUserByProvince(@RequestParam(name = "Province", required = false) String province){
       return this.userRepository.findByProvince(province);
    }

     @GetMapping("/users/search/dairy")
    public Iterable<User> getUserByInterestedInDairyAllergy(@RequestParam(name = "isInterestedInDairyAllergy", required = false) Boolean isInterestedInDairyAllergy){
       return this.userRepository.findByIsInterestedInDairyAllergy(isInterestedInDairyAllergy);
    }

    
     @GetMapping("/users/search/egg")
    public Iterable<User> getUserByInterestedInEggAllergy(@RequestParam(name = "isInterestedInEggAllergy", required = false) Boolean isInterestedInEggAllergy){
       return this.userRepository.findByIsInterestedInEggAllergy(isInterestedInEggAllergy);
    }

     
     @GetMapping("/users/search/peanut")
    public Iterable<User> getUserByInterestedInPeanutAllergy(@RequestParam(name = "isInterestedInPeanutAllergy", required = false) Boolean isInterestedInPeanutAllergy){
       return this.userRepository.findByIsInterestedInPeanutAllergy(isInterestedInPeanutAllergy);
    }

    @GetMapping("/reviews/search")
    public Iterable<DiningReview> getReviewByUser(@RequestParam(name = "username", required = false) String username){
        User user = (User) userRepository.findByUsername(username); // Assuming you have a repository method to find a user by username
        return diningReviewRepository.findByUser(user);
    }
    

     @GetMapping("/reviews/search/status")
    public Iterable<DiningReview> getReviewByStatus(@RequestParam(name = "Status", required = false) Integer status){
      return this.diningReviewRepository.findByStatus(status);
     }

     @GetMapping("/reviews/search/eggscore")  
    public Iterable<DiningReview> getReviewByEggScore(@RequestParam(name = "Egg_Score", required = false) Double eggScore){
      return this.diningReviewRepository.findByOptionalEggScore(eggScore);
    }

      @GetMapping("/reviews/search/dairyscore")  
    public Iterable<DiningReview> getReviewByDairyScore(@RequestParam(name = "Dairy_Score", required = false) Double dairyScore){
      return this.diningReviewRepository.findByOptionalDairyScore(dairyScore);
    }

       @GetMapping("/reviews/search/peanutscore")  
    public Iterable<DiningReview> getReviewByPeanutScore(@RequestParam(name = "Peanut_Score", required = false) Double peanutScore){
      return this.diningReviewRepository.findByOptionalPeanutScore(peanutScore);
    }
    @GetMapping("/reviews/search?username")
    public Iterable<DiningReview> getReviewByRestaurant(@RequestParam(name = "username", required = false) String restaurantName){
        Restaurant restaurant = (Restaurant) restaurantRepository.findByName(restaurantName); // Assuming you have a repository method to find a user by username
        return diningReviewRepository.findByRestaurant(restaurant);
    }
    
    //update methods
    @PutMapping("/user/{id}")
   public User updateUser(@PathVariable("id") Long id, @RequestBody User u) {
          Optional<User> userToUpdateOptional = this.userRepository.findById(id);

            if (!userToUpdateOptional.isPresent()) {
               return null;
            }

            // Since isPresent() was true, we can .get() the Person object out of the Optional
            User userToUpdate = userToUpdateOptional.get();

            if (u.getUsername() != null) {
               userToUpdate.setUsername(u.getUsername());
            }
             if (u.getCity() != null) {
                userToUpdate.setCity(u.getCity());
             }
            
            if (u.getProvince() != null) {
                userToUpdate.setProvince(u.getProvince());
             }

            if (u.getZipcode() != null) {
                userToUpdate.setZipcode(u.getZipcode());
             }

           if (u.getIsInterestedInPeanutAllergy() != null) {
                userToUpdate.setIsInterestedInPeanutAllergy(u.getIsInterestedInPeanutAllergy());
             }

            
            if (u.getIsInterestedInEggAllergy() != null) {
                userToUpdate.setIsInterestedInEggAllergy(u.getIsInterestedInEggAllergy());
             }
            
             if (u.getIsInterestedInDairyAllergy() != null) {
                userToUpdate.setIsInterestedInDairyAllergy(u.getIsInterestedInDairyAllergy());
             }

            User userPerson = this.userRepository.save(userToUpdate);
            return userPerson;
}

    @PutMapping("/restaurant/{id}")
public Restaurant updateRestaurant(@PathVariable("id") Long id, @RequestBody Restaurant r) {
          Optional<Restaurant> restaurantToUpdateOptional = this.restaurantRepository.findById(id);

            if (!restaurantToUpdateOptional.isPresent()) {
               return null;
            }

            // Since isPresent() was true, we can .get() the Person object out of the Optional
            Restaurant restaurantToUpdate = restaurantToUpdateOptional.get();

            if (r.getName() != null) {
               restaurantToUpdate.setName(r.getName());
            }
            if(r.getOverallScore() != null){
               restaurantToUpdate.setOverallScore(r.getOverallScore());
            }
            if (r.getAllergy() != null) {
                restaurantToUpdate.setProvince(r.getAllergy());
             }

            if (r.getZipcode() != null) {
                restaurantToUpdate.setZipcode(r.getZipcode());
             }

           if (r.getProvince() != null) {
                restaurantToUpdate.setProvince(r.getProvince());
             }

            Restaurant restaurant = this.restaurantRepository.save(restaurantToUpdate);
            return restaurant;
}

    @PutMapping("/user/review/{id}")
public DiningReview updateReview(@PathVariable("id") Long id, @RequestBody DiningReview dr) {

          Optional<DiningReview> reviewToUpdateOptional = this.diningReviewRepository.findById(id);

            if (!reviewToUpdateOptional.isPresent()) {
               return null;
            }

            // Since isPresent() was true, we can .get() the Person object out of the Optional
            DiningReview reviewToUpdate = reviewToUpdateOptional.get();

            // if (dr.getRestaurantName() != null) {
            //    reviewToUpdate.setRestaurantName(dr.getRestaurantName());
            // }
            if(dr.getOptionalPeanutScore() != null){
               reviewToUpdate.setOptionalPeanutScore(dr.getOptionalPeanutScore());
            }
            if (dr.getOptionalEggScore() != null) {
                reviewToUpdate.setOptionalEggScore(dr.getOptionalEggScore());
             }

            if (dr.getOptionalDairyScore() != null) {
                reviewToUpdate.setOptionalDairyScore(dr.getOptionalDairyScore());
             }

           if (dr.getCommentary() != null) {
                reviewToUpdate.setCommentary(dr.getCommentary());
             }

            DiningReview review = this.diningReviewRepository.save(reviewToUpdate);
            return review;
}




//delete methods
@DeleteMapping("/user/{id}")
public User deleteUser(@PathVariable("id") Long id) {
  Optional<User> userToDeleteOptional = this.userRepository.findById(id);
  if (!userToDeleteOptional.isPresent()) {
    return null;
  }
  User userToDelete = userToDeleteOptional.get();
  this.userRepository.delete(userToDelete);
  return userToDelete;
}

@DeleteMapping("/restaurant/{id}")
public Restaurant deleteRestaurant(@PathVariable("id") Long id) {
  Optional<Restaurant> restaurantToDeleteOptional = this.restaurantRepository.findById(id);
  if (!restaurantToDeleteOptional.isPresent()) {
    return null;
  }
  Restaurant restaurantToDelete = restaurantToDeleteOptional.get();
  this.restaurantRepository.delete(restaurantToDelete);
  return restaurantToDelete;
}

@DeleteMapping("/review/{id}")
public DiningReview deleteReview(@PathVariable("id") Long id) {
  Optional<DiningReview> reviewToDeleteOptional = this.diningReviewRepository.findById(id);
  if (!reviewToDeleteOptional.isPresent()) {
    return null;
  }
  DiningReview reviewToDelete = reviewToDeleteOptional.get();
  this.diningReviewRepository.delete(reviewToDelete);
  return reviewToDelete;
}



     @GetMapping("/helloworld")
     public String api(){
         return "Hello World!";
     }
    
}
