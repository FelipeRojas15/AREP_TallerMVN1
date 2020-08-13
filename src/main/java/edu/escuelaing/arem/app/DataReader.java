/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.escuelaing.arem.app;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
        

/**
 *
 * @author rojas
 */
public class DataReader {
    /**
     * Method to read the node file
     * @param archivo
     * @return lista LinkedList
     */
    public LinkedList readFile(String archivo){
        LinkedList lista = null;
        try{
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            lista= new LinkedList();
            String bfLector;
            while ((bfLector = lector.readLine())!= null){
                lista.addNode(Float.parseFloat(bfLector));    
            }
            lector.close();
                    
        }catch(Exception e){
            System.err.println("Direccion de archivo equivocada");
        } 
        return lista;
    
    }
    
}
