package com.eliseu.estudoSpringDataJpaHibernate.Repository;

import com.eliseu.estudoSpringDataJpaHibernate.Entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
