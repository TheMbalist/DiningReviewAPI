package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name="RESTAURANT")
public class Restaurant {

   // @AllArgsConstructor
 

    @Id
    @GeneratedValue
    private Long id;

   
    @Column(name = "Name")
    private String name;
    
    @Column(name = "Overall_Score")
    private Double overallScore;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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




   //@Getter/@Setter



   
    
}
