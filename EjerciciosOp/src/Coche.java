public class Coche {



    public static void main(String[] args) {

        Coche MiCoche = new Coche();
MiCoche.IncrementarPuertas();
MiCoche.SumarPuerta();



        }
    public void IncrementarPuertas(){

        int puertas=4;

        System.out.println("El coche tiene: " + puertas + " puertas");

    }

    public void SumarPuerta() {

        int puertas=4;
        int a=1;
   int puertasnuevas = puertas + a;

        System.out.println("El coche ahora tiene " + puertasnuevas + " puertas porque se le incremento " + a + " puerta");
    }


    }




