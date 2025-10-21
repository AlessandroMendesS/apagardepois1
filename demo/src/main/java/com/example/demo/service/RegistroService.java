package com.example.demo.service;

import com.example.demo.model.Registro;
import com.example.demo.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RegistroService {
    @Autowired
    private RegistroRepository registroRepository;

    public List<Registro> listarTodos() {
        return registroRepository.findAll();
    }

    public Registro salvar(Registro registro) {
        return registroRepository.save(registro);
    }

    public Optional<Registro> buscarPorId(Long id) {
        return registroRepository.findById(id);
    }

    public Registro atualizar(Long id, Registro registroNovo) {
        Registro registro = registroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));
        registro.setCampo1(registroNovo.getCampo1());
        registro.setCampo2(registroNovo.getCampo2());
        return registroRepository.save(registro);
    }

    public void deletar(Long id) {
        if (!registroRepository.existsById(id)) {
            throw new RuntimeException("Registro não encontrado");
        }
        registroRepository.deleteById(id);
    }
}
