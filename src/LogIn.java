import java.util.Scanner;
public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una contraseña, si son iguales a los datos dados imprimirá en terminal: Acceso concedido, si no son iguales imprimirá en terminal: Nombre de usuario o contraseña incorrecta.
        //Averigua como hacer para poder ingresar el dato justo al lado de lo que termine la pregunta, es decir, que no haga un salto de línea.
        Scanner userLogin = new Scanner(System.in);
        System.out.println("rellena los campos para acceder a tu cuenta");
        System.out.print("nombre de usuario:");
        String username = userLogin.nextLine();

        System.out.print("contraseña:");
        String password = userLogin.nextLine();


        if (username.equals("cristinitaJava") && password.equals("misupercontraseña123"))
        {
            System.out.println("acceso concedido");

        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }


        userLogin.close();
    }
}
