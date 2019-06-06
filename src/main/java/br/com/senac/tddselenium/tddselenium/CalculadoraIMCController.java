package br.com.senac.tddselenium.tddselenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class CalculadoraIMCController {

    CalculadoraIMCService calculadoraIMCService = new CalculadoraIMCService();

    @GetMapping("/")
    public String index(){
        return "calcularIMC";
    }

    @GetMapping("calcularIMC")
    public String calcularIMC(@RequestParam("peso") String peso, @RequestParam("altura")String altura, Model model){

        BigDecimal imc = calculadoraIMCService.calculaIMC(Double.parseDouble(peso), Double.parseDouble(altura));

        model.addAttribute("imc", imc.toString());

        return "calcularIMC";
    }
}
