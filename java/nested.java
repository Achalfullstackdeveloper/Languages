import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Amount:");
        int amount = scanner.nextInt();
        System.out.println("Enter the Balance:");
        int balance = scanner.nextInt();

        if (amount > balance) {
            System.out.println("Insufficient Funds");
        }
        else if (amount % 100 != 0)
        {
            System.out.println("Amount should be a multiple of 100");
        }
        else{
            System.out.println("Transaction Successful");
        }
        scanner.close();
    }
}


