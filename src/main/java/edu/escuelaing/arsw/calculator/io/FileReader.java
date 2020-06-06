/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arsw.calculator.io;

import edu.escuelaing.arsw.container.LinkedListImp;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author danip
 */
public class FileReader 
{
    public LinkedListImp <Double> ReadFile (String filePath){
        LinkedListImp <Double> lk = new LinkedListImp <Double>();
        BufferedReader reader;
	try {
            reader = new BufferedReader (new java.io.FileReader(filePath));
            String linea = reader.readLine();
            while (linea != null) {
                Double val = Double.parseDouble(linea);
                lk.add(val);
                linea = reader.readLine();
                ;               
            }
            reader.close();
        
	} catch (IOException e) {
            e.printStackTrace();
	}
     return lk;
    }
}
