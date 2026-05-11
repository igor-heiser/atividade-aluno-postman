package com.example.exercicioAlunoPostman.Controller;

import com.example.exercicioAlunoPostman.Model.Aluno;
import com.example.exercicioAlunoPostman.Service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @GetMapping
    public List<Aluno> listar() {

        return service.listar();
    }

    @GetMapping("/{id}")
    public Aluno buscarPorId(@PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {

        return service.salvar(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno aluno) {

        return service.atualizar(id, aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {

        service.excluir(id);
        return ResponseEntity.noContent().build();

    }
}