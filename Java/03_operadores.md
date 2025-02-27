# Operadores
Elementos que nos permitem fazer operações

## Aritiméticos

``` java
// Operadores básicos -> + - / *
int numero1 = 10;
int numero2 = 20;

System.out.println(numero2 - numero1); // result -> 10
System.out.println(numero2 + numero1); // result -> 30
System.out.println(numero2 * numero1); // result -> 200
System.out.println(numero2 / numero1); // result -> 2

// Se você colocar uma string antes dos numeros com o + ele apenas irar concatenalos
System.out.println("Valor: " + numero2 + numero1); // result -> Valor: 2010

int result = numero1 + numero2;
System.out.println(result); // result -> 30

int numero3 = 5;
int numero4 = 2;
double numero5 = 2;

double resutado = numero3 / numero4; 
// Esta divisão retornara 2.0 e não 2.5
// Operação de dois numeros inteiros sempre resultara em um inteiro

resultado = numero3 / numero5; 
// Esta divisçao retornara 2.5
// Quando um dos dois numeros tambem é double, logo não retornando ao inteiro

resultado = numero3 / (double) numero4; 
// Esta divisçao retornara 2.5
// Mesmo o numero sendo inteiro esta sendo feito nele um casting para double
// Metodo nao recomendado



```

## Relacionais

``` java
// % -> Resto

int resto = 20 % 2;
System.out.println(resto);

// < > <= >= == != -> Menor, Maior; Menor igual, Maior igual; igual; diferente

boolean isDezMaiorQueVinte = 10 > 20;
boolean isDezIgualAVinte = 10 == 20;
boolean isDezIgualADez = 10 == 10.0;
boolean isDezMenorQueVinte = 10 < 20;
boolean isDezDiferenteDeVinte = 10 != 20;

System.out.println("isDezMaiorQueVinte" + isDezMaiorQueVinte); // False
System.out.println("isDezIgualAVinte" + isDezIgualAVinte); // False
System.out.println("isDezIgualADez" + isDezIgualADez); // True
System.out.println("isDezMenorQueVinte" + isDezMenorQueVinte); // True
System.out.println("isDezDiferenteDeVinte" + isDezDiferenteDeVinte); // True

```

## Lógicos

### AND

``` java

int number1 = 5;
int number2 = 10;

// A condição so retornara como true caso o n1 e o n2 correspondam com os valores indecados
if (number1 == 5 && number2 == 10) System.out.println(true);
else System.out.println(false);
``` 

``` java

int number1 = 2;
int number2 = 10;

// A condição so retornara como true caso o n1 ou n2 corresponda com algum dos valores indicados
if (number1 == 5 || number2 == 10) System.out.println(true);
else System.out.println(false);
``` 

## Atribuição

``` java

// = += -= /= %=

double bonus = 1800;
bonus += 1000 // bonus = bonus + 1000

```

