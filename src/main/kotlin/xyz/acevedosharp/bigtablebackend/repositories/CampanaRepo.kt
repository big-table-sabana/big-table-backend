package xyz.acevedosharp.bigtablebackend.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import xyz.acevedosharp.bigtablebackend.entities.Campana

@Repository
interface CampanaRepo: JpaRepository<Campana, Int>