package Exercicio03;

import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int escolherOpcao() {
        return Integer.parseInt(JOptionPane.showInputDialog(
                "[1] Cadastrar aluno e notas \n[2] Visualizar dados e notas de todos os alunos \n[3] Visualizar dados e notas de um único aluno \n[4] Alterar o nome de um aluno \n[5] Adicionar nota a um aluno \n[6] Calcular a média de um aluno \n[7] Sair"));
    }

    public static String solicitarNomeAluno() {
        return JOptionPane.showInputDialog("Informe o nome do aluno:");
    }

    public static int solicitarIdade() {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do aluno:"));
    }

    public static long solicitarMatricula() {
        return Long.parseLong(JOptionPane.showInputDialog("Informe a matrícula do aluno:"));
    }

    public static String solicitarDescricao() {
        return JOptionPane.showInputDialog("Informe a descrição da nota: ");
    }

    public static double solicitarNota() {
        return Double.parseDouble(JOptionPane.showInputDialog("Informe a nota: "));
    }

    public static void mostrarAlunos(String listarAlunos) {
        JOptionPane.showMessageDialog(null, listarAlunos);
    }

}