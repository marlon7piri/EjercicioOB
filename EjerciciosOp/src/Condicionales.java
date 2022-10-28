import java.util.Date;
import java.util.Scanner;
import javax.swing.*;


public class Condicionales {
Scanner entrada = new Scanner(System.in);
String nombre="";




int edad;
boolean estado = true;



    public static void main(String[] args) {

Condicionales mensajero= new Condicionales();
mensajero.MostrarDatos();




    }


    public void PedirNombre(){


    System.out.println("Cual es su nombre");
    nombre=entrada.nextLine();







    }

    public void PedirEdad(){

        System.out.println("Hola " + nombre + " cual es tu edad ");
        edad=entrada.nextInt();



    }
    public void MostrarDatos(){
        PedirNombre();
        PedirEdad();
        ValidarEntrada();




    }


    public void ValidarEntrada(){
estado=false;

        if(nombre.equals("marlon") && edad==26 && !estado){

            JOptionPane.showMessageDialog(null,"Bienvenido " + nombre + " a la fiesta de Alexandra");
        }else{

            JOptionPane.showMessageDialog(null,"No puede entrar " + nombre + " a la fiesta de Alexandra");

        }


    }


}
