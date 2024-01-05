package com.diningreviewapi.diningreviewapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="RESTAURANT")
public class Restaurant {

    public Restaurant(){

    }
    public Restaurant(Long restaurant_id, String name, Double overallScore, String allergy, Integer zipcode, String province) {
        this.restaurant_id = restaurant_id;
        this.name = name;
        this.overallScore = overallScore;
        this.allergy = allergy;
        this.zipcode = zipcode;
        this.province = province;
    }


    //@AllArgsConstructor
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long restaurant_id;

    @Column(name = "Name")
    private String name;
    
    @Column(name = "Overall_Score")
    private Double overallScore;

    @Column(name = "Allergy")
    private String allergy;

    @Column(name = "Zipcode")
    private Integer zipcode;

    @Column (name = "Province")
    private String province;



    public Long getId() {
        return restaurant_id;
    }
    

    public void setId(Long restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(Double overallScore) {
        this.overallScore = overallScore;
    }

    public String getAllergy() {
        return allergy;
    }


    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public Integer getZipcode() {
        return zipcode;
    }


    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    
    public String getProvince() {
        return province;
    }


    public void setProvince(String province) {
        this.province = province;
    }

   //@Getter/@Setter



   
    
}
