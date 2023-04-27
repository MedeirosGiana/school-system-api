package com.school.system.api.config;

import com.school.system.api.entities.Aluno;
import com.school.system.api.entities.Curso;
import com.school.system.api.entities.Turma;
import com.school.system.api.repositories.AlunoRepository;
import com.school.system.api.repositories.CursoRepository;
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
    private CursoRepository cursoRepository;
    @Autowired
    private TurmaRepository turmaRepository;
    @Override
    public void run(String... args) throws Exception {
        Curso curso1 = new Curso(null,"Ciencias de Dados",1500,12.000,7.0);
        Curso curso2 = new Curso(null,"Contabilidade",1400,15.000,7.0);
        Curso curso3 = new Curso(null,"Engenharia",2000,24.000,7.0);
        Curso curso4 = new Curso(null,"Recursos Humanos",1500,16.000,7.0);


        Turma t1 = new Turma(null,1,80,Instant.parse("2019-05-20T15:20:07Z"),curso3);
        Turma t2 = new Turma(null,2,60,Instant.parse("2019-06-05T19:53:07Z"),curso1);
        Turma t3 = new Turma(null,3,50,Instant.parse("2019-06-25T19:53:07Z"),curso3);
        Turma t4 = new Turma(null,4,40,Instant.parse("2019-07-20T19:53:07Z"),curso2);
        Turma t5 = new Turma(null,5,40,Instant.parse("2019-08-20T19:53:07Z"),curso1);
        Turma t6 = new Turma(null,6,50,Instant.parse("2019-09-20T19:53:07Z"),curso1);


        Aluno a1= new Aluno(null,"Joao Pedros","221445212222","joao@gmail.com",t1);
        Aluno a2= new Aluno(null,"Maria Rosa","11100011122","maria@gmail.com",t2);
        Aluno a3= new Aluno(null,"Joao Pedros","221445212222","joao@gmail.com",t5);
        Aluno a4= new Aluno(null,"Maria Rosa","11100011122","maria@gmail.com",t4);



        cursoRepository.saveAll(Arrays.asList(curso1,curso2,curso3,curso4));
        turmaRepository.saveAll(Arrays.asList(t1,t2,t3,t4,t5,t6));
        alunoRepository.saveAll(Arrays.asList(a1,a2,a3,a4));

    }
}
