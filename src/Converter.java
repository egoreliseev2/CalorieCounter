public class Converter {
    static void convertToKm(int[][] steps,int command){
        double distance = 0;
        for(int i =0; i<=29; i++){
            distance = distance + steps[command-1][i];
        }
        distance = distance * 0.00076;//нужно ли сделать сделать (int)
        System.out.println("Вы прошли: " + distance + " километров");


    }
    static void convertToCalorie(int[][] steps, int command){
        double calorie = 0;
        for(int i = 0; i<=29; i++){
            calorie = calorie + steps[command-1][i];
        }
        calorie = calorie * 50;
        if(calorie >= 1000){
            calorie = calorie/1000; //нужно ли сделать сделать (int) что бы в ответе было без .0
            System.out.println("За месяц вы сожгли: " + calorie + " килокалорий");

        }
        else{
            System.out.println("За месяц вы сожгли: " + calorie + " калорий");
        }


    }
}
