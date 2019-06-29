
package com.cyxtera.util;

import java.util.List;

/**
 *
 * @author jhon.lopez
 */
public class OperacionUtil {
    public static Double sumar(List<Double> operandos){
        Double resultado=0d;
        if(operandos==null){
            return null;
        }
        for (int i = 0; i < operandos.size(); i++) {
            if(i==0){
                resultado=operandos.get(i)+operandos.get(i+1);
            }else{
                resultado=resultado+operandos.get(i+1);
            }
        }
        return resultado;
    }
    
    public static Double multiplicar(List<Double> operandos){
        Double resultado=0d;
        if(operandos==null){
            return null;
        }
        for (int i = 0; i < operandos.size(); i++) {
            if(i==0){
                resultado=operandos.get(i)*operandos.get(i+1);
            }else{
                resultado=resultado+operandos.get(i+1);
            }
        }
        return resultado;
    }
    public static  Double dividir(List<Double> operandos){
        Double resultado=0d;
        if(operandos==null){
            return null;
        }
        for (int i = 0; i < operandos.size(); i++) {
            if(i==0){
                resultado=operandos.get(i)/operandos.get(i+1);
            }else{
                resultado=resultado+operandos.get(i+1);
            }
        }
        return resultado;
    }
    public static  Double restar(List<Double> operandos){
        Double resultado=0d;
        if(operandos==null){
            return null;
        }
        for (int i = 0; i < operandos.size(); i++) {
            if(i==0){
                resultado=operandos.get(i)-operandos.get(i+1);
            }else{
                resultado=resultado+operandos.get(i+1);
            }
        }
        return resultado;
    }
}
