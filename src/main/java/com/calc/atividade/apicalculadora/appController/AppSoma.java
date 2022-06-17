package com.calc.atividade.apicalculadora.appController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.calc.atividade.apicalculadora.Equacoes.Soma;
import com.calc.atividade.apicalculadora.model.Resultado;


@RestController
public class AppSoma {
   
@Autowired
public Soma soma;


@GetMapping("/soma")
public Resultado somando(@RequestParam int a, @RequestParam int b){
    return soma.somando(a,b);
    }


}
