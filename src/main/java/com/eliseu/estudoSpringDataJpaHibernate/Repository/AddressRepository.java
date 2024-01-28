package com.eliseu.estudoSpringDataJpaHibernate.Repository;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
