import java.time.LocalTime;
import java.util.Scanner;

public class LoginSenha {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu login: ");
        String login = entrada.nextLine();
        System.out.println("Informe sua senha: ");
        String senha = entrada.nextLine();


        LocalTime horaAtual = LocalTime.now();
        int hour = horaAtual.getHour();
        //System.out.println(hour);


        if (login.equals("Chayonn") && senha.equals("1234") && (hour >= 0 && hour <= 5)){
            System.out.println("Boa madrugada, você se logou ao nosso sistema.");
        }else if (login.equals("Chayonn") && senha.equals("1234") && (hour >= 6 && hour <= 11)){
            System.out.println("Bom dia, você se logou ao nosso sistema.");
        }else if (login.equals("Chayonn") && senha.equals("1234") && (hour >= 12 && hour <= 17)){
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
        }else if (login.equals("Chayonn") && senha.equals("1234") && (hour >= 18 && hour <= 23)){
            System.out.println("Boa noite, você se logou ao nosso sistema.");
        }else{
            System.out.println("Usuário e/ou senha incorretos!");
        }
    }
}




