package com.example.demo.model;

import jakarta.persistence.*;

/**
 * Modelo genérico pronto para ser renomeado. Basta trocar 'Registro' e os
 * campos.
 */
@Entity
@Table(name = "registro")
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String campo1;

    @Column(nullable = false, length = 100)
    private String campo2;

    public Registro() {
    }

    public Registro(String campo1, String campo2) {
        this.campo1 = campo1;
        this.campo2 = campo2;
    }

    public Long getId() {
        return id;
    }

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }
}
