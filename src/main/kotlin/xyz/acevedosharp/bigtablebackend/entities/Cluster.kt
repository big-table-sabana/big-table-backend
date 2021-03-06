package xyz.acevedosharp.bigtablebackend.entities

import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "cluster", schema = "cjbijqp1eiscr4cu")
class Cluster(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        val id: Int?,

        @Column(name = "latitud_centroide")
        val latitudCentroide: Double,

        @Column(name = "longitud_centroide")
        val longitudCentroide: Double,

        @Column(name = "poblacion")
        val poblacion: Int,

        @Column(name = "campanas_participadas")
        val campanasParticipadas: Int,

        @Column(name = "fecha_ultima_campana")
        val fechaUltimaCampana: Timestamp
)