public class Repeticao {
    public static void main(String[] args) {

        // WHILE
        int contador = 0;
        while (contador < 3) {
            System.out.println("olá, vou repetir 3 vezes");
            contador += 1;
        }
        
        // IMPRIMIR DE 0 A 10 DE 2 EM 2
        System.out.println("\nWHILE");
        int cont = 0;
        while (cont < 10) {
            System.out.println(cont);
            cont += 2;
        }

        // DO WHILE
        System.out.println("\nDO WHILE");
        int cont2 = 0;
        do {
            System.out.println(cont2);
            cont2 += 2;
        } while (cont2 < 10);

        // FOR
        System.out.println("\nFOR");
        // int cont3 = 0;
        for (int cont3 = 0; cont3 < 10; cont3 += 2) {
            System.out.println(cont3);
        }
    }
}
