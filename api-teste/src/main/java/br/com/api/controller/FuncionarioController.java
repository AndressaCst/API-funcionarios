package br.com.api.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import br.com.api.model.funcionarios;
import br.com.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository repository;

    @GetMapping
    public List<funcionarios> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<funcionarios> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public funcionarios adicionar(@RequestBody funcionarios funcionario) {
        return repository.save(funcionario);
    }

    @PutMapping("/{id}")
    public funcionarios atualizar(@PathVariable Long id, @RequestBody funcionarios funcionario) {
        funcionario.setId(id);
        return repository.save(funcionario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
