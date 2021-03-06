package xyz.acevedosharp.bigtablebackend.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import xyz.acevedosharp.bigtablebackend.entities.Colaborador

@Repository
interface ColaboradorRepo: JpaRepository<Colaborador, Int> {
    fun findByCedulaEquals(cedula: String): Colaborador?
}