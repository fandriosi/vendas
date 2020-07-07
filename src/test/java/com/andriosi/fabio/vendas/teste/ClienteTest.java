package com.andriosi.fabio.vendas.teste;

import com.andriosi.fabio.vendas.entity.Cliente;
import com.andriosi.fabio.vendas.session.ClienteFacade;

public class ClienteTest {
 //   @Test
    public void insertCliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Gisele");
        new ClienteFacade().create(cliente);
    }
 //   @Test
    public void findAll(){
        new ClienteFacade().findAll().stream().forEach(item ->{
            System.out.println("id "+ item.getId());
            System.out.println("Nome "+ item.getNome());
        });
    }
}
