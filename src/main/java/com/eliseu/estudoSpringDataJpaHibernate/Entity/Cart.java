package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private long id;

    @Column(name = "total")
    private double total;

    @OneToMany(mappedBy = "cart")
    private Set<Itembaeldung> items;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<Itembaeldung> getItems() {
        return items;
    }

    public void setItems(Set<Itembaeldung> items) {
        this.items = items;
    }

}
