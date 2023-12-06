public class Principal {
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
        int opcao = 0;
        int opcaoEscola = 0;
        String loginEscolaCodigo = "";
        String loginEscolaSenha = "";
        Escola indexEscola;

        LimpaConsole.limparTela();

        do {
            opcao = EntradaSaida.escolherOpcao();
            switch (opcao) {
                case 1:
                    Escola e = new Escola();
                    LimpaConsole.limparTela();
                    e.nomeInstituicao = EntradaSaida.recebeDado("o nome");
                    e.codigoInstituicao = EntradaSaida.recebeDado("o código: ");
                    e.email = EntradaSaida.recebeDado("o email: ");
                    e.endereco = EntradaSaida.recebeDado("o endereço: ");
                    e.senha = EntradaSaida.recebeDado("a senha: ");
                    c.adicionarEscola(e);

                    LimpaConsole.limparTela();
                    // Cadastro da instituição
                    break;
                case 2:

                    LimpaConsole.limparTela();

                    loginEscolaCodigo = EntradaSaida.entrarEscola("o código");
                    loginEscolaSenha = EntradaSaida.entrarEscola("a senha");

                    e=c.logarConta(loginEscolaCodigo, loginEscolaSenha);
                    indexEscola = e;

                    // Login da instituição
                    do {
                        opcaoEscola = EntradaSaida.escolherOpcaoEscola();
                        switch (opcaoEscola) {
                            case 1:
                                Aluno a = new Aluno();// < ISSO TÁ CERTO!!!!!!!!!!!!!!!!

                                a.nome = EntradaSaida.cadastrarAluno("o nome");
                                a.matricula = EntradaSaida.cadastrarAluno("a matrícula");
                                a.senha = EntradaSaida.cadastrarAluno("a senha");

                                break;
                            case 2:
                                // Remover um aluno
                                break;
                            case 3:
                                c.mostrarLista(indexEscola);
                                // Visualizar os alunos, não TÁ FUNCIONANDO VOU ME MATAR
                                break;
                            case 4:
                                // Sair da conta
                                System.exit(0);

                                break;
                        }
                    } while (opcao != 5);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        } while (opcao != 6);
    }
}
