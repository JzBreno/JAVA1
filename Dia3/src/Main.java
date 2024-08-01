import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            //inicializando classe e instanciando objeto para usar funcao com operadores logicos
           OperaLodicos a = new OperaLodicos();
           a.mostrar();

        Scanner scan = new Scanner(System.in);
        ProjetoDia3 projeto = new ProjetoDia3();
        String numero = "continuar";
        while(numero == "continuar"){
            System.out.println("digite o numero para contar");
            projeto.contChar(scan.nextLine());
            System.out.println("digite para se quiser parar");
            numero = scan.nextLine();
            System.out.println("valor de numero e: "+numero);
        }

        scan.close();

    }
}
