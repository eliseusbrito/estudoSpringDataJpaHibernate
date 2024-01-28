package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Disciplina;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.DisciplinaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/disciplina", produces = "application/json")
public class DisciplinaController {

    private DisciplinaRepository repository;

    public DisciplinaController(DisciplinaRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Disciplina> addDiretor(@RequestBody @Valid Disciplina disciplina) {
        return ResponseEntity.ok().body(repository.save(disciplina));
    }

    @GetMapping()
    public ResponseEntity<List<Disciplina>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
