import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> uczniowie = new ArrayList<>();

        System.out.println("dodaj pieciu uczniow do listy: ");
        for (int i = 0; i < 5; i++){
            System.out.println("imie i nazwisko ucznia nr: "+ (i+1) + ".");
            String uczenImie = scanner.nextLine();
            uczniowie.add(uczenImie);
        }
        System.out.println("lista uczniow: ");
        for (String uczen : uczniowie){
            System.out.println(":) "+ uczen);
        }
    }
}