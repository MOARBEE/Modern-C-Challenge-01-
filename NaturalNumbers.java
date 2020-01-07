import java.util.Scanner;
public class NaturalNumbers {

    Scanner scanner = new Scanner(System.in);
    private int choiceNumber;


    public int getChoiceNumber(){
        System.out.println("Enter a number/limit: ");
        choiceNumber = scanner.nextInt();
        return choiceNumber;
    }

    public void getNaturalNumbers(){
        getChoiceNumber();
        int number = 0;
        int total = 0;
        if(choiceNumber != 0 && choiceNumber > 0){
            for(int i = 0; i <= choiceNumber && number <= choiceNumber; i++) {
                number++;
                if (number % 3 == 0 || number % 5 == 0 && number <= choiceNumber) {
                    total += number;
                }
            }
            System.out.println("The sum of all numbers from 1 - " + choiceNumber +" are "+ total);
        }

        else{
            System.out.println("The number you have entered is invalid");
        }
    }

    public static void main(String[] args) {
        NaturalNumbers obj = new NaturalNumbers();
        obj.getNaturalNumbers();
    }
}
