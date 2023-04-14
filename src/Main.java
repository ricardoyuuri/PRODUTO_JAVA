import banana.Produto;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Apenas declarando que vou precisar destas variaveis
        Produto produto;
        String categoria = "";
        double total = 0;
        int encerrar = 0;

        do{
            var nomeDoProduto = JOptionPane.showInputDialog("Produto");

            var preco = Double.parseDouble(JOptionPane.showInputDialog("Preço (Apenas Numeros)"));

            produto = new Produto(nomeDoProduto, categoria, preco);

            total += produto.getPreço();

            var pergunta = """
                    
                    Deseja cadastrar mais algo?
                    
                    [1] SIM
                    [0] ENCERRAR - mostrar o valor total
                    """;

            encerrar = Integer.parseInt(JOptionPane.showInputDialog(pergunta));

        }while (encerrar > 0);

        JOptionPane.showMessageDialog(null, "total: " + total);
    }
}