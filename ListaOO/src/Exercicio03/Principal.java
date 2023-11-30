package Exercicio03;

public class Principal {
    public static void main(String[] args) {
        Escola e = new Escola();
        int opcao = 0;

        do {
            opcao = EntradaSaida.escolherOpcao();

            switch (opcao) {
                case 1:
                    Aluno a = new Aluno();
                    a.nomeAluno = EntradaSaida.solicitarNomeAluno();
                    a.idade = EntradaSaida.solicitarIdade();
                    a.matricula = EntradaSaida.solicitarMatricula();
                    e.adicionarAluno(a);

                    Nota n = new Nota();
                    n.descricaoNota = EntradaSaida.solicitarDescricao();
                    n.nota = EntradaSaida.solicitarNota();
                    a.adicionarNota(n);

                    break;

                case 2:
                    if (!e.listaDeAlunos.isEmpty()) {
                        EntradaSaida.mostrarAlunos(e.listarAlunos());
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    
                    /*exibir os alunos
                    perguntar matrícula
                    mandar a matrícula para um método da classe escola
                    criar for each (para o método) que busca o aluno e retorna o objeto aluno  para o principal
                    repetir a estrutura de nota
                    */
                    
                    break;

                case 7:
                    break;
            }
        } while (opcao != 7);
    }
}