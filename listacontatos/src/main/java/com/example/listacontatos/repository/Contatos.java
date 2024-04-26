package com.example.listacontatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.listacontatos.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long>{
    
}
