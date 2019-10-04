package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends  JpaRepository<Topico, Long> {

	List<Topico> findByCurso_Nome(String nomeCurso);
	
	@Query("Select t from Topico t where t.curso.nome = :nomeCurso ")
	List<Topico> carregarNomeDoCurso(@Param("nomeCurso") String nomeCurso);

}
