import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();



        if (num==0){
            System.out.println("num is zero number");
        }
        else if (num<0){
            System.out.println("num is negative number");
        }else{
            System.out.println("num is Positive number");
        }


        scanner.close();
    }
}