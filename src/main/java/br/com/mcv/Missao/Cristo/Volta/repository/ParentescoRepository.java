package br.com.mcv.Missao.Cristo.Volta.repository;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.ParentescoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentescoRepository extends JpaRepository<ParentescoDto, String> {
}
