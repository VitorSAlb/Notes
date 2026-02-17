# Regras básicas do REGEX

Vamos revisar rapidamente algumas construções básicas de Regex:

- "." **(ponto)**: representa qualquer caractere.
- "*" **(asterisco)**: zero ou mais ocorrências do caractere anterior.
- "+" **(mais)**: uma ou mais ocorrências do caractere anterior.
- "?" **(interrogação)**: zero ou uma ocorrência do caractere anterior.
- "[]" **(colchetes)**: um conjunto de caracteres. Por exemplo, [abc] corresponde a a, b, ou c.
- "()" **(parênteses)**: agrupa expressões como uma única unidade.
- "^" **(circunflexo)**: início de uma linha.
- "$" **(cifrão)**: final de uma linha.

## Exemplos

- Verificação de E-mail
``` java
"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
```

- Verificação de Número de telefone
``` java
"^\\d{4}-\\d{4}$"
```

- Verificação de CPF
``` java
"^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$"
```

- Verificação de CEP
``` java
"^\\d{5}-\\d{3}$"
```