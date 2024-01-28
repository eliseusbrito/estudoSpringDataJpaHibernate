package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name= "tipo")
public class Tipo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToOne(mappedBy = "tipo")
    private Item item;

    public Tipo() {
    }

    public Tipo(Long id, String descricao, Item item) {
        this.id = id;
        this.descricao = descricao;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

}
