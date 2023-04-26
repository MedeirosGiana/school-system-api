package com.school.system.api.resources;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Turma;
import com.school.system.api.services.TurmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/turmas")
public class TurmaResource {
    @Autowired
    private TurmaService service;

    @GetMapping
    public ResponseEntity<List<Turma>> findAll(){
        List<Turma> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Turma> findById(@PathVariable Integer id){
        Turma obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
