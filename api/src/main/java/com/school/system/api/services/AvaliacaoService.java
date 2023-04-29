package com.school.system.api.services;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Avaliacao;
import com.school.system.api.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository repository;


    public Avaliacao findById(Integer id){
        Optional<Avaliacao> obj = repository.findById(id);
        return obj.get();
    }


}
