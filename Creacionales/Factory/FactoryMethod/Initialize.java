import java.util.Scanner;

public class Initialize {
    public static void main(String[] args) {
        Dialog dialog= null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipo de ambiente");

        String ambiente = scanner.nextLine();

        if(ambiente.equals("Windows")) {
            dialog = new WindowsDialog();
        }else if(ambiente.equals("HTML")) {
            dialog = new WebDialog();
        }
        else {
            System.out.println("Error");
        }

        dialog.render();
    }
}
