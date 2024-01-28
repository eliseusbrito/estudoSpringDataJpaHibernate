package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "titulacao")
    private String titulacao;

    @JsonIgnore
    @OneToMany(mappedBy = "professor")
    private List<Disciplina> disciplinaList = new ArrayList<>();

    public Professor() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void setDisciplinaList(List<Disciplina> disciplinaList) {
        this.disciplinaList = disciplinaList;
    }

}
