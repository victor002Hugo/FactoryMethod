package Factory;

public class CamisaEsportivaFactory {

    public static CamisaEsportiva criarCamisa(String nomeMarca){
        if(nomeMarca.equals("Nike")){
            return new Nike();
        }else if(nomeMarca.equals("Adidas")){
            return new Adidas();
        }else if (nomeMarca.equals("Puma")){
            return new Puma();
        }else if (nomeMarca.equals("Umbro")){
            return new Umbro();
        }else if(nomeMarca.equals("Kappa")){
            return new Kappa();
        }

        return null;
    }
}
