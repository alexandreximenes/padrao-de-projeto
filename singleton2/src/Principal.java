public class Principal {

    public static void main(String[] args) {

        Janela janela = Janela.getInstance();
        Janela janela2 = Janela.getInstance();
        Janela janela3 = Janela.getInstance();

        System.out.println(janela.getnInstance());
        System.out.println(janela2.getnInstance());
        System.out.println(janela3.getnInstance());
    }
}
