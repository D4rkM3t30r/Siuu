public class Eliminarvocales {
    
    public static void main(String[] args) {
        // Frase dada
        String frase = "En el bosque boreal las auroras son maravillosas.";

        // Mostrar frase original
        System.out.println("Frase original: " + frase);

        // Eliminar vocales y mostrar la frase resultante
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                resultado.append(c);
            }
        }/*asdad *//*sasaassaas */

        String fraseSinVocales = resultado.toString();
        System.out.println("Frase sin vocales: " + fraseSinVocales);
    }
}
