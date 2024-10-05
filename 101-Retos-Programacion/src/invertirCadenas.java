public class invertirCadenas {

    public static char[] obtenerCaracteres(String cadena) {

        return cadena.toCharArray();
    }

    public static void main(String[] args) {
        //Aquí ingresas la palabra o frase que se va a revertir
        invertirCadenas normal = new invertirCadenas();
         char[] caracteres = normal.obtenerCaracteres("tendencia");

        for (int i = caracteres.length -1; i >= 0 ; i--) {
            System.out.print(caracteres[i]);
        }
    }


}
