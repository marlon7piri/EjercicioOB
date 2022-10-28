public class Ejercicio2 {


    public static void main(String[] args) {

//Ejercicio de comparar numero negativo o positivo
        int numero = -5;
        int numeroWhile=0;
        
        String estacion ="pepe";


        if(numero>=0){


            System.out.println("El numero "+numero + " es positivo");
        }else{
            System.out.println("El numero " +numero + " es negativo");
        }

        //Ejercicio de while

while(numeroWhile<3){

    System.out.println(numeroWhile);
    numeroWhile++;

}

        System.out.println();
        System.out.println();
        //Ejercicio de Do while

        do{
            System.out.println(numeroWhile);
            numeroWhile++;


        }while(numeroWhile<3);

        //Ejercicio de For
        System.out.println();
        System.out.println();

        for(int i =0;i<=3;i++){

            System.out.println(i);


        }

        //Ejercicio de Switch
        System.out.println();
        System.out.println();
        
        
        switch(estacion){
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Es verano");

            
            
            
        }
        
        


    }







}
