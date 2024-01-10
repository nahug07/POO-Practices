package com.mycompany.poo;

public class POO {

    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5, "Horacio", "Pagani");
        
        System.out.println("Id del alumno2 es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
        alu1.setId(8);
        alu1.setNombre("Marta");
        alu1.setApellido("Sanchez");
        
        System.out.println("-------------------------");
        System.out.println("Id del alumno1 es: " + alu1.getId());
        System.out.println("El nombre es: " + alu1.getNombre());
        System.out.println("El apellido es: " + alu1.getApellido());
        
        alu2.setId(35);
        
        System.out.println("-------------------------");
        System.out.println("Id del alumno2 modificada es: " + alu2.getId());
        System.out.println("El nombre es: " + alu2.getNombre());
        System.out.println("El apellido es: " + alu2.getApellido());
        
    }
}
