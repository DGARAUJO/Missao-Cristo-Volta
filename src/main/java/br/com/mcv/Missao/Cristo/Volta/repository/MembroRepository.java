package br.com.mcv.Missao.Cristo.Volta.repository;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.MembroDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembroDto,Long> {

}
