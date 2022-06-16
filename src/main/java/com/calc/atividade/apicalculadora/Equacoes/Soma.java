package com.calc.atividade.apicalculadora.Equacoes;

import org.springframework.stereotype.Service;
import com.calc.atividade.apicalculadora.model.Resultado;

@Service
public class Soma {
    public Resultado somando(int a, int b){
        int sum = a + b;
        return new Resultado(sum);
    }
}
