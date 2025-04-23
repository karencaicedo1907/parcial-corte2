package com.corhuila.app_movil_g2.Controller;

import com.corhuila.app_movil_g2.Entity.Cliente;
import com.corhuila.app_movil_g2.IService.IClienteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8100"})

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController extends ABaseController<Cliente, IClienteService> {

    public ClienteController (IClienteService service) {
        super(service, "Continent");
    }
}
