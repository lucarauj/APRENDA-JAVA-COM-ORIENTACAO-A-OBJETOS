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

- ``` 
sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        """;
```

<br>

### Mais formatação de String:

- ```
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

## Java: Aplicando a Orientação a Objetos

### Modificadores de acesso

- public: pode ser acessado por qualquer classe em qualquer pacote
- protected: permite que os atributos de uma classe sejam acessados por outras classes do mesmo pacote e também por suas subclasses;
- private: só pode ser acessado dentro da própria classe;
- default (package-private): pode ser acessado apenas pelas classes que estão no mesmo pacote;

### Documentação Java 👉 [Java Documentation](https://docs.oracle.com/en/java/) 👉 [Java SE Technical Documentation](https://docs.oracle.com/en/java/javase/20/) 👉 [API Documentation](https://docs.oracle.com/en/java/javase/20/docs/api/index.html)

### “This”:

- É usado para fazer referência aos atributos da classe, especialmente em métodos que têm parâmetros com o mesmo nome do atributo da classe em que estamos trabalhando.

### Algumas anotações:

- @Override: anotação do Java que possibilita a sobrescrita de métodos.
- @Deprecated: usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado;
- @NotNull: usada para validar que um atributo não seja nulo;

### Herança:

- Realizada através da palavra-chave extends(aceita apenas uma única classe).

### Interfaces:

- Define quais métodos devem ser implementados pelas classes que o implementam.
- Todos os métodos são públicos, não sendo então necessário utilizar a palavra reservada public na declaração deles;

## Java: Trabalhando com Listas e Coleções de dados

- A partir da versão 10 do Java, foi adicionada uma nova funcionalidade para a declaração de variáveis chamada var, permitindo que o compilador infira automaticamente o tipo da variável com base no valor atribuído a ela;
- Não é possível usar var em variáveis sem valor inicial. É necessário atribuir um valor à variável na mesma linha em que ela é declarada.

### Arrays:

- São estruturas de dados que permitem armazenar uma coleção de elementos do mesmo tipo.
- Exemplo: int[] numeros = new int[5];
- O tamanho de um array é fixo e não pode ser alterado após a sua criação;
- Não possuem métodos que permitam a inserção, remoção ou pesquisa de elementos de forma eficiente;

### Construtores:

- Recurso para encapsuçar objetos;

### ForEach | Method Reference:

```
for (<classe> nome : nomes) {
    System.out.println(nome);
}
```

```
nomes.forEach(nome -> System.out.println(nome));
```

```
nomes.forEach(System.out::println);
```

### Referências:

- São ponteiros para objetos em memória;

### Ordenando uma lista:

- Collections.sort(lista);
- lista.sort(Comparator.comparing(<parâmetro>);

### ArrayList:

- Baseado em um Array, conforme novos elementos são adicionados, o tamanho da matriz é automaticamente ajustado para acomodar o novo elemento;

### LinkedList:

- Baseado em uma lista encadeada, cada elemento da lista é um objeto que contém uma referência para o próximo elemento;

### Map:

- Interface que permite que os desenvolvedores associem chaves a valores;

### HashMap: 

- Classe que implementa a interface Map usando uma tabela hash para armazenar os pares chave-valor;

