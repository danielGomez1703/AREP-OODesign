/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.calculator.Imp;

import edu.escuelaing.arsw.calculator.io.FileReader;
import edu.escuelaing.arsw.container.LinkedListImp;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author danip
 */
public class CalculatorMain {

    public static void main(String[] args) {
        String filePath = args[0];
        FileReader r = new FileReader();

        Calculator calculator = new Calculator();
        List datos = r.ReadFile(filePath);
        
        // interfaz funcional 
        
        // operation with function 
        EstadisticOp media = (d) -> calculator.media(d);
        // operation with 
        EstadisticOp desviacion = (d) -> {
            Double mean = Calculator.StatOperation(d, media);
            Double desv = 0.0;
            for (int i = 0; i < d.size(); i++) {
                desv += Math.pow(d.get(i) - mean, 2);
            }
            return Math.sqrt(desv /(d.size()-1));
        };

        Double mean = calculator.StatOperation(datos, media);
        Double desv = calculator.StatOperation(datos, desviacion);
        System.out.println("la media de los datos es : " + mean);
        System.out.println("la desviacion estandar de los datos es :" + desv);

    }

}
