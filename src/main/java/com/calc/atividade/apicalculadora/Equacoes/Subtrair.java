package com.calc.atividade.apicalculadora.Equacoes;

import org.springframework.stereotype.Service;
import com.calc.atividade.apicalculadora.model.Resultado;

@Service
public class Subtrair {
    public Resultado subtraindo(int a, int b){
        int sub = a - b;
        return new Resultado(sub);
    }
}
