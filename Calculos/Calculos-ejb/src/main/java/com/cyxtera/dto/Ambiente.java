/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyxtera.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Se crea clase que define los atributos de los ambientes que cree el usuario.
 * @author jhon.lopez  
 */
public class Ambiente {
    
    private int id;
    private List<Double> operandos;

    public Ambiente(int id) {
        this.id = id;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Double> getOperandos() {
        if(operandos==null){
            operandos=new ArrayList<>();
        }
        return operandos;
    }

    

    
    
    
}
