package com.school.system.api.repositories;

import com.school.system.api.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno,Integer> {
}
