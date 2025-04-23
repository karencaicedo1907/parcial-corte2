package com.corhuila.app_movil_g2.Service;

import com.corhuila.app_movil_g2.Entity.FechaHora;
import com.corhuila.app_movil_g2.IRepository.IBaseRepository;
import com.corhuila.app_movil_g2.IRepository.IFechaHoraRepository;
import com.corhuila.app_movil_g2.IService.IFechaHoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FechaHoraService extends ABaseService<FechaHora> implements IFechaHoraService {

    @Override
    protected IBaseRepository<FechaHora, Long> getRepository() {
        return fechaHoraRepository;
    }

    @Autowired
    private IFechaHoraRepository fechaHoraRepository;

}
