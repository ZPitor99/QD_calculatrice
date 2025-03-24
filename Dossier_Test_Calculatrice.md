# Dossier de Tests Calculatrice

## TP TD n°1

### 1 - Introduction

L'objectif du test est de mettre en place les méthodes d'opérateur sur les nombres entiers relatifs, afin de développer une calculatrice.
Pour ce faire, les différentes méthodes de la calcul sont testées:

$$
a + b = c
$$

$$
a - b = c
$$

$$
a \times b = c
$$

$$
a = b × q + r,  0 ≤ r < |b| 
$$

- La méthode addition permettant la somme de a et b : `Calculatrice.addition(a,b) -> int`

- La méthode soustraction permettant la différence de a et b:
  
  `Calculatrice.soustraction(a,b) -> int`

- La méthode multiplication permettant le produit de a et b : `Calculatrice.multiplication(a,b) -> int`

- La méthode divisionEuclidienne permettant la division euclidienne de a par b : `Calculatrice.divisionEuclidienne(a,b)` et $b > 0$

### 2 - Description du teste

Les tests consistent à tester des méthodes de la classe calculatrice. De fait, ce sont des tests unitaires.
Ces tests suivent la méthode boite noire.
La procédure de partition d'équivalence est utilisée pour ces tests 

### 3 - Tests

#### Addition

```java
 public static int addition(int a, int b){}
```

| Classe | A               | B                | C = a + b |
| ------ | --------------- | ---------------- | --------- |
| P1     | a > 0           | b > 0            | c > 0     |
| P2     | a = 0           | b > 0            | c > 0     |
| P3     | a < 0           | b < 0            | c < 0     |
| P4     | a = 0           | b < 0            | c < 0     |
| P5     | a = 0           | b = 0            | c = 0     |
| P6     | a < 0           | b = 0            | c < 0     |
| P7     | a > 0           | b = 0            | c > 0     |
| P8     | a < 0           | b > 0, \|a\| > b | c < 0     |
| P9     | a < 0           | b > 0, \|a\| < b | c > 0     |
| P10    | a < 0           | b > 0, \|a\| = b | c = 0     |
| P11    | a > 0, \|b\|> a | b < 0            | c < 0     |
| P12    | a > 0, \|b\|< a | b < 0            | c > 0     |
| P13    | a > 0, \|b\|= a | b < 0            | c = 0     |

| Classe | A   | B   | C = a + b | Résultat |
| ------ | --- | --- | --------- | -------- |
| P1     | 1   | 2   | 3         | $\surd$  |
| P2     | 0   | 2   | 2         | $\surd$  |
| P3     | -1  | -2  | -3        | $\surd$  |
| P4     | 0   | -2  | -2        | $\surd$  |
| P5     | 0   | 0   | 0         | $\surd$  |
| P6     | -1  | 0   | -1        | $\surd$  |
| P7     | 1   | 0   | 1         | $\surd$  |
| P8     | -2  | 1   | -1        | $\surd$  |
| P9     | -2  | 3   | 1         | $\surd$  |
| P10    | -2  | 2   | 0         | $\surd$  |
| P11    | 5   | -4  | 1         | $\surd$  |
| P12    | 3   | -4  | -1        | $\surd$  |
| P13    | 4   | -4  | 0         | $\surd$  |

#### Soustraction

La soustraction entre entier relatif n'est que l'addition de a et l'opposé de b

$$
a, b \in \mathbb{Z}^2, a - b = a + (-b)
$$

Dès lors que l'addition satisfait tout les tests et que la méthode de soustraction est implémenté de la manière suivante:

```java
public static int soustraction(int a, int b) {
        return addition(a, -b);
    }
```

La soustraction satisfait aussi tout les tests

#### Multiplication

```java
public static int multiplication(int a, int b) {}
```

| Classe | A     | B     | C = a * b |
| ------ | ----- | ----- | --------- |
| P1     | a > 0 | b > 0 | c > 0     |
| P2     | a > 0 | b = 0 | c = 0     |
| P3     | a > 0 | b < 0 | c < 0     |
| P4     | a < 0 | b > 0 | c < 0     |
| P5     | a < 0 | b = 0 | c = 0     |
| P6     | a < 0 | b < 0 | c > 0     |
| P7     | a = 0 | b > 0 | c = 0     |
| P8     | a = 0 | b = 0 | c = 0     |
| P9     | a = 0 | b < 0 | c = 0     |

| Classe | A   | B   | C = a * b | Résultat |
| ------ | --- | --- | --------- | -------- |
| P1     | 5   | 5   | 25        | $\surd$  |
| P2     | 5   | 0   | 0         | $\surd$  |
| P3     | 5   | -5  | -25       | $\surd$  |
| P4     | -5  | 2   | -10       | $\surd$  |
| P5     | -5  | 0   | 0         | $\surd$  |
| P6     | -5  | -2  | 10        | $\surd$  |
| P7     | 0   | 10  | 0         | $\surd$  |
| P8     | 0   | 0   | 0         | $\surd$  |
| P9     | 0   | -10 | 0         | $\surd$  |

#### Division euclidienne

```java
public static int division(int a, int b) {
    if (b <= 0) {
        throw new ArithmeticException("Division par zéro ou négatif");
    }
}
```

La méthode division peut lever un exception si $b <= 0$

| Classe | A     | B                | C = a // b |
| ------ | ----- | ---------------- | ---------- |
| P1     | a > 0 | b > 0, b < a     | c > 0      |
| P2     | a > 0 | b > 0, b = a     | c = 1      |
| P3     | a > 0 | b > 0, b > a     | c = 0      |
| P4     | a = 0 | b > 0            | c = 0      |
| P5     | a < 0 | b > 0, b < \|a\| | c < 0      |
| P6     | a < 0 | b > 0, b =\|a\|  | c = -1     |
| P7     | a < 0 | b > 0, b > \|a\| | c = -1     |

| Classe | A   | B   | C = a // b | Résultat |
| ------ | --- | --- | ---------- | -------- |
| P1     | 10  | 5   | 2          | $\surd$  |
| P2     | 2   | 2   | 1          | $\surd$  |
| P3     | 5   | 8   | 0          | $\surd$  |
| P4     | 0   | 5   | 0          | $\surd$  |
| P5     | -10 | 2   | -5         | $\surd$  |
| P6     | -5  | 5   | -1         | $\surd$  |
| P7     | -8  | 15  | -1         | $\surd$  |

### 4 - Conclusion

La méthode d'addition, de soustraction,  de multiplication et de division euclidienne sont opérationnelles pour la calculatrice. Ils répondent favorablement aux tests unitaires. 

---

### ZPitor99

**Domaine** Qualité de développement

**Date:** 17/03/2024

![Logo de l'établissement]
