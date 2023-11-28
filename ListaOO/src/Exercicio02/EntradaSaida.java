package Exercicio02;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int escolherOpcaoMenu() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "Escolha a opção desejada: \n [1] Cadastrar peças \n [2] Remover uma peça \n [3] Visualizar todas as peças \n [4] Sair do sistema"));
    }

    public static String solicitarDescricao(String msg) {
        return JOptionPane.showInputDialog("Informe " + msg + " do produto:");
    }

    public static double solicitarMedidas(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog("Informe " + msg + " do produto:"));
    }

    public static double solicitarPreco() {
        return Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
    }

	public static void mostrarPecas(String listarPecas) {
	}

    public static void mostrarMensagem() {
    }

}