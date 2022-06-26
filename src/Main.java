import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int goal = 10000;
        int [][] stepsPerYear = new int[12][30];
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int command = scanner.nextInt();
        while(true){
            if(command == 1){
                printMonth();
                System.out.println("Введите месяц");
                int monthChoice = scanner.nextInt();
                System.out.println("Введите день: ");
                int dayChoice = scanner.nextInt();
                System.out.println("Введите кол-во шагов: ");
                int userSteps = scanner.nextInt();
                StepTracker.addSteps(stepsPerYear,monthChoice,dayChoice,userSteps);
            }
            else if(command == 2){

                System.out.println("Что вы хотите сделать?");
                System.out.println("1. Кол-во пройденных шагов по дням в месяц");
                System.out.println("2. Общее кол-во шагов за месяц");
                System.out.println("3. Максимальное пройденное кол-во шагов в месяце");
                System.out.println("4. Среднее кол-во шагов за месяц");
                System.out.println("5. Пройденная дистанция в километрах");
                System.out.println("6. Количество сожжённых килокалорий");
                System.out.println("7. Лучшая серия за месяц");
                int user = scanner.nextInt();
                System.out.println("За какой месяц вы хотите вывести статистику?(1-12) ");
                int month = scanner.nextInt();

                StepTracker.stats(stepsPerYear, user, month,goal);

            }
            else if(command == 3){
                System.out.println("Введите число чтобы установить новую цель шагов в день");
                goal = scanner.nextInt();
            }
            else if(command == 4){
                System.out.println("Выход...");
                break;
            }
            else{
                System.out.println("Введите число от 1 до 4 (включительно)");
            }
            printMenu();
            command = scanner.nextInt();

        }

    }

    public static void printMenu(){

            System.out.println("Что вы хотите сделать?");
            System.out.println("1. Ввести количество шагов за определённый день");
            System.out.println("2. Напечатать статистику за определённый месяц");
            System.out.println("3. Изменить цель по количеству шагов в день");
            System.out.println("4. Выйти из приложения");

    }

    public static void printMonth() {
        System.out.println("1. Январь");
        System.out.println("2. Февраль");
        System.out.println("3. Март");
        System.out.println("4. Апрель");
        System.out.println("5. Май");
        System.out.println("6. Июнь");
        System.out.println("7. Июль");
        System.out.println("8. Август");
        System.out.println("9. Сентябрь");
        System.out.println("10. Октябрь");
        System.out.println("11. Ноябрь");
        System.out.println("12. Декабрь");

    }
}
