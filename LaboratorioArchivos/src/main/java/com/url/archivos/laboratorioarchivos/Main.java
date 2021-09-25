/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.url.archivos.laboratorioarchivos;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisg
 */



public class Main {

    /**
     * @param args the command line arguments
     */
   private void escribirArchivo (String nombre, String edad, String telefono){
        try{
            FileWriter escritorArchivo = new FileWriter("Agenda1.txt");

            escritorArchivo.write(nombre + "&");
            escritorArchivo.write(edad + "&");
            escritorArchivo.write(telefono + "&");

            escritorArchivo.close();

        }catch(IOException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
     private void escrituraBinariaT (String Nombre, String Edad, String Telefono){
        try{
            FileWriter escritorArchivo = new FileWriter("AgendaDatos.txt");

            int n = Nombre.length();
            int e = Edad.length();
            int t = Telefono.length();
            //Nombre
            if(n==30){
                escritorArchivo.write(Nombre);
            }
            else if(n<30){
                String nombre="";
                for(int i = n; i < 30; i++){
                    nombre = nombre + "0";
                }
                escritorArchivo.write(Nombre+nombre);
            }
            else{
                //System.out.println("El nombre no puede ser mayor a 30 caracteres");
            }
            //Edad
             if(e==2){
                escritorArchivo.write(Edad);
            }
            else if(n<2){
                String nuevo="";
                for(int i = n; i < 2; i++){
                    nuevo = nuevo + "0";
                }
                escritorArchivo.write(Edad+nuevo);
            }
            else{
                //System.out.println("La edad no puede ser mayor a 2 caracteres");
            }
            //phone
            if(t==8){
                escritorArchivo.write(Telefono);
            }
            else if(n<2){
                String nuevo="";
                for(int i = n; i < 8; i++){
                    nuevo = nuevo + "0";
                }
                escritorArchivo.write(Telefono+nuevo);
            }
            else{
               // System.out.println("El telefono no puede ser mayor a 8 caracteres");
            }
 
            escritorArchivo.close();

       }catch(FileNotFoundException ex){
             Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
              
            Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }
    
    public static void main(String[] args) {
         Main main = new Main();
        Scanner ingresar = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        String n, t, e;
    
        
            System.out.println("------------------");
            System.out.println("Ingrese el nombre Completo: ");
            n = opcion.nextLine();
            System.out.println("Ingrese la edad: ");
            e = ingresar.nextLine();
            System.out.println("Ingrese el número de teléfono");
            t = ingresar.next();
        
                main.escribirArchivo(n, e, t);
            main.escrituraBinariaT(n, e, t);
        
          
        
        
    }
    
}
