package calcTerreno;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // criar ou instanciar um objeto
        Terreno objTerreno = new Terreno();

        objTerreno.setComprimento(30);
        objTerreno.setLargura(15);
        // Aqui só conseguirá definir o tamanho do terreno se o comprimento e largura
        // forem públicos, senão tem que mudar no Terreno.java)
        // setComprimento é public, então será possivel acessar essa informação

        JOptionPane.showMessageDialog(null, "O comprimento do terreno é: " + objTerreno.getComprimento() +
                "\nA largura do terreno é: " + objTerreno.getLargura() +
                "\nQde de arame necessário é: " + objTerreno.calculaQtdeArame(),
                "Exemplo APP em Java", JOptionPane.INFORMATION_MESSAGE);

        /*
         * JOptionPane.showMessageDialog() é método
         * null = posiciona no centro do monitor; INFORMATION_MESSAGE é simbolo
         * exclamação.
         */
        // \n é usado para quebra de linha. \n\n para 2 linhas.
    }

}