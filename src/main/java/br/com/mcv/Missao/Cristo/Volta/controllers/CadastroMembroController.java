package br.com.mcv.Missao.Cristo.Volta.controllers;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.MembroDto;
import br.com.mcv.Missao.Cristo.Volta.services.MembroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mcv/membros")
public class CadastroMembroController {

    @Autowired
    private MembroServices services;

    @RequestMapping(value = "/create",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public MembroDto cadastroMembro(@RequestBody MembroDto membro){
        return services.createMembro(membro);
    }

    @RequestMapping(value = "/update",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public MembroDto atualizacaoMembro(@RequestBody MembroDto membro){
        return services.updateMembro(membro);
    }

    @RequestMapping(value = "/delete/{id}",
            method = RequestMethod.DELETE)
    public void deleteMembro(@PathVariable("id") Long id){
        services.deleteMembro(id);
    }
}
