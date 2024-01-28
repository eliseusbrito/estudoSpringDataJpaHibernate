package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    // ForeingKey based
    @JsonIgnore
    @OneToOne(mappedBy = "address")
    // SharedKey Based
//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "user_id")
    private User user;

    public Address() {
    }

    public Address(Long id, String street, String city, User user) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}