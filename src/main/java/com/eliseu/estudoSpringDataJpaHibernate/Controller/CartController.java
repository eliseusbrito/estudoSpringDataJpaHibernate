package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Address;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.Cart;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.AddressRepository;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.CartRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/cart", produces = "application/json")
public class CartController {

    private CartRepository repository;

    public CartController(CartRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Cart> addDiretor(@RequestBody @Valid Cart cart) {
        return ResponseEntity.ok().body(repository.save(cart));
    }

    @GetMapping()
    public ResponseEntity<List<Cart>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
