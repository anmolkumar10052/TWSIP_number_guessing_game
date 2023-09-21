import java.util.Random;
import java.util.Scanner;
class Num_guess_game{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("-------------------------Welcome to world of number guessing game -----------------------");
        Random game=new Random();
        int random_number;
        random_number=1+game.nextInt(100);

        System.out.println("GUESS a number to WIN this game ");
        System.out.println();
        System.out.println("You have only five attempt to GUESS ");
    
        for(int i=1;i<=5;i++){
            System.out.println("GUESS & Enter the number Between 1-100 ------ ");
            int number=sc.nextInt();
            if(number==random_number){
                System.out.println("OOHHOOO ! YOUR number is correct YOU win the game . " );
                break;
            }
            else if(number>random_number){
                System.out.println("YOUR guess number is Greater .");
                System.out.println("You have " + (5-i) + " Attempt left" );
            }
            else if(number<random_number){
                System.out.println("YOUR guess number is Smaller .");
                System.out.println("You have " + (5-i) + " Attempt left" );
            }

            }
            System.out.println();
            System.out.println();
            System.out.println(" SORRY ! YOU have lost all five attempts .........BETTER LUCK NEXT TIME ");
        }
    }
