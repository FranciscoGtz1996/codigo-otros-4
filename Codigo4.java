import java.util.Scanner; //Importación java.yutil.Scanner

public class Codigo4 {
    /*
    * El programa hace lo siguiente:
    * Nos permite recrear el juego de piedras, papel o tijeras
      Datos de entrada:
       String de jugador 1: debe ser piedra, papel o tijeras.
       String de jugador 2: debe ser piedra, papel o tijeras.
      Datos de salida:
       Mensaje por consola mostrando qué jugador ganó.
    *
    * */
    public static void main(String[] args) { //Agregamos metodo Main

    //Scanner s = new Scanner(); //No estaba importada la java.util.Scanner, ni el sistem in
    Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Cambie el jugador por 1 o 2
    //Scanner s2 = new Scanner(); Escaner de más, no es necesario
    String j2 = s.nextLine();

   if (j1.equals(j2)) { //La condicional tenia un parentesis de más, se cambio el valor de la condicional por equals para que se comparen ambos string
        System.out.println("Empate");
    } else {
        int g = 2;
        switch(j1) {
            case "piedra":
                if (j2.equals("tijeras")) { //La comparación es con equals
                    g = 1;
                    System.out.println("Gano jugador 1"); //Agregue gano jugador 1
                }

            case "papel":
                if (j2.equals("piedra")) { //La comparación es con equals
                    g = 1;
                    System.out.println("Gano jugador 1"); //Agregue gano jugador 1
                } //el condicional no tenia bien cerrada la llave

            case "tijera":
                        if (j2.equals("papel")) { //La comparación es con equals
                            g = 2;
                            System.out.println("Gano jugador 1"); //Agregue gano jugador 1
                        }
                        break;
                    default:
               // }
                System.out.println("Gana el jugador " + g);
        }


    }
    }

}
