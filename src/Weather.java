import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        Scanner weather = new Scanner(System.in);
        System.out.println("Por favor, indica los grados celcius de tu ciudad");
         Byte celcius = Byte.valueOf(weather.next());
        if (celcius < 0 ){
            System.out.println("Te estás congelando");
        } else if (celcius >= 0 && celcius <= 10) {
            System.out.println("Hace mucho frío");
        } else if (celcius >= 11 && celcius <= 17){
            System.out.println("Con un abrigo estás bien");
        } else if (celcius >= 18 && celcius <= 25){
            System.out.println("Parece que ha llegado el verano");
        } else if (celcius >= 26 && celcius <= 35){
            System.out.println("Qué calooorrrrr");
        } else if (celcius >36){
                System.out.println("Ahí no hay quien viva");
        }
        weather.close();
        //Escribe un programa que pida al usuario que ingrese la temperatura en celcius de su ciudad (La pregunta y la respuesta deberá estar en una sola línea) y según ello devuelva lo siguiente:
        //Si es bajo 0: Te estás congelando
        //Si es entre 0 y 10: Hace mucho frío 
        //Si es entre 11 y 17: Con un abrigo estás bien
        //Si es entre 18 y 25: Parece que ha llegado el verano
        //Si es entre 26 y 35: Que calooorrrrr
        //Si es mayor a 36: Ahí no hay quien viva

        //Imprime el resultado
    }
}