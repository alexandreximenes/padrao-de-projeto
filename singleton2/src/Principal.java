public class Principal {

    public static void main(String[] args) {

        Janela janela = Janela.getInstanceLazyCorreto();
        Janela janela2 = Janela.getInstanceLazyCorreto();
        Janela janela3 = Janela.getInstanceLazyCorreto();

        System.out.println(janela.hashCode());
        System.out.println(janela2.hashCode());
        System.out.println(janela3.hashCode());


    }
}
