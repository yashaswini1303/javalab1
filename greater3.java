import java.util.Scanner;

public class greater3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the number:");
        int num1= scanner.nextInt();
        System.out.println(" Enter the number:");
        int num2= scanner.nextInt();
        System.out.println(" Enter the number:");
        int num3= scanner.nextInt();
        

        if(num1>num2){
            if(num1>num3){
                System.out.println(" num 1 is greater="+num1);
        }
            else {        
                System.out.println("num 2 is greater ="+num3);
        }
    }
        else{
            if(num2>num3){
                System.out.println("num 2 is greater ="+num2);
            }
            else{
                System.out.println("num 3 is greater ="+num3);
            }
        }
        
        }


    }

  
