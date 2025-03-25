package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetExercicio {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<Integer>();

            for(int i = 0; i < 10; i++) {
                System.out.println("Digite um numero");
                numeros.add(ler.nextInt());
        }

        Iterator<Integer> iNumeros = numeros.iterator();
        

        while(iNumeros.hasNext()) {
            System.out.println(iNumeros.next());
        }

        ler.close();

    }
}
