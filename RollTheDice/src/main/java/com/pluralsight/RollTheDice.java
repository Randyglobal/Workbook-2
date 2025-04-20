package com.pluralsight;

public class RollTheDice {
    static int roll1;
    static int roll2;
    static int twoCounter = 0;
    static int fourCounter = 0;
    static int sixCounter = 0;
    static int sevenCounter = 0;
    public static void main(String[] args) {
        Dice dice = new Dice();
        for(int i = 0; i < 20; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int Sum = roll1 + roll2;
            displayResult("Roll 1:" + roll1 + "-" + roll2 + "Sum:  " + Sum);

            if (Sum == 2){
                twoCounter++;
            } else if (Sum == 4) {
                fourCounter++;
            } else if (Sum == 6) {
                sixCounter++;
            } else if (Sum == 7) {
                sevenCounter++;
            }
        }
        results();
    }
    public static String displayResult(String message){
        System.out.println(message);
        return message;
    }
    public static void results(){
        displayResult("2 occurs  " + twoCounter);
        displayResult("4 occurs  " + fourCounter);
        displayResult("6 occurs  " + sixCounter);
        displayResult("7 occurs  " + sevenCounter);
    }
}
