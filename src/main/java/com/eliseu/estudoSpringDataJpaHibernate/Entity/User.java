package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String userName;

    // ForeingKey based
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    // SharedKey Based
//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
    private Address address;

    public User() {
    }

    public User(Long id, String userName, Address address) {
        this.id = id;
        this.userName = userName;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
