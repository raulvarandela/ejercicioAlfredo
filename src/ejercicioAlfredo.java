import java.util.Scanner;

/**
 * @author: rvmarra17
 * date: 7/11/2020
 * Descripción: propuesta del ejercicio de Alfredo
 */


public class ejercicioAlfredo {
    public static void main(String[] args) {

        //leemos por teclado el numero
        Scanner reader = new Scanner(System.in);
        int numero = 0;
        System.out.print("Introduce un numero: ");
        numero = reader.nextInt();

        //si el numero es menor que 10 no hacemos nada
        if (numero >= 10) {

            //mientras que el numero sea mayor que 10, seguimos sumando
            while (numero >= 10) {
                int[] array = separarEnDigitos(numero); //se separa el numero en dígitos
                numero = sumarNumeros(array); //sumo los digitos
                System.out.println("Resultado intermedio: " + numero);
            }
        }
        System.out.println("Resultado final: " + numero);

    }

    //metodo para separar el numero en int
    private static int[] separarEnDigitos(int numero) {
        int[] array = new int[0];
        int i = 0;

        while (numero != 0) {
            array = redimensionarArray(array);
            array[i] = numero % 10;
            numero = numero / 10;
            i++;
        }

        return array;
    }

    //metodo para redimensionar el array
    private static int[] redimensionarArray(int[] array) {
        int[] arrayRedimensionado = new int[array.length + 1];


        for (int i = 0; i < array.length; i++) {
            arrayRedimensionado[i] = array[i];
        }

        return arrayRedimensionado;
    }

    //metodo para sumar los numeros del array
    private static int sumarNumeros(int[] array) {
        int toret = 0;
        for (int i = 0; i < array.length; i++) {
            toret += array[i];
        }
        return toret;
    }

}