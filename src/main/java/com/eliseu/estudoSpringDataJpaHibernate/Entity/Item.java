package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @OneToOne
    @JoinColumn(name= "tipo_id")
    private Tipo tipo;

    public Item() {
    }

    public Item(Long id, String descricao, Tipo tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }



}
