package VETNINO.modelo;

// Estante numerado, en vez de una variable por producto

public class Mascota {
        private String nombre;
        private String especie;
        private double peso;
        private int edad;

//Constructor - inicializar lo atributos de un objeto

        Mascota (String nombre, String especie,int peso, int edad ) {
            this.nombre = nombre;
            this.especie = especie;
            this.peso=peso;
            this.edad=edad;
        }



//Metodos get n set

    //Metodo GET - Mostrador de SALIDA: deja mirar lo que hay en la bodega
    String getNombre() {
    return nombre;
    }
    String getEspeciespecie() {
        return especie;
    }
    double getPeso() {
        return peso;
    }

    int getEdad() {
        return edad;
    }

    //Metodo SET- Mostrador de ENTRADA: recibe el cambio, pero revisa primero

    //Para evaluar el PESO
    void setPeso (double nuevoPeso) {
        if (nuevoPeso <= 0) {
            System.out.println("RECHAZADO: no existe " + nuevoPeso + " en kilogramos");
            return;
        }
        this.peso = nuevoPeso;
    }

    //Para evaluar LA EDAD
    void setEdad (int nuevoEdad) {
        if (nuevoEdad < 0) {
            System.out.println("RECHAZADO: no puede haber " + nuevoEdad + " en kilogramos");
            return;
        }
        this.peso = nuevoEdad;
    }

//Metodo Valor de la consulta

    public int  valorConsulta()  {
    int valor =35000;
        if (peso > 25) {
           valor=55000;

         } else if (peso >10){
            valor=45000;}

          if (edad>8){
              valor= valor + 12000;
          }
        return valorConsulta();
    }

    //Metodo descripcion()
    //El metodo usa los atributos del contructor por ende no es necesario los parametros
    public String descripcion( ) {
        return nombre + " (" + especie + ", " + peso + " kg, " + edad + " años)";
    }


}
















