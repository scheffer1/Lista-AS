import java.util.Objects;
import java.util.Scanner;

public class Cao {
    public String nome;
    public Cao proximo;

    @Override
    public String toString() {
        return "Cao{" +
                "nome='" + nome + '\'' +
                ", proximo=" + proximo +
                '}';
    }

    public void ler(){
        System.out.println("Digite nome");
        Scanner tc = new Scanner(System.in);
        nome=tc.next();
       // System.out.println("Digite raca");
    ///     raca=tc.next();
    }
    public void exibir(){
        System.out.println("Nome:"+nome);
    }

    public Cao() {
    }
    public Cao(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cao cao = (Cao) o;
        return Objects.equals(nome, cao.nome);
    }


}
