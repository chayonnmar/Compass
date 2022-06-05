import java.util.Scanner;

public class Funcionarios {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe quantos funcionários serão cadastrados.");
        int numeroFuncionarios = entrada.nextInt();

        String nomeFuncionario[] = new String[numeroFuncionarios];
        double salarioFuncionario[] = new double[numeroFuncionarios];
        double bonus[] = new double[numeroFuncionarios];
        double desconto[] = new double[numeroFuncionarios];
        double salarioLiquido[] = new double[numeroFuncionarios];


        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("Informe o nome do funcionário " + (i + 1));
            nomeFuncionario[i] = entrada.next();
            System.out.println("Informe o salário do funcionário " + (i + 1));
            salarioFuncionario[i] = entrada.nextInt();
        }

        for(int i = 0; i < numeroFuncionarios; i++) {
            if(salarioFuncionario[i] <= 1000) {
                bonus[i] = (salarioFuncionario[i] * 20) / 100;
                salarioLiquido[i] = salarioFuncionario[i] + bonus[i];
            }if(salarioFuncionario[i]>1000 && salarioFuncionario[i]<2000){
                bonus[i] = (salarioFuncionario[i] * 10) / 100;
                salarioLiquido[i] = salarioFuncionario[i] + bonus[i];
            }if(salarioFuncionario[i]>=2000){
                desconto[i] = (salarioFuncionario[i] * 10)/ 100;
                salarioLiquido[i] = salarioFuncionario[i] - desconto[i];
            }
        }

        for(int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("Funcionário(a) " + nomeFuncionario[i]);
            System.out.println("Salário: " + salarioFuncionario[i]);
            System.out.println("Bonus: "+ bonus[i]);
            System.out.println("Desconto: "+ desconto[i]);
            System.out.println("Salário líquido: " + salarioLiquido[i]);
        }
    }
}

