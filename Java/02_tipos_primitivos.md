# Tipos Primitivos 

- São tipos que vão ser guardados em memória com valores simples
- São palavras reservadas
- Sempre escritas com as letras minúsculas

> int, double, float, long, short, char, boolean, byte

```
Tabela dos tipos primitivos

byte    > 1 byte    =   8bits   > 0
short   > 2 bytes   =   16bits  > 0
int     > 4 bytes   =   32bits  > 0
long    > 8 bytes   =   64bits  > 0
float   > 4 bytes               > 0.0f
double  > 8bytes                > 0.0d
boolean > 1bit                  > true or false
char    > 2bytes                > \u0000
```

## Casting

O cast é quando forçamos a entrada de um tipo em outro tipo.

``` java

long numeroGrande = 100L;
int numero = (long) numeroGrande;
```

## String
**Não é um tipo primitivo**, é uma classe, considerada como tipo de refência.

``` java

String texto = "Grande texto, dkasdaskdaksdkasdkakdska";
```