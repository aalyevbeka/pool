import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//lamb
public class PasswordsValidator {
    static boolean ValidPassword(String password) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[0-9])" + "(?=\\S+$).{6,32}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);


            while (scanner.hasNextLine()) {
                String pwd = scanner.nextLine();
                if (ValidPassword(pwd))
                System.out.println("Senha valida.");
                else
                    System.out.println("Senha invalida.");
            }

        }
    }
