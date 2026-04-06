package pessoaAluno;

public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String mostrarDados() {
        return String.format("Pessoa -> Nome: %s | Idade: %d", nome, idade);
    }
}
