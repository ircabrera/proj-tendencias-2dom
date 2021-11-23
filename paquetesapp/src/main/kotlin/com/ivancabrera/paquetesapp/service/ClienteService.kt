package com.ivancabrera.paquetesapp.service

import com.ivancabrera.paquetesapp.model.Cliente
import com.ivancabrera.paquetesapp.repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody

@Service
class ClienteService {
    @Autowired
    lateinit var clienteRepository: ClienteRepository


    fun list(): List<Cliente> {

        return clienteRepository.findAll()
    }

    fun save(@RequestBody cliente:Cliente): Cliente{
        return clienteRepository.save(cliente)
    }

    fun update(cliente: Cliente):Cliente{
        return clienteRepository.save(cliente)
    }

    fun delete (id:Long): Boolean{
        clienteRepository.deleteById(id)
        return true
    }

}