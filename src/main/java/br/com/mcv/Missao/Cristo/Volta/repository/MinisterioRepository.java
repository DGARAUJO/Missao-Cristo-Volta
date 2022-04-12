package br.com.mcv.Missao.Cristo.Volta.repository;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.MinisterioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinisterioRepository extends JpaRepository<MinisterioDto,Integer> {
}
