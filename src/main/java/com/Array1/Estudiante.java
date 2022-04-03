package com.Array1;


public class Estudiante extends Empleado {
    private String carrera;
    private int curso;

    public Estudiante(String nombre, int edad, String carrera, int curso){
        super(nombre,edad);
        this.carrera = carrera;
        this.curso=curso;
    }
        //Metodo getter para carrera
        public String getCarrera(){
            return carrera;
    }

        //Metodo setter para nombre
        public void setCarrera(String carrera){
            this.carrera = carrera;
    }

        //Metodo getter para altura
        public int getcurso(){
            return curso;
    }

        //Metodo setter para altura
        public void setCurso(int curso){
            this.curso = curso;
    }

    public String toString(){
        return ("El nombre del estudiante es: " + getNombre() + "La edad del estudiante es: " + getEdad() +
        "La carrera del estudiante es: " + carrera + "El curso que esta el estudiante es: " + curso);
    }


}
