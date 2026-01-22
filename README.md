# 🚀 Desafio: Aprenda na Prática Programação Orientada a Objetos (POO)

Este repositório contém a minha implementação do **Desafio: Aprendendo na Prática o Paradigma de Orientação a Objetos**, desenvolvido como parte de um **bootcamp** da **DIO**.

O projeto tem como objetivo aplicar, de forma prática, os principais conceitos da **Programação Orientada a Objetos (POO)** utilizando a linguagem **Java**.

> 📌 **Créditos importantes:** Este desafio foi **originalmente criado por cami-la**. Este repositório é uma adaptação para fins educacionais. O link do repositório original está disponível abaixo para referência e créditos completos.

---

## 🎯 Objetivo do Projeto

Colocar em prática os **4 pilares da Programação Orientada a Objetos**:

* 🔹 Abstração
* 🔹 Encapsulamento
* 🔹 Herança
* 🔹 Polimorfismo

Tudo isso através da modelagem de um domínio que representa um **Bootcamp**, seus conteúdos e desenvolvedores participantes.

---

## 👣 Passo a Passo do Desenvolvimento

1. **Abstração do domínio Bootcamp**, identificando seus principais atributos e comportamentos.
2. Criação das classes principais:

   * `Conteudo`
   * `Curso`
   * `Mentoria`
   * `Bootcamp`
   * `Dev`
  
3. Modelagem dos atributos e métodos de cada classe.
4. Aplicação dos conceitos de **POO** para manter o código organizado, reutilizável e de fácil manutenção.
5. Instanciação das classes e criação de objetos para simular o funcionamento do domínio.

---

## 📚 Conceitos de Programação Orientada a Objetos (POO)

### 🔺 Abstração

Capacidade de focar nos aspectos essenciais de um domínio, ignorando detalhes irrelevantes. Os objetos criados representam entidades reais do problema.

### 🔺 Encapsulamento

Oculta os detalhes internos da implementação, expondo apenas o necessário. Facilita a manutenção e evolução do sistema.

### 🔺 Herança

Permite que uma classe herde atributos e métodos de outra, promovendo reutilização de código e extensibilidade.

### 🔺 Polimorfismo

Possibilita que objetos sejam referenciados de diferentes formas, permitindo tratar objetos específicos como instâncias de uma classe mais genérica.

---

## ‼️ Conceitos Fundamentais Utilizados ‼️

* **Domínio:** Representa a camada de negócio da aplicação.
* **Classe:** Estrutura que define atributos e métodos.
* **Atributo:** Características de uma classe.
* **Método:** Comportamentos de uma classe.
* **Objeto:** Instância de uma classe.
* **Instância:** Criação concreta de um objeto na memória.

---

## 📁 Estrutura do Projeto

```text
.
├── README.md
└── src
    └── br
        └── com
            └── gabrielmkv
                └── challengeDIO
                    ├── app
                    │   └── Main.java             // Classe principal para execução do projeto
                    └── domain
                        ├── Bootcamp.java         // Representa o bootcamp
                        ├── Conteudo.java         // Classe abstrata base
                        ├── Curso.java            // Conteúdo do tipo curso
                        ├── Dev.java              // Representa o aluno do bootcamp
                        └── Mentoria.java         // Conteúdo do tipo mentoria
```

## ⭐ Créditos

Desafio originalmente criado por **cami-la**.

> Repositório original: [https://github.com/cami-la/desafio-poo-dio](https://github.com/cami-la/desafio-poo-dio)