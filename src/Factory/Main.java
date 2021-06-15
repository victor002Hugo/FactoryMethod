package Factory;

public class Main {

    public static void main(String[] args) {


       CamisaEsportiva camisaEsportiva = CamisaEsportivaFactory.criarCamisa("Adidas");

        System.out.println(camisaEsportiva.retornaTime());
    }
}
