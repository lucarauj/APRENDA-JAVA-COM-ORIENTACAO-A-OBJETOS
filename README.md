## Java: Criando a sua primeira aplicacao

<br>

### As diferenças entre JVM, JRE e JDK:

- ```JVM (Java Virtual Machine)``` - é a Máquina Virtual do Java responsável por executar o bytecode;
- ```JRE (Java Runtime Environment)``` - Ambiente de Execução do Java que fornece as bibliotecas padrões do Java para o JDK compilar o seu código e para a JVM executar o seu programa;
- ```JDK (Java Development Kit)``` - Kit de Desenvolvimento Java responsável por compilar código-fonte em bytecode.

<br>

### Operadores aritméticos:

- ```"+" (adição)```
- ```"-" (subtração)```
- ```"*" (multiplicação)```
- ```"/" (divisão)```
- ```"%" (resto da divisão)```

<br>

### Operadores relacionais:

- ```"==" (igual a)```
- ```"!=" (diferente de)```
- ```">" (maior que)```
- ```">=" (maior ou igual a)```
- ```"<" (menor que)```
- ```"<=" (menor ou igual a)```

<br>

### Operadores lógicos:

- ```AND (&&)```
- ```OR (||)```
- ```NOT (!)```

<br>

### Operadores de incremento:

- ```Pré-incremento (++variavel)```
- ```Pós-incremento (variavel++)```

<br>

### Convenção de código:

- Nome de classe: ```MinhaClasse```
- Nome de método: ```meuMetodo()```
- Nome de constante: ```MINHA_CONSTANTE```
- Nome de variável: ```minhaVariavel```
- Linhas de código devem ter no máximo 80 caracteres
- espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo: ```if (condicao) {```

<br>

### Tipos primitivos:

- ```boolean```: true ou false
- ```byte```: valores numéricos inteiros de 8 bits (-128 a 127)
- ```char```: caracteres individuais (Unicode)
- ```short```: valores numéricos inteiros de 16 bits (-32.768 a 32.767)
- ```int```: valores numéricos inteiros de 32 bits (de -2.147.483.648 a 2.147.483.647)
- ```long```: valores numéricos inteiros de 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
- ```float```: valores numéricos de ponto flutuante [32 bits] (números decimais com até sete dígitos)
- ```double```: valores numéricos de ponto flutuante [64 bits] (números decimais com até 15 dígitos)

<br>

### Java 15 - Formatação de String [Text Block]:

- ``` sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        """;
```

<br>

### Mais formatação de String:

```
String nome = "Maria";
int idade = 30;
double valor = 55.9999;
System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
```

<br>

### Comentários de única linha:

- ```duas barras "//"```

<br>

### Comentários de várias linhas:

- ```barra + asterisco "/*"```

<br>

### Comparação de Strings:

- ```string.equals("outraString")```

<br>

### Casting (Conversão):

- ```int classificacao;```
- ```classificacao = (int) (media /2);```

<br>

### Switch:

- ```switch (expressão) {```
   ```case valor1:```
   ```// código a ser executado se a expressão for igual a valor1```
   ```break;```
   ```...```	

<br>

### Leitura de Dados:

- ```Scanner scanner = new Scanner(System.in);```
- ```nextLine()```: lê linha de texto
- ```nextInt()```: lê número inteiro
- ```nextDouble()```: lê número decimal

<br>

### Como receber número com ponto na entrada?

- ```Locale.setDefault((Locale.US));``` 

<br>

