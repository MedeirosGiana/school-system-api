package com.school.system.api.resources;

import com.school.system.api.entities.Aluno;
import com.school.system.api.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

    @Autowired
    private AlunoRepository repository;
    public ResponseEntity<Aluno> findAll(){
        Aluno aluno = new Aluno();
        return ResponseEntity.ok().body(aluno);
    }
}
