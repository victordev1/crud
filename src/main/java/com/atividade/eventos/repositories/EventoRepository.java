package com.atividade.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}
