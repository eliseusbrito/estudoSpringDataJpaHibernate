package com.eliseu.estudoSpringDataJpaHibernate.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "semestre")
    private Long semestre;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToMany
    @JoinTable(name = "disciplina_aluno",
            joinColumns = @JoinColumn(name = "disciplina_fk"),
            inverseJoinColumns = @JoinColumn(name = "aluno_fk"))
    private List<Aluno> alunoList;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, Long semestre, Professor professor) {
        this.id = id;
        this.nome = nome;
        this.semestre = semestre;
        this.professor = professor;
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

    public Long getSemestre() {
        return semestre;
    }

    public void setSemestre(Long semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

}
