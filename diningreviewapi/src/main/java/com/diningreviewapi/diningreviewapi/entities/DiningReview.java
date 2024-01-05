package com.diningreviewapi.diningreviewapi.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "DININGREVIEW")
public class DiningReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "USER_ID") // Use the actual column name in your database
    private User user;

    @OneToOne
    @JoinColumn(name = "RESTAURANT_ID") // Use the actual column name in your database
    private Restaurant restaurant;

    @Column(name = "Peanut_Score")
    private Double optionalPeanutScore;

    @Column(name = "Egg_Score")
    private Double optionalEggScore;

    @Column(name = "Dairy_Score")
    private Double optionalDairyScore;

    @Column(name = "Commentary")
    private String commentary;

    @Column(name = "Status")
    private Integer status;

    // Constructors, getters, setters

    public DiningReview() {
        // Default constructor required by JPA
    }

    public DiningReview(Long id, User user, Restaurant restaurant, Double optionalPeanutScore, Double optionalEggScore,
            Double optionalDairyScore, String commentary, Integer status) {
        this.id = id;
        this.user = user;
        this.restaurant = restaurant;
        this.optionalPeanutScore = optionalPeanutScore;
        this.optionalEggScore = optionalEggScore;
        this.optionalDairyScore = optionalDairyScore;
        this.commentary = commentary;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

  
   
    // Getters and setters
  
}
