public class CifradoCesar {
    public static final String letters = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";

    public static void solution(String texto) {
        String textoCodificado = codificar(texto);
        decodificar(textoCodificado);
    }

    public static String codificar(String texto) {
        String textoCodificado = "";
        texto = texto.toUpperCase();

        char character;
        for (int i = 0; i < texto.length(); i++) {
            character = texto.charAt(i);
            int pos = letters.indexOf(character);
            // posicion en el abecedario del caracter
            if (pos == -1) {
                textoCodificado += character;
            } else {
                textoCodificado += letters.charAt((pos + 3) % letters.length());
            }
        }
        System.out.println(textoCodificado);
        return textoCodificado;
    }

    public static void decodificar(String texto) {
        String textoDecodificado = "";
        texto = texto.toUpperCase();

        char character;
        for (int i = 0; i < texto.length(); i++) {
            character = texto.charAt(i);
            int pos = letters.indexOf(character);
            // posicion en el abecedario del caracter
            if (pos == -1) {
                textoDecodificado += character;
            } else {
                if ((pos - 3) < 0) {
                    textoDecodificado += letters.charAt(letters.length() + (pos-3));
                } else {
                    textoDecodificado += letters.charAt((pos - 3) % letters.length());
                }
            }
        }
        System.out.println(textoDecodificado);
        
    }
}
