package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Aluno;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.AlunoRepository;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.DisciplinaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/aluno", produces = "application/json")
public class AlunoController {

    private AlunoRepository repository;

    public AlunoController(AlunoRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Aluno> addAluno(@RequestBody @Valid Aluno aluno) {
        return ResponseEntity.ok().body(repository.save(aluno));
    }

    @GetMapping()
    public ResponseEntity<List<Aluno>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
