package com.school.system.api.resources;


import com.school.system.api.entities.Curso;
import com.school.system.api.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
    @Autowired
    private CursoService service;

    @GetMapping
    public ResponseEntity<List<Curso>> findAll(){
        List<Curso> listCurso = service.findAll();
        return ResponseEntity.ok().body(listCurso);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<Curso> findById(@PathVariable Integer id){
        Curso obj = service.findById(id);
        return  ResponseEntity.ok().body(obj);
    }
}
