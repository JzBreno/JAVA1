import java.util.Scanner;

public class ProjetoDia3 {

    public void contChar(String numero){
        if(numero.length()>=5){
            System.out.println("maior que 5");
        }else if(numero.length() == 4){
            System.out.println("igual 4");
        }else if(numero.length() == 3){
            System.out.println("igual a 3");
        }else if(numero.length() == 2){
            System.out.println("iguala 2");
        }else{
            System.out.println("igual a 1");
        }
    }

}
