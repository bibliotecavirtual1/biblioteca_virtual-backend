package com.suabiblioteca.livro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suabiblioteca.livro.dto.LivroDTO;
import com.suabiblioteca.livro.entity.Livro;
import com.suabiblioteca.livro.repository.LivroRepository;

@Service
public class LivroService {
	@Autowired
    private LivroRepository repository;

    public List<Livro> listarTodos() {
        return repository.findAll();
    }

    public Livro adicionar(LivroDTO dto) {
        Livro livro = new Livro();
        livro.setTitulo(dto.getTitulo());
        livro.setAutor(dto.getAutor());
        livro.setDescricao(dto.getDescricao());
        livro.setGenero(dto.getGenero());
        return repository.save(livro);
    }

    public Livro atualizar(Long id, LivroDTO dto) {
        Livro livro = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Livro não encontrado"));
        livro.setTitulo(dto.getTitulo());
        livro.setAutor(dto.getAutor());
        livro.setDescricao(dto.getDescricao());
        livro.setGenero(dto.getGenero());
        return repository.save(livro);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
	}
