package com.school.system.api.services;

import com.school.system.api.entities.Aluno;
import com.school.system.api.repositories.AlunoRepository;
import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public List<Aluno> findAll(){

        return repository.findAll();
    }

    public Aluno findById(Integer id){
       Optional <Aluno> obj = repository.findById(id);
       return obj.get();
    }

    public Aluno inserirAluno(Aluno aluno){
        Aluno inserir = repository.save(aluno);
        return inserir;
    }


}
