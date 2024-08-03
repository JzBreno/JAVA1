public class Cliente {
    String name ;
    int idade ;
    //encapsulamento para que somente essa classe possa acessar com private
    private String conta;
    private String senha;
    //variavel de clash
    int cash;
    private String setando;
    //criando construtor de classe
    Cliente(String name, int idade){
        this.name = name;
        this.idade = idade;
        this.cash = 10;
    }

    public void Dados(){
        System.out.println("nome: "+name);
        System.out.println("idade: "+idade);
    }
    //getter
    public void Conta(String conta, String senha){
        this.conta = conta;
        this.senha = senha;
        if(this.conta != null && this.senha != null){
            System.out.println("Conta Feita com Sucesso");
        }
    }
    //getter onde puxa e retorna nas variaveis com encapsulation
    public void Getconta(){
        System.out.println("conta: "+conta);
        System.out.println("senha: "+senha);
    }
    //setter onde setamos variaveis private
    public void setSetando(String teste){
        this.setando = teste;
        System.out.println(setando);
    }


}
