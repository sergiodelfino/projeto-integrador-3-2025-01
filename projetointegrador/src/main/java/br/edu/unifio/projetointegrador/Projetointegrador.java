package br.edu.unifio.projetointegrador; // Pacote principal da aplicação contendo a classe de inicialização

import br.edu.unifio.projetointegrador.formularios.CategoriaForm; // Importa o formulário de categoria
import java.awt.Font; // Importa a classe para definir fontes
import javax.swing.JFrame; // Importa a classe JFrame para criação da janela
import javax.swing.SwingUtilities; // Importa utilitários para execução na thread de interface gráfica
import javax.swing.UIManager; // Importa gerenciador de aparência do sistema
import javax.swing.UnsupportedLookAndFeelException; // Importa exceção para aparência não suportada

public class Projetointegrador { // Classe principal que inicializa o sistema

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException { // Método principal que inicia o programa
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) { // Percorre os estilos de aparência disponíveis
            if ("Nimbus".equals(info.getName())) { // Se encontrar o estilo Nimbus
                UIManager.setLookAndFeel(info.getClassName()); // Define o estilo Nimbus como aparência padrão
                break; // Sai do laço após definir o estilo
            }
        }
        
        Font fonte = new Font("Segoe UI", Font.PLAIN, 18); // Cria uma fonte personalizada com nome, estilo e tamanho

        UIManager.put("OptionPane.messageFont", fonte); // Define a fonte dos textos das caixas de mensagem
        UIManager.put("OptionPane.buttonFont", fonte); // Define a fonte dos botões nas caixas de mensagem

        SwingUtilities.invokeLater(() -> { // Executa o código dentro da thread de interface gráfica
            CategoriaForm janela = new CategoriaForm( // Cria uma nova instância do formulário de categoria
                    new JFrame(), // Janela base para o formulário
                    true // Define o formulário como modal (bloqueia a janela principal)
            );

            janela.setVisible(true); // Exibe o formulário na tela
        });
    }
}
