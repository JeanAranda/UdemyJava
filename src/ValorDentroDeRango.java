import java.util.Scanner;

public class ValorDentroDeRango {
    public static void main(String[] args) {
        //Definir las variables limites
        final int MINIMO = 0;
        final int MAXIMO = 5;
        //SOLICITAMOS UN VALOR ENTRE 0 Y 5
        var consola = new Scanner(System.in);
        System.out.print("Proporciona un dato entre 0 y 5: ");
        //Verificar si el valor esta dentro de rango
        var dato = Integer.parseInt(consola.nextLine());
        var dentroDeRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Valor dentro de rango? : "+dentroDeRango);
    }
}
