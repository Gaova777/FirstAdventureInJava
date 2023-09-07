public class b_updatingVariables {
    public static void main(String[] args) {
        //salario de 1000
        int salario = 1000;

        //aumento de $300;
        salario = salario + 300;
        System.out.println("a- salario: "+salario);

        salario = salario + (200*3) -45;
        System.out.println("b- salario: "+salario);

        salario+=200;
        System.out.println("c- salario "+salario);


        // Actualizar variables de tipo String:
        String employeeName = "Anahí ";
        employeeName = employeeName + "Salgado ";
        System.out.println(salario); // Anahí Salgado

        employeeName += "Díaz de la Vega ";
        System.out.println(employeeName); // Anahí Salgado Díaz de la Vega

        employeeName = "Irene " + employeeName;
        System.out.println(employeeName); // Irene Anahí Salgado Díaz de la Vega
    }
}
