package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

    
    public User(Long id, String username, String city, String province, Integer zipcode,
            Boolean isInterestedInPeanutAllergy, Boolean isInterestedInEggAllergy, Boolean isInterestedInDairyAllergy) {
        this.id = id;
        this.username = username;
        this.city = city;
        this.province = province;
        this.zipcode = zipcode;
        this.isInterestedInPeanutAllergy = isInterestedInPeanutAllergy;
        this.isInterestedInEggAllergy = isInterestedInEggAllergy;
        this.isInterestedInDairyAllergy = isInterestedInDairyAllergy;
    }


    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "City")
    private String city;

    @Column(name = "Province")
    private String province;

    @Column(name = "Zipcode")
    private Integer zipcode;

    @Column(name = "isInterestedInPeanutAllergy")
    private Boolean isInterestedInPeanutAllergy;

    @Column(name = "isInterestedInEggAllergy")
    private Boolean isInterestedInEggAllergy;

    @Column(name = "isInterestedInDairyAllergy")
    private Boolean isInterestedInDairyAllergy;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Boolean getIsInterestedInPeanutAllergy() {
        return isInterestedInPeanutAllergy;
    }

    public void setIsInterestedInPeanutAllergy(Boolean isInterestedInPeanutAllergy) {
        this.isInterestedInPeanutAllergy = isInterestedInPeanutAllergy;
    }

    public Boolean getIsInterestedInEggAllergy() {
        return isInterestedInEggAllergy;
    }

    public void setIsInterestedInEggAllergy(Boolean isInterestedInEggAllergy) {
        this.isInterestedInEggAllergy = isInterestedInEggAllergy;
    }

    public Boolean getIsInterestedInDairyAllergy() {
        return isInterestedInDairyAllergy;
    }

    public void setIsInterestedInDairyAllergy(Boolean isInterestedInDairyAllergy) {
        this.isInterestedInDairyAllergy = isInterestedInDairyAllergy;
    }

    //@Getter/@Setter



}
