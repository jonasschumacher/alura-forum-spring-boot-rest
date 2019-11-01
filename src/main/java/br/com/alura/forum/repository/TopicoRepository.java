package br.com.alura.forum.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);

	// Remover ambiguidade caso exista um parâmetro com
	// mesmo nome que o relacionamento da entidade.
	// O `_` siginifica um relacionamento.
	List<Topico> findByCurso_Nome(String nomeCurso);

	// Alternativa caso não queira seguir a formatação padrão do spring.
	@Query("SELECT t from Topico t WHERE t.curso.nome = :nomeCurso")
	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);

}
