package VETNINO.modelo;

// Estante numerado, en vez de una variable por producto

public class Mascota {
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

//Constructor - inicializar lo atributos de un objeto
//Como el constructor es un metodo, el cual se emplea en la otra carpeta y clase, nescesita ser public
//para que estas las puedan usar.
       public Mascota (String nombre, String especie,double peso, int edad ) {
            this.nombre = nombre;
            this.especie = especie;
            this.peso=peso;
            this.edad=edad;
        }



//Metodos get n set
//Como los getter y setter son un metodo, el cual se emplea en la otra carpeta y clase, nescesita ser public
//para que estas las puedan usar.


    //Metodo GET - Mostrador de SALIDA: deja mirar lo que hay en la bodega
    public String getNombre() {
    return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public double getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    //Metodo SET- Mostrador de ENTRADA: recibe el cambio, pero revisa primero

    //Para evaluar el PESO
    public void setPeso (double nuevoPeso) {
        if (nuevoPeso <= 0) {
            System.out.println("RECHAZADO: no existe " + nuevoPeso + " en kilogramos");
            return;
        }
        this.peso = nuevoPeso;
    }

    //Para evaluar LA EDAD
    public void setEdad(int nuevaEdad) {
        if (nuevaEdad < 0) {
            System.out.println("RECHAZADO: no puede haber " + nuevaEdad + " años");
            return;
        }
        this.edad = nuevaEdad;
    }

//Metodo Valor de la consulta
//Como esto es un metodo, el cual se emplea en la otra carpeta y clase, nescesita ser public
//para que estas las puedan usar.
    public int  valorConsulta()  {
    int valor =35000;
        if (peso > 25) {
           valor=55000;

         } else if (peso >10){
            valor=45000;}

          if (edad>8){
              valor= valor + 12000;
          }
        return valor;
    }

//Metodo descripcion()
//Como esto es un metodo, el cual se emplea en la otra carpeta y clase, nescesita ser public
//para que estas las puedan usar.
    //El metodo usa los atributos del contructor por ende no es necesario los parametros
    public String descripcion( ) {
        return nombre + " (" + especie + ", " + peso + " kg, " + edad + " años)";
    }


}
















