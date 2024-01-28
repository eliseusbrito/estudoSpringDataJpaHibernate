package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Item;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.User;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.ItemRepository;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value= "/user", produces = "application/json")
public class UserController {

    private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<User> addDiretor(@RequestBody @Valid User user) {
        return ResponseEntity.ok().body(repository.save(user));
    }

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
