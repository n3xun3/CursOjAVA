import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Help {
    public static void main(String[] args) {
        try {

            System.out.println("Help on:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println("Chosee one: ");
            char choice = (char) System.in.read();

            System.out.println(choice);

            switch(choice) {
                case '1':
                    System.out.println("The if:\n");
                    System.out.println("if (condition) statement");
                    System.out.println("else statement");
                    break;
                case '2':
                    System.out.println("The switch:\n");
                    System.out.println("switch (expression) {");
                    System.out.println(" case constant:");
                    System.out.println(" statement sequence");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                default:
                    System.out.print("Selection not found.");
            }

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}