# Estruturas Condicionais

## If & Else

### *If*

``` java
int idade = 18;

if(idade >= 18) {
    System.out.println("Maior de idade!");
}
```
O que está acontencendo nessa estrutura? 
- Então quando utilizamos o *if* ele verifica se uma condição é *verdadeira ou falsa*, caso verdadeira ele execura o que está dentro bloco condicional **IF**.

### *Else*

``` java
int idade = 18;

if(idade >= 18) {
    System.out.println("Maior de idade!");
} else {
    System.out.println("Menor de idade!");
}
```
O que está acontencendo nessa estrutura? 
- Então quando utilizamos o *if else*, caso a condição não seja verdadeira ele execura o que está dentro bloco condicional **Else**.

> É possível colocar um *if* dentro de um *else* !

### Ternario

``` java
int idade = 18;

System.out.println(idade >= 18 ? "Maior de idade" : "Menor de idade");
```
O que está acontencendo nessa estrutura? 
- O ternario, funciona de maneira parecida com o if e else, mas de forma simplimficada

> É possível colocar um *if* dentro de um *else* !

## Switch Case

``` java
int dia = 7;

switch(dia) {

    case 1:
        System.out.println("Segunda");
        break;
    case 2:
        System.out.println("Terça");
        break;
    case 3:
        System.out.println("Quarta");
        break;
    case 4:
        System.out.println("Quinta");
        break;
    case 5:
        System.out.println("Sexta");
        break;
    case 6:
        System.out.println("Sabado");
        break;
    case 7:
        System.out.println("Domingo");
        break;
    default:
        System.out.println("Dia inválido");
}
```
O que está acontecendo nessa estrutura?

- O **switch case** é uma alternativa ao *if else* quando temos múltiplas condições baseadas em um único valor. Cada **case** representa um valor possível, e o **break** serve para encerrar a execução do bloco quando uma das condições for satisfeita.