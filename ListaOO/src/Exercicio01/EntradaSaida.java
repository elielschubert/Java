package Exercicio01;

import javax.swing.JOptionPane;

public class EntradaSaida {
    public static int escolherOpcao() {
        return Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n[1]Inserir produto \n[2]Sair"));
    }

    public static String solicitarNome() {
        return JOptionPane.showInputDialog("Informe o nome do produto:");
    }

    public static String solicitarCategoria() {
        return JOptionPane.showInputDialog("Informe a categoria do produto:");
    }

    public static long solicitarCodigo() {
        return Long.parseLong(JOptionPane.showInputDialog("Informe o código do produto:"));
    }

    public static double solicitarPreco() {
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));
    }

    public static String solicitarMarca() {
        return JOptionPane.showInputDialog("Informe o nome da marca:");
    }

    public static void exibirProduto(String nome, String categoria, double preco, long codigoInterno, String m) {
        JOptionPane.showMessageDialog(null,
                "Nome do produto: " + nome + "\n Categoria do produto: " + categoria + "\n Valor do produto: R$" + preco
                        + "\n Código interno do produto: " + codigoInterno + "\n Marca do produto: " + m);
    }

}
