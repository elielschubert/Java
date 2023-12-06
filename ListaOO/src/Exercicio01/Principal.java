package Exercicio01;

public class Principal {
    public static void main(String[] args) {
        int opcao;

        do {
            opcao = EntradaSaida.escolherOpcao();

            switch (opcao) {
                case 1:
                    Produto p = new Produto();
                    Marca m = new Marca();

                    p.nome = EntradaSaida.solicitarNome();
                    m.nomeMarca = EntradaSaida.solicitarMarca();
                    p.categoria = EntradaSaida.solicitarCategoria();
                    p.codigoInterno = EntradaSaida.solicitarCodigo();
                    p.preco = EntradaSaida.solicitarPreco();
                    p.m = m;

                    EntradaSaida.exibirProduto(p.nome, p.categoria, p.preco, p.codigoInterno, p.m.nomeMarca);

                    break;

                case 2:
                    System.exit(0);
                    break;

            }
        } while (opcao != 2);
    }
}
