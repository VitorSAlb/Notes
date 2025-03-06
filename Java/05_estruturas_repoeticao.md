# Laços de Repetição

## While

``` java
int contador = 0;

while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```
O que está acontecendo nessa estrutura?

- O **while** é uma estrutura de repetição que executa um bloco de código enquanto a condição for verdadeira. No exemplo acima, o código será repetido enquanto **contador** for menor que 5.

## Do While

``` java
int contador = 0;

do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 5);
```
O que está acontecendo nessa estrutura?

- A diferença entre o *while* e o **do while** é que o do *while* **executa o bloco de código pelo menos uma vez**, antes de verificar a condição.


## For

``` java
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}
```
O que está acontecendo nessa estrutura?

- O **for** é um laço de repetição que já contém a inicialização, a condição e o incremento dentro de sua sintaxe. No exemplo acima, ele começa com i = 0, executa o bloco enquanto i < 5 e incrementa i a cada iteração.


## For Each

``` java
String[] frutas = {"Maçã", "Banana", "Laranja", "Manga"};

for (String fruta : frutas) {
    System.out.println("Fruta: " + fruta);
}
```
O que está acontecendo nessa estrutura?

- O **for** each é uma variação do *for* usada para percorrer *arrays* ou coleções de forma simplificada, sem precisar de um contador manual.
