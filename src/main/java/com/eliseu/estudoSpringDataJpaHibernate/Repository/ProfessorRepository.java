package com.eliseu.estudoSpringDataJpaHibernate.Repository;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
