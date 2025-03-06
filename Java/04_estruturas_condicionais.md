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

## Laços de Repetição

### While

``` java
int contador = 0;

while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```
O que está acontecendo nessa estrutura?

- O **while** é uma estrutura de repetição que executa um bloco de código enquanto a condição for verdadeira. No exemplo acima, o código será repetido enquanto **contador** for menor que 5.

### Do While

``` java
int contador = 0;

do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 5);
```
O que está acontecendo nessa estrutura?

- A diferença entre o *while* e o **do while** é que o do *while* **executa o bloco de código pelo menos uma vez**, antes de verificar a condição.


### For

``` java
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}
```
O que está acontecendo nessa estrutura?

- O **for** é um laço de repetição que já contém a inicialização, a condição e o incremento dentro de sua sintaxe. No exemplo acima, ele começa com i = 0, executa o bloco enquanto i < 5 e incrementa i a cada iteração.


### For Each

``` java
String[] frutas = {"Maçã", "Banana", "Laranja", "Manga"};

for (String fruta : frutas) {
    System.out.println("Fruta: " + fruta);
}
```
O que está acontecendo nessa estrutura?

- O **for** each é uma variação do *for* usada para percorrer *arrays* ou coleções de forma simplificada, sem precisar de um contador manual.
