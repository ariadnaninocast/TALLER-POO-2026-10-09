package interfaz;

import VETNINO.modelo.Mascota;

public class Veterinaria {

    public static void main(String[] args) {

        Mascota[] clientes = new Mascota[4];
        //Usa los parametros preestablecidos del constructor
        clientes[0] = new Mascota("Luna","Perro", 28.5,9);
        clientes[1] = new Mascota("Michi","Gato",4.2, 3);
        clientes[2] = new Mascota("Rocky","Perro",12.0,5);
        clientes[3] = new Mascota("Pepa","Conejo",2.1,1);

        clientes[1].setPeso(-3);

       System.out.println("₊°︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶ ‧₊˚");


    //FOR
    int total = 0;
       for (int i = 0; i < clientes.length; i++) {
        Mascota pacientes= clientes[i];
        System.out.println (pacientes.descripcion());
        total = total + pacientes.valorConsulta();
           System.out.println("Su total es de :" + total);
           System.out.println("₊°︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶︶ ‧₊˚");
   }

}
}
