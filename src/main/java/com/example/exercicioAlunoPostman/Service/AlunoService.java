package com.example.exercicioAlunoPostman.Service;

import com.example.exercicioAlunoPostman.Model.Aluno;
import com.example.exercicioAlunoPostman.Repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;

    public List<Aluno> listar() {
        return repository.findAll();
    }

    public Aluno buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public Aluno salvar(Aluno aluno) {
        return repository.save(aluno);
    }

    public Aluno atualizar(Long id, Aluno novoAluno) {

        Aluno aluno = buscarPorId(id);
        aluno.setNome(novoAluno.getNome());
        aluno.setCurso(novoAluno.getCurso());
        aluno.setMatricula(novoAluno.getMatricula());

        return repository.save(aluno);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}