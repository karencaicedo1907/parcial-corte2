package com.corhuila.app_movil_g2.Controller;

import com.corhuila.app_movil_g2.Entity.Mesa;
import com.corhuila.app_movil_g2.IService.IMesaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:8100"})

@RestController
@RequestMapping("/api/v1/mesa")
public class MesaController extends ABaseController<Mesa, IMesaService> {

    public MesaController (IMesaService service) {
        super(service, "Continent");
    }
}
