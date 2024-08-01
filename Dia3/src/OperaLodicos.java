public class OperaLodicos {
    boolean tememprego = true;
    boolean temempresa = true;
//exemplificando o uso de operadores logicos no if else
    public void mostrar(){
        boolean podefinanciar = tememprego || temempresa;
        int valorinvestido = 20000;
        int parcelas = 50;
        if (podefinanciar){
            if(valorinvestido > 15000 && parcelas < 50){
                System.out.println("pode financiar!");
            }else{
                System.out.println("Nao pode financiar!");
            }
        }
    }



}
