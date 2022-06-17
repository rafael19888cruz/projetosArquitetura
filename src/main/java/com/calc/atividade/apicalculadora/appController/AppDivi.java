package com.calc.atividade.apicalculadora.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calc.atividade.apicalculadora.Equacoes.Dividir;
import com.calc.atividade.apicalculadora.model.Resultado;


@RestController
public class AppDivi {
    
    @Autowired
    public Dividir divi;

    @GetMapping("/dividir")
public Resultado dividindo(@RequestParam int a, @RequestParam int b){
    if( a == 0 || b == 0){
        System.out.println("Dividisão por 0 por pode ser feita");
    }
    return divi.dividindo(a,b);
}
}
