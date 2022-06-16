package com.calc.atividade.apicalculadora.Equacoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.calc.atividade.apicalculadora.model.Resultado;

public class SomaTest {
   
@Test
public void AddSoma(){

Soma soma = new Soma();

Resultado resultado = soma.somando(2, 3);

assertEquals(resultado.getResultado(),5);
}
}
