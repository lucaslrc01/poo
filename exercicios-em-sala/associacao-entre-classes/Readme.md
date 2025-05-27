# Teste MERMAID

> Teste diagrama UML com mermaid

```mermaid
classDiagram

    class Retangulo{
        - altura : int
        - largura : int
        + Retangulo(int a, int l)
        + getArea() int
    }
```

```mermaid
classDiagram
    direction LR

    class Roda{
    - diametro : double
    - material : String
    - calibragem : double
    + Roda()
    }

    class Carro{
    - marca : String
    - propulsor: Motor
    + Carro(ma: String, mo: Motor)
    + acelerar(v: int): void
    + trocarMotor(m: Motor): void
    } 

    class Motor{
    - hp : int
    - giroAtual : int
    - cilindros : int
    + Motor()
    + acelerar(v: int): void
    }

    Carro"3..4" --> "1"Roda
    Carro"1" o-- "1"Motor

```

```mermaid
classDiagram
    direction LR

    class Aviao{
        - capacidade : int
        - pesoMax : double
        - combustivel : double
        - propulsor : Motor
        + Aviao(ca: int, pe: double, com: double, ??)
    }

    class Motor{
        tipo : String
        ligado : boolean
        + Motor(ti: String, li: boolean)
    }

    Aviao o-- Motor
