package com.school.system.api.resources;

import com.school.system.api.entities.Aluno;
import com.school.system.api.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

    @Autowired
    private AlunoService service;

    @GetMapping
    public ResponseEntity<List<Aluno>> findAll(){
        List<Aluno> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Aluno> findById(@PathVariable Integer id){
        Aluno obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public Aluno cadastrarAluno (@RequestBody Aluno aluno){
        Aluno cadastrar = service.inserirAluno(aluno);
        return cadastrar;
    }

}

