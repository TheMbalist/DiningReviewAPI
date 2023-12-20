package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "DININGREVIEW")
public class DiningReview {

    private Long id;

    private User username;
    private Restaurant restaurant;

    private Double optionalPeanutScore;
    
    private Double optionalEggScore;

    
    private Double optionalDairyScore;

    private String commentary;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Double getOptionalPeanutScore() {
        return optionalPeanutScore;
    }

    public void setOptionalPeanutScore(Double optionalPeanutScore) {
        this.optionalPeanutScore = optionalPeanutScore;
    }

    public Double getOptionalEggScore() {
        return optionalEggScore;
    }

    public void setOptionalEggScore(Double optionalEggScore) {
        this.optionalEggScore = optionalEggScore;
    }

    public Double getOptionalDairyScore() {
        return optionalDairyScore;
    }

    public void setOptionalDairyScore(Double optionalDairyScore) {
        this.optionalDairyScore = optionalDairyScore;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   // @Getter/@Setter

}
