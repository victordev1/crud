package com.atividade.eventos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.eventos.models.Convidado;
import com.atividade.eventos.models.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
	
	List<Convidado> findByEvento(Evento evento);

}
