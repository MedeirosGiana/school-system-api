package com.school.system.api.resources;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Avaliacao;
import com.school.system.api.entities.Curso;
import com.school.system.api.services.AlunoService;
import com.school.system.api.services.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping(value = "/avaliacoes")
public class AvaliacaoResource {

        @Autowired
        private AvaliacaoService service;


        @GetMapping()
        public List<Avaliacao> listar() {
              Avaliacao avaliacao = new Avaliacao();
              return Arrays.asList();
        }
}

