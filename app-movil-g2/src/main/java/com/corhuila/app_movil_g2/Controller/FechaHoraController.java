package com.corhuila.app_movil_g2.Controller;

import com.corhuila.app_movil_g2.Entity.FechaHora;
import com.corhuila.app_movil_g2.IService.IClienteService;
import com.corhuila.app_movil_g2.IService.IFechaHoraService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8100"})

@RestController
@RequestMapping("/api/v1/fecha_hora")

public class FechaHoraController extends ABaseController<FechaHora, IFechaHoraService> {

    public FechaHoraController (IFechaHoraService service) {
        super(service, "Continent");
    }
}
