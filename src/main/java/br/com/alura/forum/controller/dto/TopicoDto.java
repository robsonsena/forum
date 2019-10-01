package br.com.alura.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mesagem;
	private LocalDateTime dataCriacao;

	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mesagem = topico.getMensagem();
		this.dataCriacao = this.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMesagem() {
		return mesagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<TopicoDto> conveter(List<Topico> topicos) {
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList());
	}
	
	
	
	
}
