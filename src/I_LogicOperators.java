public class I_LogicOperators {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        //Estos son los operadores de asignacion
        System.out.println("a es = a b? -> " + (a == b));
        System.out.println("a es diferente a b? -> " + (a != b));

        //Y estos los operadores Relacionales
        System.out.println("a es meyor a b? -> " + (a > b));
        System.out.println("a es manor a b? -> " + (a < b));
        System.out.println("a es mayor o = a b? -> " + (a >= b));
        System.out.println("a es menor o = a b? -> " + (a <= b));

        if (a == b) {
            System.out.println("a es = a b?");

        } else if ((a != b) && (a < b)) {
            System.out.println("a es diferente a b?");

        } else if (a > b) {
            System.out.println("a es mayor a b?");


        } else if (a < b) {
            System.out.println("a es menor a b?");

        } else if (a >= b) {
            System.out.println("a es mayor o igual a b?");

        } else if (a <= b) {
            System.out.println("a es menor o igual a b?");
        }
    }
}
