package com.corhuila.app_movil_g2.Service;

import com.corhuila.app_movil_g2.Entity.Cliente;
import com.corhuila.app_movil_g2.IRepository.IBaseRepository;
import com.corhuila.app_movil_g2.IRepository.IClienteRepository;
import com.corhuila.app_movil_g2.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends ABaseService<Cliente> implements IClienteService {

    @Override
    protected IBaseRepository<Cliente, Long> getRepository() {
        return clienteRepository;
    }

    @Autowired
    private IClienteRepository clienteRepository;

}
