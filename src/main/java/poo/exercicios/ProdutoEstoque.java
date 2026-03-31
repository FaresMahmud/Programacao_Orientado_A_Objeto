package poo.exercicios;

import java.util.Scanner;

public class ProdutoEstoque {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Produto produto = new Produto("Caderno", 19.90, 10);

            System.out.print("Quantidade para entrada no estoque: ");
            int entrada = teclado.nextInt();
            produto.adicionarEstoque(entrada);

            System.out.print("Quantidade para saída do estoque: ");
            int saida = teclado.nextInt();
            produto.removerEstoque(saida);

            System.out.println("Produto: " + produto.getNome());
            System.out.println("Estoque: " + produto.getQuantidade());
            System.out.println("Valor total: R$ " + String.format("%.2f", produto.getValorTotal()));
        }
    }

    static class Produto {
        private final String nome;
        private final double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = Math.max(0, quantidade);
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void adicionarEstoque(int quantidade) {
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida.");
                return;
            }
            this.quantidade += quantidade;
        }

        public void removerEstoque(int quantidade) {
            if (quantidade <= 0) {
                System.out.println("Quantidade inválida.");
                return;
            }
            if (quantidade > this.quantidade) {
                System.out.println("Estoque insuficiente.");
                return;
            }
            this.quantidade -= quantidade;
        }

        public double getValorTotal() {
            return preco * quantidade;
        }
    }
}
