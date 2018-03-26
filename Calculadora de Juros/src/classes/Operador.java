/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.text.DecimalFormat;

/**
 *
 * @author charl
 */
public class Operador {
    
    private double tratarPercentual(double percentual){
        return (percentual/100)+1;
    }
    
    public Double calcularJuros(EntidadeFinaceira entidadeFinaceira){
           
        double principal = entidadeFinaceira.getPrincipal();
        double percentual = tratarPercentual(entidadeFinaceira.getPercentual());
        double permanencia = entidadeFinaceira.getPermanencia();
        
        Double valorFinal = principal * Math.pow(percentual,permanencia);
        
        return valorFinal;
    }
    
    
}
