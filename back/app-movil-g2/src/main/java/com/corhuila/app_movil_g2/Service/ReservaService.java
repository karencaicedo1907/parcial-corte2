package com.corhuila.app_movil_g2.Service;

import com.corhuila.app_movil_g2.Entity.Reserva;
import com.corhuila.app_movil_g2.IRepository.IBaseRepository;
import com.corhuila.app_movil_g2.IRepository.IReservaRepository;
import com.corhuila.app_movil_g2.IService.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservaService extends ABaseService<Reserva> implements IReservaService {

    @Override
    protected IBaseRepository<Reserva, Long> getRepository() {
        return reservaRepository;
    }

    @Autowired
    private IReservaRepository reservaRepository;
}
