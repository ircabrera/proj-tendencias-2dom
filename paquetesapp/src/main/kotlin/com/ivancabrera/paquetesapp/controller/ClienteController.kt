package com.ivancabrera.paquetesapp.controller

import com.ivancabrera.paquetesapp.model.Cliente
import com.ivancabrera.paquetesapp.service.ClienteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT])

class ClienteController {

    @Autowired
    lateinit var nombreService: ClienteService

    @GetMapping
    fun list(): List<Cliente>{
        return nombreService.list()
    }

    @PostMapping
    fun save(@RequestBody cliente:Cliente): Cliente{
        return nombreService.save(cliente)
    }

    @PutMapping
    fun update (@RequestBody cliente:  Cliente):Cliente{
        return nombreService.update(cliente)
    }

    @DeleteMapping("/delete/{id}")
    fun delete (@PathVariable("id") id: Long):Boolean{
        return nombreService.delete(id)
    }
}