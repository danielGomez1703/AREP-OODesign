/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.calculator.Imp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author danip
 */
public class CalculatorTest {
    
     private final String Ftest1 = "resources/test1.txt";
     private final String Ftest2 = "resources/test2.txt";
     
     @Test
     public void testMediafile1(){
         String[] args = {Ftest1};
         try{
             CalculatorMain.main(args);
         }catch(Exception e){
             e.printStackTrace();
         }
     }
     
      @Test
     public void testMediafile2(){
         String[] args = {Ftest2};
         try{
             CalculatorMain.main(args);
         }catch(Exception e){
             e.printStackTrace();
         }
     }
    
}
