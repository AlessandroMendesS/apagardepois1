package com.exemplo.crud;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UsuarioController {

    private final UsuarioRepository repo;

    public UsuarioController(UsuarioRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String listar(Model model) {
        model.addAttribute("usuarios", repo.findAll());
        return "lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvar(Usuario usuario) {
        repo.save(usuario);
        return "redirect:/";
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}
