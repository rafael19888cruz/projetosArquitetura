package com.calc.atividade.apicalculadora;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calc.atividade.apicalculadora.Equacoes.Dividir;
import com.calc.atividade.apicalculadora.Equacoes.Soma;
import com.calc.atividade.apicalculadora.model.Resultado;


@RestController("/app")
public class App {
   
@Autowired
private Soma soma;
private Dividir divi;

@GetMapping("/soma")
public Resultado somando(@RequestParam int a, @RequestParam int b){
    return soma.somando(a,b);
    }

@GetMapping("/dividir")
public Resultado dividindo(@RequestParam int a, @RequestParam int b){
    return divi.dividindo(a,b);
}
}
