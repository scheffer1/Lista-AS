import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lista canil= new Lista();
        Scanner tc = new Scanner(System.in);
       for(int i=0;i<4;i++){
           Cao cao = new Cao();
           cao.ler();
           System.out.println(cao);
           canil.addFim(cao);
       }

        System.out.println(canil.toString());
        System.out.println("Quantos elementos tem?"+canil.size());
        if(canil.isEmpty()){
            System.out.println("Vazia");
        }else{
            System.out.println("Cheia");
        }

        canil.exibir();
        System.out.println("Nome a ser removido;");
        String lel = tc.next();
        canil.removerNome(lel);
        canil.exibir();

    }
}
