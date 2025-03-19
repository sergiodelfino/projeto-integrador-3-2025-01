package br.edu.unifio.projetointegrador.entidades; // Define o pacote onde a classe está localizada.

import io.ebean.Model; // Importa a classe Model do Ebean para funcionalidades de persistência.
import jakarta.persistence.Entity; // Importa a anotação Entity para mapear a classe como uma entidade no banco de dados.
import jakarta.persistence.GeneratedValue; // Importa a anotação GeneratedValue para configurar a geração automática de valores.
import jakarta.persistence.GenerationType; // Importa a enumeração GenerationType para definir a estratégia de geração de valores.
import jakarta.persistence.Id; // Importa a anotação Id para indicar o campo da chave primária.
import lombok.AllArgsConstructor; // Importa a anotação Lombok para gerar um construtor com todos os argumentos.
import lombok.Getter; // Importa a anotação Lombok para gerar métodos getters automaticamente.
import lombok.NoArgsConstructor; // Importa a anotação Lombok para gerar um construtor sem argumentos.
import lombok.Setter; // Importa a anotação Lombok para gerar métodos setters automaticamente.
import lombok.ToString; // Importa a anotação Lombok para gerar o método toString automaticamente.

@Getter // Anotação Lombok para gerar métodos getters.
@Setter // Anotação Lombok para gerar métodos setters.
@NoArgsConstructor // Anotação Lombok para gerar um construtor sem argumentos.
@AllArgsConstructor // Anotação Lombok para gerar um construtor com todos os argumentos.
@ToString // Anotação Lombok para gerar o método toString.
@Entity // Anotação que indica que a classe é uma entidade mapeada no banco de dados.
public class Categoria extends Model { // Declaração da classe Categoria, que herda da classe Model do Ebean.

    @Id // Anotação que indica que o campo abaixo é a chave primária da entidade.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configura a geração automática do valor da chave primária usando estratégia de autoincremento.
    private Integer codigo; // Campo que armazena o código da categoria (chave primária gerada automaticamente).

    private String nome; // Campo que armazena o nome da categoria.

    private Boolean ativo; // Campo que armazena o status da categoria (ativo ou inativo).
}