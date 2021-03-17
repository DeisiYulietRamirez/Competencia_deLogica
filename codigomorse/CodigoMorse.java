package codigomorse;

import java.util.Scanner;

public class CodigoMorse{

    public static void main(String[] args) {
        Traductor ventana = new Traductor();
        
        Scanner entrada_texto = new Scanner(System.in);

            System.out.println("=> Ingrese la frase: ");
            String palabra = entrada_texto.nextLine();
            palabra = ventana.traducir(palabra);

            System.out.println(palabra);
            
            System.out.println("=> Si es codigo ingreselo aqui: ");
            String inverso = entrada_texto.nextLine();
            
            inverso = ventana.traducir_aLetra(inverso);

            System.out.println(inverso);
        
    }
                                    
}



    
    