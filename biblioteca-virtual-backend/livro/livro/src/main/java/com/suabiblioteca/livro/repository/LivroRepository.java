package com.suabiblioteca.livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suabiblioteca.livro.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
