package com.senai.vagasfrontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.senai.vagasfrontend.model.Vaga; // Importando a classe Vaga
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/vagas")
public class VagaController {

    private List<Vaga> vagas;

    public VagaController() {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream is = getClass().getResourceAsStream("/vagas-db.json")) {
            if (is == null) {
                throw new IOException("vagas-db.json not found");
            }
            this.vagas = Arrays.asList(mapper.readValue(is, Vaga[].class));
        } catch (IOException e) {
            e.printStackTrace();
            this.vagas = List.of(); // Empty list on error
        }
    }

    @GetMapping
    public String listarVagas(Model model) {
        model.addAttribute("vagas", vagas);
        return "lista-vagas";
    }

    @GetMapping("/{id}")
    public String detalheVaga(@PathVariable Long id, Model model) {
        Vaga vaga = vagas.stream()
                         .filter(v -> v.getId().equals(id))
                         .findFirst()
                         .orElse(null);
        model.addAttribute("vaga", vaga);
        return "detalhe-vaga";
    }
}

