import java.util.Scanner;

public class Codigo4 {
    public static void main(String[] args) { //Agregamos metodo Main

    //Scanner s = new Scanner(); //No estaba importada la java.util.Scanner, ni el sistem in
    Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Cambie el jugador por 1 o 2
    //Scanner s2 = new Scanner(); Escaner de más, no es necesario
    String j2 = s.nextLine();

    if (j1 == j2) { //La condicional tenia un parentesis de más
        System.out.println("Empate");
    } else {
        int g = 2;
        switch(j1) {
            case "piedra":
                if (j2 == "tijeras") {
                    g = 1;
                    System.out.println("Gano jugador 1");
                }

            case "papel":
                if (j2 == "piedra") {
                    g = 1;
                } //el condicional no tenia bien cerrada la llave

            case "tijera":
                        if (j2.equals("papel")) {
                            g = 2;
                        }
                        break;
                    default:
               // }
                System.out.println("Gana el jugador " + g);
        }


    }
    }

}
