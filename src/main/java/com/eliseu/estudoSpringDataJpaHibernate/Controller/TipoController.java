package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Tipo;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.TipoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/tipo", produces = "application/json")
public class TipoController {

    private TipoRepository repository;

    public TipoController(TipoRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Tipo> addDiretor(@RequestBody @Valid Tipo tipo) {
        return ResponseEntity.ok().body(repository.save(tipo));
    }

    @GetMapping()
    public ResponseEntity<List<Tipo>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
