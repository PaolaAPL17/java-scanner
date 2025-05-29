import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        System.out.println("Por favor, introduce tu nombre:");
        String firstName = scanner.nextLine();
        System.out.println();

        //2. Apellido
        System.out.println("Ahora, introduce tu apellido:");
        String lastName = scanner.nextLine();
        System.out.println();

        //3. Nombre de usuario
        System.out.println("Elige un nombre de usuario:");
        String username = scanner.nextLine();
        System.out.println();

        //4. Contraseña
        System.out.println("Finalmente, crea tu contraseña:");
        String password = scanner.nextLine();
        System.out.println();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("Hola " + firstName + " " + lastName + ", tu nombre de usuario es " + username + " y tu contraseña es " + password + ", gracias por registrarte.");
        System.out.println();

        scanner.close();
    }
}