package com.calc.atividade.apicalculadora.appController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calc.atividade.apicalculadora.Equacoes.Subtrair;
import com.calc.atividade.apicalculadora.model.Resultado;

@RestController
public class AppSub {
     
@Autowired
private Subtrair sub;

@GetMapping("/subtrair")
public Resultado subtraindo(@RequestParam int a, @RequestParam int b){
    return sub.subtraindo(a, b);
}
}
