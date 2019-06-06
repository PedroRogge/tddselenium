package br.com.senac.tddselenium.tddselenium;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TddseleniumApplicationTests {

	CalculadoraIMCService calculadoraIMCService = new CalculadoraIMCService();

	@Test
	public void consegueCalcularIMC() {
		double peso = 100;
		double altura = 1.80;

		Assert.assertEquals(new BigDecimal(30.86).setScale(2, RoundingMode.HALF_UP), calculadoraIMCService.calculaIMC(peso, altura));
	}

}
