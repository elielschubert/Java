import java.util.ArrayList;

public class Cadastro {
    ArrayList<Escola> listaDeEscolas = new ArrayList<Escola>();
    ArrayList<Materiais> listaDeMateriais = new ArrayList<Materiais>();
    ArrayList<Curso> listaDeCursos = new ArrayList<Curso>();
    ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

    public void adicionarEscola(Escola e) {
        listaDeEscolas.add(e);

        // Metódo para adicionar as escolas na lista
    }

    public Escola logarConta(String loginEscolaCodigo, String loginEscolaSenha) {
        String verificacao = "Usuário ou senha incorretos!";
        for (Escola e : this.listaDeEscolas) {
            if (e.codigoInstituicao.equals(loginEscolaCodigo) && e.senha.equals(loginEscolaSenha)) {

                System.out.println("Login realizado com sucesso!");
                return e;
                // Se a informação do usuário bater com o que foi cadastrado, retorna o menu
                // para a instituição.
            }
        }
        System.out.println(verificacao);
        return null;
        // Se a informação não bater, retorna a verificação com a mensagem
    }

    public void mostrarLista(Escola esc) {
    for(Escola e : this.listaDeEscolas){
        if(e.codigoInstituicao.equals(esc.codigoInstituicao)){
        for (Aluno a : this.listaDeAlunos) {
            System.out.println(a.nome);
            System.out.println(a.matricula);
        }
        }
    }    
}
}