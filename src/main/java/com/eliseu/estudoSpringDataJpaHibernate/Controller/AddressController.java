package com.eliseu.estudoSpringDataJpaHibernate.Controller;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Address;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.Tipo;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.AddressRepository;
import com.eliseu.estudoSpringDataJpaHibernate.Repository.TipoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/address", produces = "application/json")
public class AddressController {

    private AddressRepository repository;

    public AddressController(AddressRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public ResponseEntity<Address> addDiretor(@RequestBody @Valid Address address) {
        return ResponseEntity.ok().body(repository.save(address));
    }

    @GetMapping()
    public ResponseEntity<List<Address>> findAll() {
        return ResponseEntity.ok().body(repository.findAll());
    }

}
