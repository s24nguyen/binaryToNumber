import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Binary to Decimal Calculator Program\n");
        System.out.println("Enter a binary number value: ");
        Scanner scanner = new Scanner(System.in);
        String buffer = scanner.nextLine();
        System.out.println("You entered: " + buffer + " for conversion.\n");
        System.out.println("Processing the data...");
        System.out.println("Decimal number is: " + Binary2Decimal(buffer));
        
    }
    private static int Binary2Decimal (String binary){
        int result = 0;
        for (int i = 0; i < binary.length(); i++)
        {
            int digit = Character.getNumericValue(binary.charAt(i));
            int position = binary.length()-1-i;
            result += digit * Math.pow(2,position);
        }
        return result;
    }
}
