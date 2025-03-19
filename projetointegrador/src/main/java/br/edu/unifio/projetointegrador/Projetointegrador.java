package br.edu.unifio.projetointegrador; // Define o pacote onde a classe está localizada.

import io.ebean.DB; // Importa a classe DB do Ebean, que fornece métodos para interagir com o banco de dados.

public class Projetointegrador { // Declaração da classe principal do projeto.

    public static void main(String[] args) { // Método principal, ponto de entrada da aplicação.
        DB.getDefault(); // Obtém a instância padrão do banco de dados configurada no Ebean.
    }
}