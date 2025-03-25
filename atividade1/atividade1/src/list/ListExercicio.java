package list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExercicio {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        ArrayList<String> cores = new ArrayList<String>();

        for(int i = 0; i < 5; i++) {
            System.out.println("Digite uma cor: ");
            cores.add(ler.nextLine());
        }

        System.out.println(cores);

        cores.sort(null);

        for(String cor: cores) {
            System.out.println(cor);
        }
        
        ler.close();
    }
}
