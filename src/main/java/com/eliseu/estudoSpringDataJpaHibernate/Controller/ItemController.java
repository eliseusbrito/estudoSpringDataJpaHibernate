package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Item;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.ItemRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value= "/item", produces = "application/json")
public class ItemController {

    private ItemRepository repository;

    public ItemController(ItemRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Item> addDiretor(@RequestBody @Valid Item item) {
        return ResponseEntity.ok().body(repository.save(item));
    }

    @GetMapping()
    public ResponseEntity<List<Item>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
