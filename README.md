# 🎬 Sistema de Ingressos para Cinema — Herança e Polimorfismo em Java

Este projeto simula um sistema de **venda de ingressos de cinema**, aplicando os conceitos de **herança** e **polimorfismo** em Java. A partir de uma classe base `Ingresso`, o sistema trata os tipos especiais de ingresso: `MeiaEntrada` e `IngressoFamilia`, cada um com comportamento específico sobre o cálculo do valor real.

---

## 📋 Enunciado do Exercício

Crie uma hierarquia de classes para tratar os tipos de ingresso que podem ser comercializados em um cinema.  

Cada ingresso deve conter:
- Valor do ingresso
- Nome do filme
- Informação se o filme é dublado ou legendado

E os seguintes comportamentos:
- Um método que retorna o **valor real** do ingresso:
  - `MeiaEntrada`: retorna **metade do valor**
  - `IngressoFamilia`: retorna o valor multiplicado pelo **número de pessoas** e aplica **5% de desconto** quando esse número for **maior que 3**

## 🧠 Conceitos Utilizados

- ✅ **Herança**
- ✅ **Polimorfismo (sobrescrita de métodos)**
- ✅ **Encapsulamento**
- ✅ **Boas práticas de POO**
- ✅ **Reutilização de código através da classe base**
