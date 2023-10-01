import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        System.out.println("Ingresa el primer dato: ");
        String aux = scanner.nextLine();

        System.out.println("Ingresa el segundo dato: ");
        String aux2 = scanner.nextLine();

        System.out.println("Ingresa el tercer dato: ");
        String aux3 = scanner.nextLine();

        if (aux.equals("") || aux2.equals("") || aux3.equals("")){
            System.out.println("Uno o más datos estan vacios");
        }else{
            if (aux.equalsIgnoreCase("Proceso") || aux.equalsIgnoreCase("Seleccion") ||
                    aux.equalsIgnoreCase("MercadoLibre")) {
                i++;
                System.out.println("Se encuentra que el primer dato contiene una palabra clave: "+ aux);
            }
            if (aux2.equalsIgnoreCase("Proceso") || aux2.equalsIgnoreCase("Seleccion") ||
                    aux2.equalsIgnoreCase("MercadoLibre")){
                i++;
                System.out.println("Se encuentra que el segundo dato contiene una palabra clave: "+ aux2);
            }
            if (aux3.equalsIgnoreCase("Proceso") || aux3.equalsIgnoreCase("Seleccion") ||
                    aux3.equalsIgnoreCase("MercadoLibre")){
                i++;
                System.out.println("Se encuentra que el tercer dato contiene una palabra clave: "+ aux3);
            }
            if (i == 0){
                System.out.println("Ninguna de las 3 variables contiene una palabra clave");
            }
        }
    }
}
