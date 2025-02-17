/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Segundaria {

    public void ejercicio1(int tamañoVector) {

        
        
        int min = 1; // Limite minimo del numero ramdon
        int max = 500; // Limite maximo del numero ramdon
        int numPares = 0; // Contador de los numeros pares
        int numImpares1 = 0; // Contador de los numeros impares del vector 1
        int numImpares2 = 0; // Contador de los numeros impares del vector 2
G
        int[] vector1 = new int[tamañoVector]; // Crear el vector numero 1
        int[] vector2 = new int[tamañoVector]; // Crear el vector numero 2
        
        
        for (int i = 0; i < tamañoVector; i++) { // Ciclo for para llenar los vectores con los numeros ramdon y se aplican los contadores

            vector1[i] = (int) (Math.random() * (max - min + 1)) + min;
            vector2[i] = (int) (Math.random() * (max - min + 1)) + min;

            if (vector1[i] % 2 == 0) {
                numPares++;
            }
            if (vector2[i] % 2 == 0) {
                numPares++;
            }
            if (vector1[i] % 2 != 0) {
                numImpares1++;
            }
            if (vector2[i] % 2 != 0) {
                numImpares2++;
            }
        }

        //  Salida
        
        System.out.println("\nLa cantidad de numeros pares en ambos vectores es de: " + numPares);

        if (numImpares1 > numImpares2) {

            System.out.println("\nEl vector 1 tiene más numeros impares que el vector 2.\nVector 1: " + numImpares1 + "\nVector 2: " + numImpares2);
        } else if (numImpares1 < numImpares2) {

            System.out.println("\nEl vector 2 tiene más numeros impares que el vector 1.\nVector 2: " + numImpares2 + "\nVector 1: " + numImpares1);
        } else {
            System.out.println("\nEl vector 1 tiene la misma cantidad de numeros impares que el vector 2.\nVector 1: " + numImpares1 + "\nVector 2: " + numImpares2);
        }

        int[] vectorOrganizado1 = Arrays.stream(vector1)
                .boxed() // Convierte el stream de int a Integer
                .sorted(Comparator.reverseOrder()) // Ordena el array orden descendente
                .mapToInt(Integer::intValue) // Convierte el stream de nuevo a int
                .toArray(); // Convierte el Stream de nuevo a un arreglo

        // Mostrar el arreglo ordenado
        System.out.println("\nVector 1 :");
        for (int num : vectorOrganizado1) {
            System.out.print(num + " ");
        }

        int[] vectorOrganizado2 = Arrays.stream(vector2)
                .boxed() // Convierte el stream de int a Integer
                .sorted(Comparator.reverseOrder()) // Ordena en orden descendente
                .mapToInt(Integer::intValue) // Convierte el stream de nuevo a int
                .toArray();

        // Mostrar el arreglo ordenado
        System.out.println("\nVector 2 :");
        for (int num : vectorOrganizado2) {
            System.out.print(num + " ");
        }

    }

    public void Ejercicio2(int tamañoVector) {
        
        

        String[] nombres = new String[tamañoVector];
        int posicion = 0;
        String nombre = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < tamañoVector; i++) {

            System.out.println("Escriba el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();

            if (i == 0) {
                nombre = nombres[i];
            } else if (nombres[i].length() > nombre.length()) {
                nombre = nombres[i];
                posicion = i;
            }
                no
        }

        System.out.println("El nombre con mas caracteres es: " + nombre + "\nPosicion: " + (posicion + 1));

    }

    public void ejecicio3(int cantProductos) {

        double[] precios = new double[cantProductos];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < cantProductos; i++) {

            System.out.println("Producto " + i + ": ");

            precios[i] = sc.nextInt();
            if (precios[i] > 55000) {
                precios[i] = precios[i] - (precios[i] * 0.10);
            } else if (precios[i] <= 55000 && precios[i] > 0) {
                precios[i] = precios[i] - (precios[i] * 0.05);
            }

        }

        System.out.println("Vector Final");

        for (double precio : precios) {
            System.out.println(precio);
        }

    }
}
