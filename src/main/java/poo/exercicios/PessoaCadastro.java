package poo.exercicios;

import java.util.Scanner;

public class PessoaCadastro {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Pessoa pessoa = new Pessoa();

            System.out.print("Nome: ");
            pessoa.setNome(teclado.nextLine());

            System.out.print("Idade: ");
            pessoa.setIdade(teclado.nextInt());

            System.out.println("Cadastro realizado");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        }
    }

    static class Pessoa {
        private String nome;
        private int idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                this.nome = "Sem nome";
                return;
            }
            this.nome = nome.trim();
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            if (idade < 0) {
                this.idade = 0;
                return;
            }
            this.idade = idade;
        }
    }
}
