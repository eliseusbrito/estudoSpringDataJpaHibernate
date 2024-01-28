package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ITEMSBAELDUNG")
public class Itembaeldung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name= "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "cart_id", nullable = false)
    private Cart cart;

    // Hibernate requires no-args constructor
    public Itembaeldung() {
    }

    public Itembaeldung(Cart c) {
        this.cart = c;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
