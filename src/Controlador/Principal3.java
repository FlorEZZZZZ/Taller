/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Segundaria;
import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Principal3 {
    
       public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
           Segundaria sg = new Segundaria();
           
           System.out.println("Escriba la cantidad de productos a registrar: ");
           int cantProductos = sc.nextInt();
       
           sg.ejecicio3(cantProductos);
       } 
    
}
