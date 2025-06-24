package com.projeto.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projeto.sistema.models.Estado;
import com.projeto.sistema.repositorys.estadoRepository;

@Controller
public class estadoController {

    @Autowired
    private estadoRepository estadoRepository;

    @GetMapping("/cadastroEstado")
    public ModelAndView cadastrar(Estado estado) {
        ModelAndView mv = new ModelAndView("administrativo/estados/cadastroEstado");
        mv.addObject("estado", estado);
        return mv;
    }

    @PostMapping("/salvarEstado")
    public ModelAndView salvar(Estado estado, BindingResult result) {
        if (result.hasErrors()) {
            return cadastrar(estado);
        }

        estadoRepository.saveAndFlush(estado);
        return cadastrar(new Estado());
    }
}
