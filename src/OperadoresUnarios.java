public class OperadoresUnarios {
    public static void main(String[] args) {
        int a=3, b=-2, resultado=0;
        //Operador unario de valor negativo
        resultado = -a;
        System.out.println("-a = " + resultado);
        resultado = -b;
        System.out.println("-b = " + resultado);
        //Operador unario de incremento
        a=3;
        resultado = ++a; //Preincremento
        System.out.println("Preincremento de ++a = "+resultado);
        a=5;
        resultado = a++; //Post incremento
        System.out.println("a = " + resultado+" Linea ejecutada pero no Post incrementada");
        System.out.println("a = " + a+" Post incrementado");
        //Operador unario -- Pre decremento (decrementa en uno)
        b=-2;
        resultado=--b;
        System.out.println("Pre-decremento de --b = " + resultado);
        b=-3;
        resultado=b--;
        System.out.println("resultado de b-- = " + resultado);
        System.out.println("Post-decremento de b-- = " + b);
        //Negación ! (Invierte el valor logico)
        var c = true;
        var resultado2 = !c;
        System.out.println("Negación de !c = " + resultado2);
    }
}
