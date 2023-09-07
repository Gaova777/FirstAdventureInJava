public class c_naming {
    public static void main(String[] args) {
        int celphone = 33337777;
        int celPhone = 55553333;
        //las dos anteriores son variabels totalmente diferente

        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "Spain";
        String _backgroundColor = "Green";
        // estas son formas de colocar nombre a las variables

        String currency$ = "MXN";
        String background_color = "BLUE";
        //y acá tambien vemos como tambien se podrían colocar

        int POSITION = -5;
        int MAX_WIDTH = 9999;
        final int MIN_WIDTH = 1; // este es para variables incambiables
    }
}
