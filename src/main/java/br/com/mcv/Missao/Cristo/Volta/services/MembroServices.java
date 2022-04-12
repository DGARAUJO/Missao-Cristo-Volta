package br.com.mcv.Missao.Cristo.Volta.services;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.*;
import br.com.mcv.Missao.Cristo.Volta.exception.ResourceNotFoundException;
import br.com.mcv.Missao.Cristo.Volta.repository.MembroRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroServices {

    @Autowired
    MembroRepository repository;

    public MembroDto buscarMembroPorId(Long id){
        return repository.findById(id).
                orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse ID!"));
    }

    public List<MembroDto> buscarMembros(){
        return repository.findAll();
    }

    public MembroDto createMembro(MembroDto membro){
        return repository.save(membro);
    }

    public MembroDto updateMembro(@NotNull MembroDto membro){

        MembroDto entity = repository.findById(membro.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse ID!"));

        entity.setDadosPessoais(new DadosPessoaisDto());
        entity.getDadosPessoais().setNomeCompleto(membro.getDadosPessoais().getNomeCompleto());
        entity.getDadosPessoais().setEmail(membro.getDadosPessoais().getEmail());

        entity.getDadosPessoais().setEndereco(new EnderecoDto());
        entity.getDadosPessoais().getEndereco().setLogradouro(membro.getDadosPessoais().getEndereco().getLogradouro());
        entity.getDadosPessoais().getEndereco().setNumero(membro.getDadosPessoais().getEndereco().getNumero());
        entity.getDadosPessoais().getEndereco().setComplemento(membro.getDadosPessoais().getEndereco().getComplemento());
        entity.getDadosPessoais().getEndereco().setCidade(membro.getDadosPessoais().getEndereco().getCidade());
        entity.getDadosPessoais().getEndereco().setEstado(membro.getDadosPessoais().getEndereco().getEstado());
        entity.getDadosPessoais().getEndereco().setPais(membro.getDadosPessoais().getEndereco().getPais());
        entity.getDadosPessoais().getEndereco().setCep(membro.getDadosPessoais().getEndereco().getCep());
        entity.getDadosPessoais().getEndereco().setPais(membro.getDadosPessoais().getEndereco().getPais());

        entity.getDadosPessoais().setTelefone(membro.getDadosPessoais().getTelefone());
        entity.getDadosPessoais().setDataNascimento(membro.getDadosPessoais().getDataNascimento());
        entity.getDadosPessoais().setEstadoCivil(membro.getDadosPessoais().getEstadoCivil());
        entity.getDadosPessoais().setRg(membro.getDadosPessoais().getRg());
        entity.getDadosPessoais().setCpf(membro.getDadosPessoais().getCpf());

        entity.setParentesco(new ParentescoDto());
        entity.getParentesco().setParentesco(membro.getParentesco().getParentesco());
        entity.getParentesco().setNome(membro.getParentesco().getNome());

        entity.setBatizado(membro.getBatizado());
        entity.setDataBatizado(membro.getDataBatizado());
        entity.setSituacaoAtual(membro.getSituacaoAtual());
        entity.setCategoria(membro.getCategoria());
        entity.setMinisterio(new MinisterioDto());
        entity.getMinisterio().setMinisterio(membro.getMinisterio().getMinisterio());
        entity.getMinisterio().setMinisterio(membro.getMinisterio().getFuncao());
        entity.setFaixaEtaria(membro.getFaixaEtaria());
        entity.setInformacoes(membro.getInformacoes());

        return repository.save(entity);
    }

    public void deleteMembro(Long id){
        MembroDto entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado para esse ID!"));
        repository.delete(entity);

    }
}
