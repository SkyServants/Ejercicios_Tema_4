public class Main {
    public static void main(String[] args) {

        //EJERCICIOS TEMA 4:
        //Practica de las estructuras de control

        //1, Uso de if (Comparacion  si el numero es positivo, negativo o cero e imprimir)
        int numeroif = -10;

        if(numeroif < 0)
        {
            System.out.println("1, El número usado es Negativo");
        }else if (numeroif > 0)
        {
            System.out.println("1, El número usado es Positivo ");
        } else
        {
            System.out.println("1, El número usado es 0 ");
        }


        //2, Uso de bucle while la variable numeroWhile < 3

        int numeroWhile = 0;

        while(numeroWhile < 3)
        {
            numeroWhile++;

            System.out.println("La variable numeroWhile vale" + " "+ numeroWhile );
        }

        //3, Uso de bucle Do while misma estructura anterior pero con una sola ejecusion.

        numeroWhile = 3; // Lo reescribí pero en relalidad este valor es el mismo que tiene la variable con el ejercio anterior
        do{

            numeroWhile++;

        }
        while(numeroWhile < 3);
        {
            System.out.println("La variable numeroWhile vale" + " "+ numeroWhile + ""+" en el Do While" );
        }



        //4, Bucle for
        int numeroFor = 0; //Se crea antes, despues la igualo a i para que se peuda usar fuera del for.

        for(int i = 0; i <= 3; i++){

            numeroFor = i;
            System.out.println("Valor de la variable numeroFor = " + numeroFor);

        }


        //5, Switch
        var estacion = "primavera";

        switch(estacion)
        {
            case "invierno":
                System.out.println("Estamos en invierno");
                break;

            case "otoño":
                System.out.println("Estamos en otoño");
                break;

            case "verano":
                System.out.println("Estamos en verano");
                break;

            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            default:
                System.out.println("El dato "+ "'"+estacion +"'"+ " No es una estacion" );


        }




    }
}