package com.andriosi.fabio.vendas.controller;

import com.andriosi.fabio.vendas.entity.Cliente;
import com.andriosi.fabio.vendas.session.ClienteFacade;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteFacade clienteFacade;
    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> findAll(){
        return new ResponseEntity<>(clienteFacade.findAll(), HttpStatus.OK );
    }
    @PostMapping("/clientes")
    public void addCliente(@RequestBody Cliente cliente){
        clienteFacade.create(cliente);
    }

    @DeleteMapping("/clientes")
    public void deleteClintes(@RequestBody Cliente cliente){
        clienteFacade.remove(cliente);
    }

    @PutMapping("/clientes")
    public void updateCliente(@RequestBody Cliente cliente){
        clienteFacade.edit(cliente);
    }
}
