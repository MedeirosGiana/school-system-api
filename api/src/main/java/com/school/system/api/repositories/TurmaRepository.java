package com.school.system.api.repositories;

import com.school.system.api.entities.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma,Integer> {
}