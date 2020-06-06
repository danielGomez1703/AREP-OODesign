/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.calculator.Imp;

import edu.escuelaing.arsw.container.LinkedListImp;
import edu.escuelaing.arsw.container.Node;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * @author danip
 */
public class Calculator {
   
    /**
     * Calcula la media de los datos recibidos
     * @param lk
     * @return  media de los datos
     */
    public Double media(List<Double> lk){
        Double med = 0.0;
        for (int i=0 ; i<lk.size(); i++){
            med+=lk.get(i);
        }
        return (med/lk.size());
    }
    
    /**
     * Calcula la desviacion de los datos ingresados
     * @param lk Datos ingresados
     * @return  desviacion estandar
     */
    public Double Desviacion (List<Double> lk){
        Double mean = media(lk);
        Double desv = 0.0;
        for (int i=0 ; i<lk.size(); i++){
            desv+=Math.pow(lk.get(i)- mean,2);
        }
        return Math.sqrt(desv/lk.size()-1);
    }
    
    static public Double StatOperation(List lk, EstadisticOp op ){
        return op.operation(lk);
    }
    
}
