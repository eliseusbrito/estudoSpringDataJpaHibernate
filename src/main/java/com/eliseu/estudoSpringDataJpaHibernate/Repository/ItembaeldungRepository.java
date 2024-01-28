package com.eliseu.estudoSpringDataJpaHibernate.Repository;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Cart;
import com.eliseu.estudoSpringDataJpaHibernate.Entity.Itembaeldung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItembaeldungRepository extends JpaRepository<Itembaeldung, Long> {
}
