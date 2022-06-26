
public class StepTracker {
    static void addSteps(int [][] steps, int monthChoice, int dayChoice, int userSteps){


            if (monthChoice <= 12 && monthChoice != 0 && dayChoice <= 30 && dayChoice != 0 && userSteps > 0) {
                steps[monthChoice - 1][dayChoice - 1] += userSteps;
                System.out.println("Шаги за этот день: " + steps[monthChoice - 1][dayChoice - 1]);

            }
            else if(userSteps < 0){
                System.out.println("Кол-во шагов не может быть отрицательным!");
            }

            else if(monthChoice > 12 || monthChoice < 0){
                System.out.println("Ввод месяца должен быть от 1 до 12 (включительно) ");

            }
            else{
                System.out.println("Ввод дня должен быть от 1 до 30 (включительно)");


            }
    }

    static void stats(int[][] stat,int user,int command,int goal){
        if(user == 1) {
            if (command <= 12 && command != 0) {
                for (int i = 0; i <= 29; i++) {
                    System.out.println("За " + command + " месяц в " + (i + 1) + " день: " + stat[command - 1][i]);
                }
            }
            else {
                System.out.println("Месяц должен быть от 1 до 12(включительно)");

            }
        }
        else if(user == 2){
            int sum = 0;
            if (command <= 12 && command != 0) {

                for (int i = 0; i <= 29; i++) {
                    sum = sum + stat[command-1][i];
                }

                System.out.println("За " + command +"-й" + " месяц вы прошли: " + sum);

            } else {
                System.out.println("Месяц должен быть от 1 до 12(включительно)");


            }

        }

        else if(user == 3){
            int max = 0;
            if (command <= 12 && command != 0) {
                for(int i = 0; i<=29; i++){
                    if(max <= stat[command-1][i]){
                        max = stat[command-1][i];
                    }
                }
                System.out.println("Максимальное пройденное кол-во шагов в этом месяце: " + max);
            }
        }
        else if(user == 4){
            double average = 0;
            for(int i =0; i<=29; i++){
                average = average + stat[command-1][i];
            }
            average = average/30;
            System.out.println("Среднее кол-во шагов в день: " + average);


        }

        else if(user == 5){
            Converter.convertToKm(stat, command);
        }
        else if(user == 6){
            Converter.convertToCalorie(stat,command);
        }
        else if(user == 7){
            for(int i = 0; i<=29; i++){
                if(stat[command-1][i] >= goal){
                    System.out.println("За этот месяц в " + (i+1) + " день вы выполнили цель!");
                }
            }
        }
        else{
            System.out.println("Введите число от 1 до 7 (включительно)");
        }


    }




}