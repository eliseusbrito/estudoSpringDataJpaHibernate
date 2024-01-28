package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Cart;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.Itembaeldung;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.CartRepository;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.ItembaeldungRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/itembaeldung", produces = "application/json")
public class ItembaeldungController {

    private ItembaeldungRepository repository;

    public ItembaeldungController(ItembaeldungRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Itembaeldung> addDiretor(@RequestBody @Valid Itembaeldung itembaeldung) {
        return ResponseEntity.ok().body(repository.save(itembaeldung));
    }

    @GetMapping()
    public ResponseEntity<List<Itembaeldung>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
