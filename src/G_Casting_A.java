public class G_Casting_A {
    public static void main(String[] args) {

        // En un año ubicar 30 perritos
        // Cuántos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESIMACIÓN
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);


        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

        //para que me muestre exactitud debemos castearlo desde el principio

        double r = (double) a/b;
        System.out.println("Ahora si es un double: "+r);

        char n = '1';
        int nI = n; // el int es mas grande que el char
        //en este caso no es necesario castear, ya que se hace
        // automaticamente

        System.out.println(nI);

        short nS =(short)  n; //acá es obligatorio castear explicitamnte

        System.out.println(nS);

    }
}
