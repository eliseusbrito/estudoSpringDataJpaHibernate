package com.eliseu.estudoSpringDataJpaHibernate.Repository;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
