package com.school.system.api.services;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Turma;
import com.school.system.api.repositories.AlunoRepository;
import com.school.system.api.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {
    @Autowired
    private TurmaRepository repository;

    public List<Turma> findAll(){ //método para retornar todos os alunos do banco de dados

        return repository.findAll();
    }

    public Turma findById(Integer id){//método para retornar  os alunos do banco de dados por id
        Optional<Turma> obj = repository.findById(id);
        return obj.get();
    }

}
