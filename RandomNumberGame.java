import java.util.Scanner;
class RandomNumber{
    private int count=0;
    private int myNumber;
    private int compNumber;
// Using constructor for generating random number 
public RandomNumber(){
compNumber=(int)(Math.random()*100);
}
// Using setNumber method for setting my number 
public void setNumber(int n){
    myNumber=n;
}
// Using isCorrect method for comparing my number with computer number 
public int isCorrect(){
    if(myNumber==compNumber){
        return 0;
    }
    else if(myNumber>compNumber){
        return -1;
    }
    else{
        return 1;
    }
}
//Using setCount method for increasing the value of no of count of guesses
public void setCount(){
    count++;
}
// Using getCount method for checking after how many moves you guess the number correct
public void getCount(){
    System.out.println("You get the number correct after :"+ count +" guesses.");
}
}
public class RandomNumberGame{
    public static void main(String args[]){
         RandomNumber obj =new RandomNumber();
         Scanner sc=new Scanner(System.in);

         while(true){
            System.out.println("Enter a number between 1 to 100 (1-100): ");
            int n = sc.nextInt();
            obj.setNumber(n);

            if(obj.isCorrect() == 0){
                obj.setCount();
                System.out.println("Congratulations!! You have guessed the correct number");
                obj.getCount();
                break;
            }
            else if(obj.isCorrect() == -1){
                obj.setCount();
                System.out.println("Enter smaller number!!");
            }
            else if(obj.isCorrect() == 1){
                obj.setCount();
                System.out.println("Enter larger number!!");
            }
         }
    }
}
