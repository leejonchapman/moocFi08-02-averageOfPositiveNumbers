import java.util.Scanner;

public class UserInterface {
    Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        boolean runMenu = true;
        int count = 0;
        int total = 0;
        while (runMenu) {
            int uI = scanner.nextInt();
            if (uI == 0) {
                if (total <= 0) {
                    System.out.println("Cannot calculate the average");
                    runMenu = false;
                    break;
                } else {
                    runMenu = false;
                    System.out.println((float) total / count);
                    break;
                }
            }
            if (uI > 0) {
                count++;
                total += uI;
            }
        }
    }
}
