[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Formacao-Java/blob/main/LICENSE)

<h1 align="center">APRENDA JAVA COM ORIENTAÇÃO A OBJETOS:</h1>
<h3 align="center">4 cursos da formação com carga horária estimada em 37 horas</h3>


<br><br><br><br><br>

<p align="center"><img width="150px" src="https://github.com/lucarauj/assets/blob/main/Java.png" /></p>
<h1 align="center">Java: Criando a sua primeira aplicacao</h1>

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

<p align="center"><img width="150px" src="https://github.com/lucarauj/assets/blob/main/Java.png" /></p>
<h1 align="center">Java: Aplicando a Orientação a Objetos</h1>

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

<br>

<p align="center"><img width="150px" src="https://github.com/lucarauj/assets/blob/main/Java.png" /></p>
<h1 align="center">Java: Trabalhando com Listas e Coleções de dados</h1>

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

<br>

<p align="center"><img width="150px" src="https://github.com/lucarauj/assets/blob/main/Java.png" /></p>
<h1 align="center">Java: Consumindo API, gravando arquivos e lindando com erros</h1>

### OMDb API:

- https://www.omdbapi.com/
- https://www.omdbapi.com/?t=[nome-do-filme]&apikey=[chave]

### API:

- Application Programming Interface: é um conjunto de padrões, protocolos e ferramentas para construir software e aplicativos. 
- Uma API permite que diferentes sistemas e serviços se comuniquem e troquem informações de maneira padronizada. 
- Existem diferentes tipos de APIs, sendo que o mais comum é API Web, que utiliza o protocolo HTTP para comunicação via internet.

### JSON:

- JavaScript Object Notation: é um formato de dados leve e popular para troca de informações entre sistemas, podendo ser utilizado em várias linguagens de programação.

### HTTP:

- Hypertext Transfer Protocol: é um protocolo de comunicação que permite a transferência de informações na internet. Ele é a base para a comunicação entre navegadores e servidores Web, sendo utilizado para a transmissão de conteúdo como textos, imagens e vídeos.

### Códigos de Status (Classes):

- 1xx: Informações
- 2xx: Sucesso
- 3xx: Redirecionamento
- 4xx: Erro do cliente
- 5xx: Erro do servidor

### Design patterns (Padrões de projeto):

- Categorias (Padrões de criação, Padrões de estrutura, Padrões de comportamento);

### MVN Repository:

- Repositório que disponibiliza dependências/bibliotecas;

### Frameworks:

- São estruturas de software que fornecem uma arquitetura básica para o desenvolvimento de aplicações;
- Spring Framework: facilita a criação de aplicações Web e APIs Rest complexas em Java;
- Hibernate: framework de mapeamento objeto-relacional que simplifica o processo de integração de uma aplicação Java com um banco de dados relacional;

### Record (Java 16):

- Recurso que permite representar uma classe imutável, contendo apenas atributos, construtor e métodos de leitura;
- Indicado para ser usado nos casos de criação de objeto apenas para representar dados, sem nenhum tipo de comportamento.

### Imutabilidade:

- Capacidade de um objeto não poder ser alterado depois de criado;
- Concorrência: objetos imutáveis são seguros para uso em ambientes concorrentes, já que não há necessidade de sincronização.
- Segurança: objetos imutáveis são seguros contra alterações acidentais ou mal-intencionadas.
- Desempenho: objetos imutáveis podem ser armazenados em cache e reutilizados, o que pode melhorar o desempenho.
 
### Tratamento de Exceções:

- Podem ser previstas, tratáveis e antecipadas;
- try-catch;
- finally (opcional);
- Exception: são chamadas de exceções verificadas (checked exceptions);
- RuntimeException [subclasse direta de Exception]: suas herdeiras são chamadas de exceções não verificadas (unchecked exception);

### Multi-catch:

```
try {
    metodoQuePodeLancarExcecao();
} catch (ExceptionUm e) {
    System.out.println("erro...");
} catch (ExceptionDois e) {
    System.out.println("erro...");
}
```

### File - Criando um arquivo:

```
File file = new File("C:\\meuArquivo.txt");
```

### File - Alguns métodos:

- exists();
- canRead();
- canWrite();
- isDirectory();
- isFile();
- mkdir();
- delete();

### Outras classes para leitura e escrita de arquivos:

- FileReader;
- FileWriter;
- BufferedReader;
- BufferedWriter;
- FileInputStream;
- FileOutputStream;
- ObjectInputStream;
- ObjectOutputStream;
- Scanner;

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
