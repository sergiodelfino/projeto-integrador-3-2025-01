package br.edu.unifio.projetointegrador; // Pacote principal da aplicação contendo a classe de inicialização
import io.ebean.DB; // Importa o gerenciador de banco de dados Ebean
import java.io.IOException; // Para tratamento de exceções de I/O
import java.nio.file.Files; // Utilitário para operações com arquivos
import java.nio.file.Paths; // Para manipulação de caminhos de arquivos
import java.util.List; // Para trabalhar com listas de strings

public class Projetointegrador { // Classe principal que inicializa o sistema

    public static void main(String[] args) throws IOException { // Método de entrada da aplicação que pode lançar IOException
        DB.getDefault(); // Inicializa a conexão padrão com o banco de dados
        
        List<String> linhas = Files.lines(Paths.get("src/main/resources/data.sql")).toList(); // Lê todas as linhas do arquivo SQL
        for (String linha : linhas) { // Itera sobre cada linha do arquivo
            DB.sqlUpdate(linha).execute(); // Executa cada comando SQL no banco de dados
        }
    }
}