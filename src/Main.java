import java.util.ArrayList;

public class Main {

    static String nomeProjeto;

    public static void main(String[] args) {
        nomeProjeto = "Primeiro projeto";

        System.out.println(nomeProjeto);

        Pessoa newPessoa = new Pessoa("Gabriel", "Oliveira", 26);

        System.out.println("Pessoa - Nome: " + newPessoa.nome + " - Idade: " + newPessoa.idade);

        System.out.println("Pessoa - Saudação: " + newPessoa.saudacao());

        Animal newAnimal = new Animal("Dog", 1, "Gabriel");

        System.out.println(
                "Animal - Nome: " + newAnimal.nome +
                " - Idade: " + newAnimal.idade +
                " - Dono: " + newAnimal.nomeDono
        );

        System.out.println("Animal - Saudação: " + newAnimal.saudacao());
    }
}