import java.util.Scanner;
public class ReadingInput {
    public static String read(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Expression");
        String inputLine= scanner.nextLine();
        scanner.close();
        return inputLine;
    }

}
