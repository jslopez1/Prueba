package com.cyxtera.impl;

import com.cyxtera.bean.AmbientesBeanLocal;
import com.cyxtera.dto.Ambiente;
import com.cyxtera.enums.EnumOperacion;
import com.cyxtera.util.OperacionUtil;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

/**
 * Bean de sesion que administra los ambientes.
 * @author jhon.lopez
 */
@Stateful
public class AmbientesBean implements AmbientesBeanLocal {

   private List<Ambiente> ambientes;
   private int id=0;
   /**
    * Permite generar un nuevo ambiente para realizar operaciones.
    * @return 
    */
   @Override
   public int obtenerNuevoAmbiente(){
       id=id+1;
       if(ambientes==null){
           ambientes=new ArrayList<>();
       }
       Ambiente nuevoAmbiente=new Ambiente(id);
       ambientes.add(nuevoAmbiente);
       return id;
   }
   /**
    * Permite agregar un operando a un ambiente especificado.
    * @param id
    * @param operando
    * @return 
    */
   @Override
   public  Boolean agregarOperando(int id,Double operando){
       Ambiente ambiente=buscarAmbiente(id);
       if(ambiente!=null){
           ambiente.getOperandos().add(operando);
           return Boolean.TRUE;
       }else{
           return Boolean.FALSE;
       }
   }
   @Override
   public Double obtenerResultado (int id,String operacion){
       Ambiente ambiente=buscarAmbiente(id);
       Double resultado;
       if(ambiente==null){
           return null;
       }
       switch(EnumOperacion.valueOf(operacion)){
           case SUMA:
               resultado=OperacionUtil.sumar(ambiente.getOperandos());
               break;
           case RESTA:
               resultado=OperacionUtil.restar(ambiente.getOperandos());
                break;
           case MULTIPLICACION:
               resultado=OperacionUtil.multiplicar(ambiente.getOperandos());
                break;
           case DIVISION:
               resultado=OperacionUtil.dividir(ambiente.getOperandos());
                break;
           default:
               return null;

       }
       ambiente.getOperandos().add(resultado);
       return resultado;
   }
   
   
   /**
    * Permite buscar un ambiente en el listado de ambientes.
    * @param idAmbiente
    * @return 
    */
   
   private  Ambiente buscarAmbiente(int idAmbiente){
        if(ambientes==null){
            return null;
        }
        for (int i = 0; i < ambientes.size(); i++) {
            Ambiente ambiente=ambientes.get(i);
            if(ambiente.getId()==idAmbiente){
                return ambiente;
            }
        }
        return null;
    }
   
   
   
}
