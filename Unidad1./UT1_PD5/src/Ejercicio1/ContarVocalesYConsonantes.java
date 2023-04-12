package Ejercicio1;

public class ContarVocalesYConsonantes {
        public String contar(String frase){
            frase = frase.toUpperCase();
            int contador = 0;
            int espacios = 0;

            for (int i = 0; i < frase.length(); i++){
                boolean whitespace = Character.isWhitespace(frase.charAt(i));
                if(!whitespace){
                    String letra = String.valueOf(frase.charAt(i));
                    switch(letra){
                        case "A":
                        case "E":
                        case "I":
                        case "O":
                        case "U":
                            contador++;
                        default:
                    }

                }
                else{
                    espacios ++;
                }
            }
            int cantidadVocales = contador;
            int cantidadConsonantes = frase.length() - (contador + espacios);

            String str = String.format("%s,%s",cantidadVocales,cantidadConsonantes);

            return str;
        }
    }
