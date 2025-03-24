package Calcul;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }

    @org.junit.jupiter.api.Test
    void addition() {
        assertEquals(3, Calculatrice.addition(1, 2),"Test P1 échoué pour a positif et b positif");
        assertEquals(2, Calculatrice.addition(0, 2), "Test P2 échoué pour a égal 0 et b positif");
        assertEquals(-3, Calculatrice.addition(-1, -2),"Test P3 échoué pour a negatif et b negatif");
        assertEquals(-2, Calculatrice.addition(0, -2),"Test P4 échoué pour a égal 0 et b negatif");
        assertEquals(0, Calculatrice.addition(0, 0),"Test P5 échoué pour a égal 0 et b égal 0");
        assertEquals(-1, Calculatrice.addition(-1, 0),"Test P6 échoué pour a negatif et b égal 0");
        assertEquals(1, Calculatrice.addition(1, 0),"Test P7 échoué pour a positif et b égal 0");
        assertEquals(-1, Calculatrice.addition(-2, 1),"Test P8 échoué pour a negatif et b positif et |a| > b");
        assertEquals(1, Calculatrice.addition(-2, 3),"Test P9 échoué pour a negatif et b positif et |a| < b");
        assertEquals(0, Calculatrice.addition(-2, 2),"Test P10 échoué pour a negatif et b positif et |a| = b");
        assertEquals(1, Calculatrice.addition(5, -4),"Test P11 échoué pour a positif et b negatif et |b| > a");
        assertEquals(-1, Calculatrice.addition(3, -4), "Test P12 échoué pour a positif et b negatif et |b| < a");
        assertEquals(0, Calculatrice.addition(4, -4), "Test P13 échoué pour a positif et b negatif et |b| = a");
    }
    @org.junit.jupiter.api.Test
    void soustraction() {

    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        assertEquals(25, Calculatrice.multiplication(5,5), "Test P1 échoué pour a positif et b positif ");
        assertEquals(0, Calculatrice.multiplication(5,0), "Test P2 échoué pour a positif et b égal 0");
        assertEquals(-25, Calculatrice.multiplication(5,-5), "Test P3 échoué pour a positif et b négatif");
        assertEquals(-10, Calculatrice.multiplication(-5,2), "Test P4 échoué pour a négatif et b positif");
        assertEquals(0, Calculatrice.multiplication(-5,0), "Test P5 échoué pour a négatif et b égal 0");
        assertEquals(10, Calculatrice.multiplication(-5,-2), "Test P6 échoué pour a négatif et b négatif");
        assertEquals(0, Calculatrice.multiplication(0,10), "Test P7 échoué pour a égal 0 et b positif");
        assertEquals(0, Calculatrice.multiplication(0,0), "Test P8 échoué pour a égal 0 et b égal 0");
        assertEquals(0, Calculatrice.multiplication(0,-10), "Test P9 échoué pour a égal 0 et b négatif");
    }

    @org.junit.jupiter.api.Test
    void division() {
        assertEquals(2, Calculatrice.division(10,5),"Test P1 échoué pour a positif et b positif b < a");
        assertEquals(1, Calculatrice.division(2,2),"Test P2 échoué pour a positif et b positif b = a");
        assertEquals(0, Calculatrice.division(5,8),"Test P3 échoué pour a positif et b positif b > a");
        assertEquals(0, Calculatrice.division(0,5),"Test P4 échoué pour a égal 0 et b positif");
        assertEquals(-5, Calculatrice.division(-10,2),"Test P5 échoué pour a négatif et b positif b < |a|");
        assertEquals(-1, Calculatrice.division(-5,5),"Test P6 échoué pour a négatif et b positif b =|a|");
        assertEquals(-1, Calculatrice.division(-8,15),"Test P7 échoué pour a négatif et b négatif b > |a|");
    }
}