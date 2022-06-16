package com.calc.atividade.apicalculadora.Equacoes;

import org.springframework.stereotype.Service;
import com.calc.atividade.apicalculadora.model.Resultado;

@Service
public class Dividir {
    public Resultado dividindo(int a, int b){
        int div = a / b;
        return new Resultado(div);
    }
}
