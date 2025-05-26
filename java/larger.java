import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number2:");
        int num2 = scanner.nextInt();


        if (num1>num2){
            System.out.println("num1 is greater");
        }
        else{
            System.out.println("num2 is greater");
        }


        scanner.close();
    }
}