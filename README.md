# 🎬 Projeto: ScreenMatch

O ScreenMatch é uma aplicação Java que simula um gerenciador de filmes e séries, criada com foco no reforço dos principais conceitos da **programação orientada a objetos (POO)**.

## 📌 Objetivo

O projeto foi desenvolvido com o intuito de praticar a estruturação e organização de código orientado a objetos em um contexto funcional. Ao longo da aplicação, são aplicados diversos fundamentos da POO, como:

- Encapsulamento
- Herança (uso de classes mãe e filhas com `extends`)
- Polimorfismo
- Implementação de interfaces
- Uso de coleções e estruturas de repetição

## 🧱 Estrutura do Projeto

- `Titulo.java`: classe base para filmes e séries, contendo atributos como nome, ano de lançamento e duração.
- `Filme.java` e `Serie.java`: classes que herdam de `Titulo`, com atributos específicos.
- `Episodio.java`: representa episódios de séries, com ligação à classe `Serie`.
- `CalculadoraDeTempo.java`: classe auxiliar para calcular o tempo total de exibição.
- `FiltroRecomendacao.java`: filtra e recomenda títulos com base em critérios de avaliação.
- `Principal.java`: ponto de entrada da aplicação com simulação dos objetos e execução da lógica.

## 🖥️ Funcionalidades

- Criação de filmes e séries com dados personalizados
- Simulação de avaliações
- Cálculo de tempo total de exibição
- Recomendação de conteúdo com base em filtros simples
- Exibição dos dados no console

## 🚀 Tecnologias

- Java 17+
- IDE de sua preferência (IntelliJ, Eclipse, VS Code...)

## 📚 Aprendizados

Esse projeto contribui para a compreensão da estrutura e reutilização de código usando herança e interfaces, além de reforçar boas práticas como a separação de responsabilidades e modelagem de dados.

---

### ✍️ Autor

Victor Hugo Saaverda Mota  
[LinkedIn](https://www.linkedin.com/in/victorhugosaavedramota/) • [GitHub](https://github.com/VictorHugoSMota)
