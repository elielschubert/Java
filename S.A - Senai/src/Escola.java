import java.util.ArrayList;

public class Escola {
        public String nomeInstituicao;
        public String codigoInstituicao;
        public String email;
        public String endereco;
        public String senha;

        ArrayList<Aluno> listaDeAlunos = new ArrayList<Aluno>();

        public void adicionarAluno(Aluno a){
                this.listaDeAlunos.add(a);
        }

        }
