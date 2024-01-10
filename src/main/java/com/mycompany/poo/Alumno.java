package com.mycompany.poo;

public class Alumno {
    
    //Atributos
    int id;
    String nombre;
    String apellido;
    
    //Constructores

    public Alumno() {
        
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Métodos
    public void mostrarNombre() {
        System.out.println("Hola, soy un alumno y se decirt mi nombre");
    }
    
    public void saberAprobado(double calificacion) {
        if(calificacion >= 6) {
            System.out.println("Estoy aprobado");
        } else {
            System.out.println("Estoy desaprobado");
        }
    }
    
}
