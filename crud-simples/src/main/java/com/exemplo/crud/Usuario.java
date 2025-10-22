package com.exemplo.crud;

import jakarta.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    // PARA ADICIONAR MAIS CAMPOS:
    // private String email;
    // public String getEmail() { return email; }
    // public void setEmail(String email) { this.email = email; }
    // Depois adicione o campo no form.html e na lista.html
}
