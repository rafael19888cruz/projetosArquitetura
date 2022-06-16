package com.calc.atividade.apicalculadora.Equacoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.calc.atividade.apicalculadora.model.Resultado;

public class DividirTest {
   
@Test
public void Adddivi(){

Dividir divi = new Dividir();

Resultado resultado = divi.dividindo(12, 3);

assertEquals(resultado.getResultado(),4);
}
}