package com.ivancabrera.paquetesapp.repository

import com.ivancabrera.paquetesapp.model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository:JpaRepository<Cliente,Long> {
}