# Conta Bancária
Bem-vindo ao repositório contabancaria! Este projeto implementa uma aplicação de conta bancária em Java utilizando a arquitetura MVC (Model-View-Controller) e com foco nos princípios de Programação Orientada a Objetos (POO).

## Descrição do Projeto
Este projeto é uma aplicação de conta bancária simples desenvolvida em Java. Ele exemplifica o uso da arquitetura MVC para separar as responsabilidades do sistema em diferentes camadas e utiliza os conceitos de POO para garantir um código modular, reutilizável e fácil de manter. A aplicação suporta operações básicas de contas correntes e contas poupança.

## Estrutura do Repositório
O repositório está organizado da seguinte forma:

```
/
|-- .settings/
|-- bin/conta/
|-- src/conta/
|   |-- Menu.java
|   |-- controller/
|   |   |-- ContaController.java
|   |-- model/
|   |   |-- ContaCorrente.java
|   |   |-- ContaPoupanca.java
|   |   |-- Conta.java
|   |-- repository/
|   |   |-- ContaRepository.java
|   |-- util/
|       |-- Cores.java

```

## Descrição dos Diretórios e Arquivos
- .settings/: Diretório com configurações específicas do ambiente de desenvolvimento.
- bin/conta/: Diretório onde os arquivos compilados são armazenados.
- src/conta/: Diretório principal do código fonte.
- Menu.java: Classe responsável pela interface de menu da aplicação.
- controller/: Contém classes de controle, incluindo a ContaController.java, que gerencia as operações sobre as contas.
- model/: Contém as classes de modelo que representam as entidades do sistema:
- Conta.java: Classe base para as contas bancárias.
- ContaCorrente.java: Implementação de uma conta corrente.
- ContaPoupanca.java: Implementação de uma conta poupança.
- repository/: Contém a classe ContaRepository.java, responsável por simular a persistência de dados.
- util/: Contém utilitários, como a classe Cores.java para gerenciar cores na saída do console.

## Pré-requisitos
Para executar este projeto, você precisará ter o seguinte instalado:

- Java Development Kit (JDK) 8 ou superior
- Um ambiente de desenvolvimento integrado (IDE) como Eclipse ou IntelliJ IDEA

## Instalação
- Clone este repositório para o seu ambiente local:

```
git clone https://github.com/seuusuario/contabancaria.git
```
- Abra o projeto na sua IDE preferida.
- Compile e execute o projeto a partir da classe Menu.java.

## Uso
- Ao executar a aplicação, você será apresentado a um menu com opções para criar contas, consultar saldo, realizar depósitos, saques e outras operações bancárias básicas.
- Siga as instruções exibidas no menu para interagir com a aplicação.