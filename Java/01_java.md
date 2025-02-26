# Java

*Java é uma linguagem que consegue rodar em qualquer sistema operacional?* Sim, as aplicações em java rodam em uma JVM (Java Virtual Machine) então quando rodamos a nossa aplicação em java ele não roda diretamente no SO e sim na JVM.

> **Workflow do Java**
> App1.java > App1.class > JVM <> SO

### Componentes do Java

- JVM
- JDK ( Java Development Kit)
- JRE 

# Executando compilação manualmente

``` java

public class FirstExample {
    
    public static void main (String[] args) {
        System.out.println("Hello World");
    }
}
```

Temos o nosso codigo e precisamos gerar o bitecode, abrimos o CMD, entramos no diretorio onde esta nosso arquivo.java e digitamos:

``` cmd

javac FirtExample.java
```

Fazendo isso geramos o bitecode com o arquivo .class e iremos jogar para a JVM para demonstar o Output:
``` cmd

java FirstExample
```