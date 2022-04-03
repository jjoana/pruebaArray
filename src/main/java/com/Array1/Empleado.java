package com.Array1;

public class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //Metodo getter para nombre
    public String getNombre(){
        return nombre;
    }

    //Metodo setter para nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //Metodo getter para edad
    public int getEdad(){
        return edad;
    }

    //Metodo setter para edad
    public void setEdad(int edad){
        this.edad=edad;
    }

   public String toString(){
       return ("El nombre del empleado es: " + getNombre() + "La edad del empleado es: " + getEdad());
   }
}

