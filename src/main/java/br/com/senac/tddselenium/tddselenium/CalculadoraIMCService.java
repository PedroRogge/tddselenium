package br.com.senac.tddselenium.tddselenium;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraIMCService {

    public BigDecimal calculaIMC(double peso, double altura) {
        return new BigDecimal(peso / (altura * altura)).setScale(2, RoundingMode.FLOOR);
    }
}
