package br.com.mcv.Missao.Cristo.Volta.controllers;

import br.com.mcv.Missao.Cristo.Volta.domain.cadastro.MembroDto;
import br.com.mcv.Missao.Cristo.Volta.services.MembroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mcv/membros")
public class ConsultaMembroController {

    @Autowired
    private MembroServices services;

    @RequestMapping(value = "/consulta/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public MembroDto consultaMembroPorId(@PathVariable("id") Long id){
        return services.buscarMembroPorId(id);
    }

    @RequestMapping(value = "/consulta",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MembroDto> consultarMembros(){
        return services.buscarMembros();
    }
}
