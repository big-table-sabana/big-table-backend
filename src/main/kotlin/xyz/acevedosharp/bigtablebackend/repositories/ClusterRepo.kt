package xyz.acevedosharp.bigtablebackend.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import xyz.acevedosharp.bigtablebackend.entities.Cluster

@Repository
interface ClusterRepo: JpaRepository<Cluster, Int>