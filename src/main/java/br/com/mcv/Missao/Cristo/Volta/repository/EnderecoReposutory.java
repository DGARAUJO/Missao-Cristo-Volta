package br.com.mcv.Missao.Cristo.Volta.repository;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.EnderecoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoReposutory extends JpaRepository<EnderecoDto, String> {
}
