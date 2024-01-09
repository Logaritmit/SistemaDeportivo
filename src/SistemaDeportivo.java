import java.util.Scanner;

public class SistemaDeportivo {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre del participante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad del participante: ");
            int edad = scanner.nextInt();

            Deportista participante = new Deportista(nombre, edad);

            System.out.print("Ingrese el nombre de la disciplina: ");
            String nombreDisciplina = scanner.next();


            System.out.print("Del 1 al 10 que tanto le gusta este deporte: ");
            int aptitud1Disciplina = scanner.nextInt();

            System.out.print("Del 1 al 10 que tan bueno es en este deporte: ");
            int aptitud2Disciplina = scanner.nextInt();

            System.out.print("Del 1 al 10 que tanto le gustaria practicar este deporte: ");
            int aptitud3Disciplina = scanner.nextInt();







            Disciplina disciplina = new Disciplina(nombreDisciplina);

            if (!participante.esMayorDeEdad()) {
                System.out.println("El participante no cumple con la mayoría de edad.");
                return;
            }

            if (!disciplina.evaluarAptitud(participante)) {
                System.out.println("El participante no cumple con los requisitos de aptitud en la disciplina.");
                return;
            }



            System.out.println("El participante ha sido aceptado en el registro.");

        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());

        }

    }
}