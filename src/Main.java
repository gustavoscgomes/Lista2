import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa ();

        System.out.print("Digite seu nome: ");
        p.setNome(sc.next());

        System.out.print("Digite seu endereco: ");
        p.setEndereco(sc.next());

        System.out.print("Digite sua idade: ");
        p.setIdade(sc.nextInt());

        System.out.println("Nome: "+p.getNome());
        System.out.println("Endereco: "+p.getEndereco());
        System.out.println("Idade: "+p.getIdade());


    }
}
