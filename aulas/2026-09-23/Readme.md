# Diagrama de classes UML

## codigo java

```java
public class Pessoa{
private String nome;
}
```
## Diagrama UML

```mermaid
classDiagram
    class Carro {
        -String marca
        -propoulsor poo.Motor
        + poo.Carro()
        +acelerar(v: int,) void
    }
    
    class Motor{
        -hp int
        -giroAtual int
        -cilindro int
        +poo.Motor()
        +acelerar(v: int) void
    }
    direction LR
    
    Carro o-- Motor
```
## Aluno

```mermaid
classDiagram
    class Aluno{
        -nome String
        -cpf String
        -poo.Endereco endereco
        +poo.Aluno(String nome, String cpf, Endereco end)
        
    }
    class Endereco{
        -pais String
        -estado String
        -cidade String
        -bairro String
        -rua String
        -cep String
        -numero int
        +poo.Endereco(String rua, String numero, String cep)
    }
    Aluno "1"*--"1" Endereco
```

```mermaid
classDiagram
class Aviao{
    
}

class Motor{
    
}
```

