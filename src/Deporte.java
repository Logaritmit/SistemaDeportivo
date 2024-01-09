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
    public int aptitud, aptitud1, aptitud2, aptitud3;





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
        aptitud = aptitud1 + aptitud2 + aptitud3;
        this.aptitud = aptitud;


        return true;
    }
}





