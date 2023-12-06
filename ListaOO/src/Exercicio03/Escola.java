package Exercicio03;

import java.util.ArrayList;

public class Escola {
    public ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno a) {
        this.listaDeAlunos.add(a);
    }

    public String listarAlunos() {
        String alunos = "";
        int cont = 0;
        for (Aluno a : this.listaDeAlunos){
            cont++;
            alunos = cont + "º aluno \nNome: "+ a.nomeAluno +"\nIdade: "+a.idade+"\nMatrícula: "+ a.matricula + "\nDescrição: \nNota:";
            for (Nota n : a.listaDeNotas){
                alunos += n.descricaoNota + " "+ n.nota;
            }
        }
        return alunos;
    }

}