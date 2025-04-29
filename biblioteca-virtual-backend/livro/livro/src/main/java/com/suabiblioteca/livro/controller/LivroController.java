package com.suabiblioteca.livro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suabiblioteca.livro.dto.LivroDTO;
import com.suabiblioteca.livro.entity.Livro;
import com.suabiblioteca.livro.service.LivroService;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/livrosvirtual")

	public class LivroController {
		
		    @Autowired
		    private LivroService service;

		    @GetMapping
		    public List<Livro> listar() {
		        return service.listarTodos();
		    }

		    @PostMapping
		    public Livro adicionar(@RequestBody LivroDTO dto) {
		        return service.adicionar(dto);
		    }

		    @PutMapping("/{id}")
		    public Livro atualizar(@PathVariable Long id, @RequestBody LivroDTO dto) {
		        return service.atualizar(id, dto);
		    }

		    @DeleteMapping("/{id}")
		    public ResponseEntity<Void> deletar(@PathVariable Long id) {
		        service.deletar(id);
		        return ResponseEntity.noContent().build();
		    }
	
	}
