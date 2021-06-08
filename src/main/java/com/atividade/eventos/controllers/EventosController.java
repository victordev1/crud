package com.atividade.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atividade.eventos.models.Evento;
import com.atividade.eventos.repositories.EventoRepository;

@Controller
public class EventosController {

	@Autowired
	private EventoRepository er;

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@PostMapping("/eventos")
	public String adicionar(Evento evento) {

		System.out.println(evento);
		er.save(evento);

		return "evento-adicionado";
	}

}
