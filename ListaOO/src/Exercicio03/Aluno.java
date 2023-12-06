package Exercicio03;

import java.util.ArrayList;

public class Aluno{
    public ArrayList<Nota> listaDeNotas = new ArrayList<>();
    public String nomeAluno;
    public int idade;
    public long matricula;
	
    public void adicionarNota(Nota n) {
        this.listaDeNotas.add(n);
	}
	
}