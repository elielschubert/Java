import javax.swing.JOptionPane;

public class Atv02 {

    public static void main(String[] args) {

        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            int numero = Integer
                    .parseInt(JOptionPane.showInputDialog("Informe um número para a " + (i + 1) + "ª posição "));
            vetor[i] = numero;
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            } else if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }
        JOptionPane.showMessageDialog(null,
                "O maior número é: " + maior + " na posição: " + posicaoMaior + "\nO menor número é: " + menor
                        + " na posição: " + posicaoMenor);
    }
}