import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Course courseOne = new Course("Objektorienterad-Programmering", "Hampus", 25);

        Course courseTwo = courseOne;

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("StudyManager Version 0.03");

        int end = 0;
        do {
            System.out.printf("1. Visa kurser %n2. Ändra kurs poäng %n3. Ändra kurs namn %n4. Ändra lärare %n0. Avsluta %n");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Programmet Avslutas...");
                    end = 1;
                    break;
                case 1:
                    courseOne.printInfo();
                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");
                    int choiceOne = scanner.nextInt();
                    switch (choiceOne) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                            break;
                        case 1:
                            
                            break;
                    
                        default:
                            System.out.println("Ogiltigt Val!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Välj hur många poäng kursen ska ha");
                    int changePoints = scanner.nextInt();

                    courseTwo.pointChanger(changePoints);
                    
                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");
                    int choiceTwo = scanner.nextInt();
                    switch (choiceTwo) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                            break;
                        case 1:
                            
                            break;
                    
                        default:
                            System.out.println("Ogiltigt Val!");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Skriv vad vill du ändra kurs namnet till!");

                    scanner.nextLine();

                    String nameChange = scanner.nextLine();
                    courseOne.nameChanger(nameChange);

                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");

                    int choiceThree = scanner.nextInt();
                    switch (choiceThree) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                            break;
                        case 1:
                            
                            break;
                    
                        default:
                            System.out.println("Ogiltigt Val!");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Skriv vad vill du ändra lärarens namn till!");

                    scanner.nextLine();

                    String teacherChange = scanner.nextLine();
                    courseOne.teacherChanger(teacherChange);

                    System.out.println("1. Gå tillbaka till börja 0. Avsluta");

                    int choiceFour = scanner.nextInt();
                    switch (choiceFour) {
                        case 0:
                            System.out.println("Programmet Avslutas");
                            end = 1;
                            break;
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