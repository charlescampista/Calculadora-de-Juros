/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author charl
 */
public class EntidadeFinaceira {
    private double principal;
    private double valorFinal;
    private double permanencia;
    private String tipo;
    private double percentual;

    public EntidadeFinaceira(double principal, double permanencia, String tipo, double percentual) {
        
        this.principal = principal;
        this.permanencia = permanencia;
        this.tipo = tipo;
        this.percentual = percentual;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public double getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(double permanencia) {
        this.permanencia = permanencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    

    
    
    
    
    
    
}
