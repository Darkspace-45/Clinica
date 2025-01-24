package com.clinica.form.Controlador;

import com.clinica.form.Entidad.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class PacienteControlador {

    @GetMapping("/formularioC")
    public String mostrarFormulario(Model model) {
        Paciente paciente = new Paciente();
        List<String> estadosCiviles = Arrays.asList("Soltero", "Casado", "Divorciado", "Viudo");
        model.addAttribute("paciente", new Paciente());

        model.addAttribute("estadosCiviles", estadosCiviles);
        model.addAttribute("paciente", paciente);
        return "Clinica/formulario";
    }

    @PostMapping("/enviarDatos")
    public String enviarFormulario(@Valid @ModelAttribute Paciente paciente, BindingResult bindingResult, Model model) {
            return "Clinica/registroExitoso";
    }
}