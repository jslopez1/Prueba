/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cyxtera.bean;

import javax.ejb.Local;

/**
 *
 * @author usuario
 */
@Local
public interface AmbientesBeanLocal {
    public int obtenerNuevoAmbiente();
    public  Boolean agregarOperando(int id,Double operando);
    public Double obtenerResultado (int id,String operacion);
     
             
}
