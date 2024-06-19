public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a=true, b=false;
        //Operador and && (regresa true si ambos son true)
        var resultado = a&&b;
        System.out.println("resultado de a && b = " + resultado);
        //Operador OR || (regresa si cualquiera es verdadero)
        resultado = a || b;
        System.out.println("resultado de a || b = " + resultado);
        //Operador not ! (invierte el varlo logico con el que se trabaja)
        resultado = !a;
        System.out.println("resultado de !a = " + resultado);
    }
}
