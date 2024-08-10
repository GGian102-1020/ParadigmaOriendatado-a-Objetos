//Para crear un nuevo proyecto utilizamos la opcion en IntelliJ de build system para la cursada
//Para el TP0 vamos a utilizar MAVEN en build system
//La carpeta out como bien se entiende es una carpeta que se crea automaticamente despues de realizar un operacion
//que genere una salida por consola, es importante destacar que dentro de esta carpeta se encuentra un 'MAIN'
//que no debemos de tocar ya que no es el MAIN principal, sino que es el main de salida y esto nos puede llegar
//a perjudicar ya que cualquier cambio, actulizacion o continuacion del programa lo tengamos que agregar al main
//principal
//La carpeta out puede ser eliminada sin ningun tipo de problema
//sout es la abreviacion para cuando queremos hacer un print por consola lo que autocompleta System.out.println()
//Importante destacar que es similar a JS, por lo que funcion va acompañado de sus respectivas {}, y se utiliza
//el ; para finalizar una linea

public class Main {
    public static void main(String[] args) {

        int numero = 342; // definimos un varible de tipo entero

        String saludo = "Hola "; // definimos una variable de tipo String, importante la mayus al principio
        String persona = "Martin";

        String saludoAPersona = saludo + persona;

        System.out.println(saludoAPersona);

        boolean boleano1 = true; // definimos un booleano

        if (boleano1 == false) { // realizamos un if, no olvidar los ()
            System.out.println("falso");
        } else System.out.println(numero);

        int contador = 0;

        while (contador < 5) {
            contador = contador + 1;
            System.out.println(contador);
        }

        

    }
}