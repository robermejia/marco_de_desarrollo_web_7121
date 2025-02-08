package com.robermejia.spar_spring.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "inquilinos")
public class Inquilino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinquilinos")
    private Integer id;
    @Column(nullable = false, unique = true)
    private String dni;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String paterno;
    @Column(nullable = false)
    private String materno;
    @Column(nullable = false)
    private String correo;
    @Column
    private String telefono;
    @Column(nullable = false)
    private BigDecimal deuda;
    @Column(name = "fecha_ingreso", nullable = false)
    private LocalDate fechaIngreso;
}