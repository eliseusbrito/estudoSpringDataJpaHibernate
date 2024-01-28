package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String nome;

    private Long idade;

    @ManyToMany(mappedBy = "alunoList")
    private List<Disciplina> disciplinaList;

    public Aluno() {
    }

    public Aluno(Long id, String nome, Long idade, List<Disciplina> disciplinaList) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.disciplinaList = disciplinaList;
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

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    public List<Disciplina> getDisciplinaList() {
        return disciplinaList;
    }

    public void setDisciplinaList(List<Disciplina> disciplinaList) {
        this.disciplinaList = disciplinaList;
    }

}
