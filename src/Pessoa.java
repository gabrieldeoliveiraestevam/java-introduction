// Herança - Classe Pessoa herda os atributos e métodos da classe Ser
public class Pessoa extends Ser {
    public String sobrenome;
    public Pessoa(String nome, String sobrenome, int idade){
        super(nome, idade); // Passar os atributos para a classe MÃE
        this.sobrenome = sobrenome;
    }

    // POLIMORFISMO - Herda o metodo saudacao da mesma classe, porem tem açoes diferentes
    public String saudacao(){
        return "OLA TUDO BEM?";
    }
}

