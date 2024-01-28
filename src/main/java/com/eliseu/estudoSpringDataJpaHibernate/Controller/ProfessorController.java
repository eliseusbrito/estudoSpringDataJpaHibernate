package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Address;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.Professor;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.AddressRepository;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.ProfessorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/professor", produces = "application/json")
public class ProfessorController {

    private ProfessorRepository repository;

    public ProfessorController(ProfessorRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Professor> addDiretor(@RequestBody @Valid Professor professor) {
        return ResponseEntity.ok().body(repository.save(professor));
    }

    @GetMapping()
    public ResponseEntity<List<Professor>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
