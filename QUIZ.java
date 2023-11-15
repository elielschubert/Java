import javax.swing.JOptionPane;

public class Atv01 {
    public static void main(String[] args) {
        String pergunta = "";
        String alternativa = "";
        String msg = "Você acertou!";
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma pergunta secreta \n[1] ? \n[2] ?"));

        switch (opcao) {
            case 1:
                pergunta = "Qual é a capital do Acre? \n[A] Macapá \n[B] Rio Branco \n[C] São Luís";
                alternativa = JOptionPane.showInputDialog(null, pergunta).toUpperCase();

                switch (alternativa) {
                    case "A":
                        msg = "Você errou!";
                        JOptionPane.showMessageDialog(null, msg);
                        break;

                    case "B":
                        JOptionPane.showMessageDialog(null, msg);
                        break;

                    case "C":
                        msg = "Você errou!";
                        JOptionPane.showMessageDialog(null, msg);

                    default:
                        alternativa = JOptionPane.showInputDialog(null, pergunta);

                }
                break;

            case 2:
                pergunta = "Qual é o país mais populoso do mundo? \n[A] China \n[B] Rússia \n[C] Índia ";
                alternativa = JOptionPane.showInputDialog(null, pergunta).toUpperCase();

                switch (alternativa) {
                    case ("A"):
                        msg = "Você errou!";
                        JOptionPane.showMessageDialog(null, msg);
                        break;

                    case "B":
                        msg = "Você errou!";
                        JOptionPane.showMessageDialog(null, msg);
                        break;

                    case "C":
                        JOptionPane.showMessageDialog(null, msg);
                        break;

                    default:
                        alternativa = JOptionPane.showInputDialog(null, pergunta);

                }
            default:
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma pergunta secreta \n[1] ? \n[2] ?"));
        }
    }
}