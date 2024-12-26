package valoresEmatrizes;

public class exercicio2 {

    public static void main(String[] args) {
        
        int[] lista = {13, 41, 5, 86, 72, 9, 82, 36, 27, 8};
        
        int pares = 0;
        int maiores = 0;
        
        // Percorre o array
        for (int i = 0; i < lista.length; i++) {
            // Verifica se o número é par
            if (lista[i] % 2 == 0) {
                pares = pares + 1;
            }
            
            // Verifica se o número é maior que 28
            if (lista[i] > 28) {
                maiores = maiores + 1;
            }
        }
        
        // Exibe os resultados
        System.out.println("Pares são: " + pares);
        System.out.println("Maiores que 28 são: " + maiores);

    }

}
