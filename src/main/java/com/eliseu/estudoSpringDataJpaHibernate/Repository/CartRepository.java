package com.eliseu.estudoSpringDataJpaHibernate.Repository;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Address;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
