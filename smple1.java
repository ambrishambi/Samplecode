package Ifexample;

public class Ladder {
    public static void main(String[] args) {
        //Creating two variables for age and weight
        int age = 25;
        int weight = 48;
        //applying condition on age and weight
        if (age>=18){
            if(weight>50){
                System.out.println("you are eligible to donte blood");
            }
            else{
                System.out.println("you are not eligible to donte blood");
            }
        }
        else{
            System.out.println("Age must be greater then 18");
        }
    }
}
