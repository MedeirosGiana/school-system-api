package com.school.system.api.repositories;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TurmaRepository extends JpaRepository<Turma,Integer> {
}
