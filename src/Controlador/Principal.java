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
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Segundaria sg = new Segundaria();

        System.out.print("Digite el tamaño para los dos vectores: ");
        int tamañoVector = sc.nextInt();
        
        
        sg.ejercicio1(tamañoVector);
    }
}
