package com.br.gestafesta2.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.br.gestafesta2.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}