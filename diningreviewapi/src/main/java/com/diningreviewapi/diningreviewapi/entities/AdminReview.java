package com.diningreviewapi.diningreviewapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "ADMIN")
public class AdminReview {

  

   public AdminReview(){

   }
  
    public AdminReview(Long id, String username, DiningReview review, Boolean isReviewAccepted) {
    this.id = id;
    this.username = username;
    this.review = review;
    this.isReviewAccepted = isReviewAccepted;
}

   @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Username")
    private String username;

    @OneToOne
    @JoinColumn(name = "REVIEW_ID") // Use the actual column name in your database
    private DiningReview review;

    @Column(name = "isReviewAccepted")
    private Boolean isReviewAccepted;
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public DiningReview getReview() {
        return review;
    }

    public void setReview(DiningReview review) {
        this.review = review;
    }

    public Boolean getIsReviewAccepted() {
        return isReviewAccepted;
    }

    public void setIsReviewAccepted(Boolean isReviewAccepted) {
        this.isReviewAccepted = isReviewAccepted;
    }

   //@AllArgsConstructor

   
}
