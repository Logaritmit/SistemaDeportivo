

import java.util.Scanner;

class Deportista {
    private String nombre;
    private int edad;

    public Deportista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}

class Disciplina {
    private String nombre;
    public int aptitud1, aptitud2, aptitud3;
    public int sanciones=0;
    public String examenes= "Y";





    public Disciplina(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean evaluarAptitud(Deportista participante) {
        this.aptitud1 = aptitud1;
        this.aptitud2 = aptitud2;
        this.aptitud3 = aptitud3;
        if (sanciones !=0){
            return false;
        }
        if (examenes != "Y"){
            return false;
        }



        return true;
    }
}


