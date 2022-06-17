package com.calc.atividade.apicalculadora.Equacoes;

import org.springframework.stereotype.Service;
import com.calc.atividade.apicalculadora.model.Resultado;

@Service
public class Multiplica {
    public Resultado multiplicando(int a, int b){
        int mult = a * b;
        return new Resultado(mult);
    }
}
