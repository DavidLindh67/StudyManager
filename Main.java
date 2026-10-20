import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("StudyManager Version 0.02");

        int end = 0;
        do {
            System.out.printf("1. Visa kurser%n2.Lägg till kurs%n3.Visa Uppgifter%n0. Avsluta%n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Programmet Avslutas...");
                    end = 1;
                    break;
                case 1:
                    System.out.println("Visa kurser kommer snart...");
                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");
                    int choiceOne = scanner.nextInt();
                    switch (choiceOne) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                        case 1:
                            
                            break;
                    
                        default:
                            System.out.println("Ogiltigt Val!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Lägga till kurser kommer snart...");
                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");
                    int choiceTwo = scanner.nextInt();
                    switch (choiceTwo) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                        case 1:
                            
                            break;
                    
                        default:
                            System.out.println("Ogiltigt Val!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Visa uppgifter kommer snart...");
                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");
                    int choiceThree = scanner.nextInt();

                    switch (choiceThree) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                        case 1:
                            
                            break;
                    
                        default:
                            System.out.println("Ogiltigt Val!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Ogiltigt Val!");
                    break;
            }


        } while (end == 0);
    }
}