/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.app;

/**
 *
 * @author rojas
 */
public class App {
    public static void main(String[] args){
    DataReader data = new DataReader();
    LinkedList lista = data.readFile("data.txt");
    Calculator operation = new Calculator(lista);
    System.out.printf("La media es: %.2f %n",operation.mean());
    System.out.printf("La desviacion estandar es: %.2f %n",operation.standarDeviation());
    }
    
}
