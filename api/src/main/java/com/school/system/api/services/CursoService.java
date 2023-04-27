package com.school.system.api.services;


import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Curso;
import com.school.system.api.repositories.CursoRepository;
import com.school.system.api.resources.CursoResource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    private CursoRepository repository;

    public List<Curso> findAll(){ //método para retornar todos os cursos do banco de dados

        return repository.findAll();
    }

    public Curso findById(Integer id){//método para retornar  os cursos do banco de dados por id
        Optional<Curso> obj = repository.findById(id);
        return obj.get();
    }
}
