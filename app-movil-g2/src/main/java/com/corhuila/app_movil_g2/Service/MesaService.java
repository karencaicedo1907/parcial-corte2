package com.corhuila.app_movil_g2.Service;

import com.corhuila.app_movil_g2.Entity.Mesa;
import com.corhuila.app_movil_g2.IRepository.IBaseRepository;
import com.corhuila.app_movil_g2.IRepository.IMesaRepository;
import com.corhuila.app_movil_g2.IService.IMesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaService extends ABaseService<Mesa> implements IMesaService {

    @Override
    protected IBaseRepository<Mesa, Long> getRepository() {
        return mesaRepository;
    }

    @Autowired
    private IMesaRepository mesaRepository;
}

