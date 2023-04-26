package com.school.system.api.config;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Turma;
import com.school.system.api.repositories.AlunoRepository;
import com.school.system.api.repositories.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private AlunoRepository alunoRepository;
    @Autowired
    private TurmaRepository turmaRepository;

    @Override
    public void run(String... args) throws Exception {
        Aluno a1= new Aluno(null,"Joao Pedros","221445212222","joao@gmail.com");
        Aluno a2= new Aluno(null,"Maria Rosaa","11100011122","maria@gmail.com");

        Turma t1 = new Turma(null,1,50,Instant.parse("2019-06-20T19:53:07Z"));
        Turma t2 = new Turma(null,1,60,Instant.parse("2019-06-20T19:53:07Z"));
        Turma t3 = new Turma(null,1,50,Instant.parse("2019-06-20T19:53:07Z"));
        alunoRepository.saveAll(Arrays.asList(a1,a2));
        turmaRepository.saveAll(Arrays.asList(t1,t2,t3));
    }
}
