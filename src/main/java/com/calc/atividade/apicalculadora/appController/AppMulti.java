package com.calc.atividade.apicalculadora.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calc.atividade.apicalculadora.Equacoes.Multiplica;
import com.calc.atividade.apicalculadora.model.Resultado;

@RestController
public class AppMulti {
    
    @Autowired
    private Multiplica multi;

    @GetMapping("/multiplica")
    public Resultado multiplicando(@RequestParam int a, @RequestParam int b){
        return multi.multiplicando(a,b);
    }
}
