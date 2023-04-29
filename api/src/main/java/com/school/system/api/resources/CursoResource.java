package com.school.system.api.resources;


import com.school.system.api.entities.Curso;
import com.school.system.api.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
    @Autowired
    private CursoService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Curso>> findAll(){
        List<Curso> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Curso> finById(@PathVariable Integer id){
        Curso obj= service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
