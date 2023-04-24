package com.school.system.api.config;

import com.school.system.api.entities.Aluno;
import com.school.system.api.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void run(String... args) throws Exception {
        Aluno aluno1 = new Aluno(null,"Joao","12345678910","joao@gmail.com");
        Aluno aluno2 = new Aluno(null,"Maria","23456789101","maria@gmail.com");

        alunoRepository.saveAll(Arrays.asList(aluno1,aluno2));
    }
}
