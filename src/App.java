public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola Mundo";
        int edad = 10;
        System.out.println(cadena);
        System.out.print("Tamaño de la cadena: ");
        System.out.println(cadena.length());//sacar el tamaño de la cadena
        System.out.println(cadena.split(" ")[0]);// arreglo se divide en posiciones ( el split divie a la variable cadena)



        for (int i = 0; i < cadena.length(); i++) {
            if(i == cadena.length()-1){
            System.out.print(cadena.charAt(i));
            }else{
                System.out.print(cadena.charAt(i)+"-");
            }
        }

        System.out.println();
        // CONTAR PALABRAS
        int palabras = cadena.split(" ").length;
        System.out.println(palabras);

        //Cuantas letras hay
        int cantidadLetras = 0;
        for (int i = 0; i < cadena.length(); i++) {
            cantidadLetras ++;
        }
        System.out.println("Numero de palabras: "+cantidadLetras);

        //CONTAR CUANTAS a HAY EN LA "CADENA"
        String letra = "a";
        for (int i = 0; i < cadena.length(); i++) {
            //String 
        }

    }
   /*  public void prueba1 (){
        String palabra;
         palabra = "Hola, Mundo";
        System.out.println(palabra);
    }*/
}
