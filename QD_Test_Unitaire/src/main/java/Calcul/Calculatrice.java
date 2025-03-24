package Calcul;

public class Calculatrice {

    public Calculatrice() {}

    public static int addition(int a, int b) {
        if (b > 0) {
            while (b > 0) {
                a++;
                b--;
            }
        } else {
            while (b < 0) {
                a--;
                b++;
            }
        }
        return a;
    }

    public static int soustraction(int a, int b) {
        return addition(a, -b);
    }

    public static int multiplication(int a, int b) {
        int resultat = 0;

        if (a == 0 || b == 0) {
            return resultat;
        }

        int absA = a;
        int absB = b;
        if (a < 0) {
            absA = 0;
            int temp = a;
            while (temp != 0) {
                temp++;
                absA++;
            }
        }
        if (b < 0) {
            absB = 0;
            int temp = b;
            while (temp != 0) {
                temp++;
                absB++;
            }
        }

        // Déterminer si le résultat sera négatif
        boolean negatif = (a < 0 && b > 0) || (a > 0 && b < 0);

        // Multiplication
        for (int i = 0; i < absB; i++) {
            resultat = addition(resultat, absA);
        }

        if (negatif) {
            resultat = -resultat;
        }
        return resultat;
    }

    public static int division(int a, int b) {
        if (b <= 0) {
            throw new ArithmeticException("Division par zéro ou négatif");
        }

        int absA = a;
        int absB = b;
        if (a < 0) {
            absA = 0;
            int temp = a;
            while (temp != 0) {
                temp++;
                absA++;
            }
        }
        if (b < 0) {
            absB = 0;
            int temp = b;
            while (temp != 0) {
                temp++;
                absB++;
            }
        }

        int q = 0;
        int r = absA;

        // Calcule
        while (r >= absB) {
            r = addition(r, -absB);
            q = addition(q, 1);
        }

        // Ajuster le signe du quotient selon les signes de a et b
        if (a < 0) {
            if (r > 0) {
                q = addition(q, 1);
                q = -q;
            } else {
                q = -q;
            }
        }
        return q;
    }
}
