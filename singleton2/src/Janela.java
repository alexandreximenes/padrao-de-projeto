public class Janela {


    private Janela(){}

    private static Janela janela = null;
    private static int nInstance = 0;

    public static Janela getInstance(){
        if(janela == null){
            nInstance += 1;
            janela = new Janela();
        }
        return janela;
    }

    public static int getnInstance() {
        return nInstance;
    }

    public static void setnInstance(int nInstance) {
        Janela.nInstance = nInstance;
    }
}
