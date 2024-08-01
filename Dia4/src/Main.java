//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("printando");
        HelloWorld();
    }

    //metodos de classe
    public static void ForLoop1(){

        for(int i=0;i<=100;i+=2){
                System.out.println(i);
        }
    }

    public static void HelloWorld(){
        String frase = "Hello World";
        char[] chars = frase.toCharArray();
        for(char c : chars){
            System.out.print(c+" ");
        }
    }

}




