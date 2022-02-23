/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiSuhu;

/**
 *
 * @author muham
 */
public class OperasiKonversi {
    double celcius;
    
    public OperasiKonversi(double celcius) {
        this.celcius = celcius;
    }
    
    double reamur(){
        return((4*celcius)/5);
    }
    
    double fahrenheit(){
        return((9*celcius)/5+32);
    }
    
    double kelvin(){
        return(celcius+273.15);
    }
    
    String kondisiAir(){
        if (celcius <=0) {
            return "beku.";
        }else if(celcius>=100) {
            return "mendidih.";
        }else return "normal.";
    }
}
