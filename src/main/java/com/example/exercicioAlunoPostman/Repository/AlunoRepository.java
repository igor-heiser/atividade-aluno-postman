package com.example.exercicioAlunoPostman.Repository;

import com.example.exercicioAlunoPostman.Model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}