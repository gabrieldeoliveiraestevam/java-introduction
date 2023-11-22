public class Animal extends Ser{
    // Modificadores de acesso = private, public, protected
    public String nomeDono;
    public Animal(String nome, int idade, String nomeDono) {
        super(nome, idade);
        this.nomeDono = nomeDono;
    }

    // POLIMORFISMO
    public String saudacao(){
        return "BARULHO";
    }
}
