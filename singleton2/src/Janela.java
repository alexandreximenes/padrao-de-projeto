public class Janela {

    private Janela(){}

    //Eager initialization
    private static Janela getInstanceEager = new Janela();

    public static Janela getInstanceEager(){
        return getInstanceEager;
    }

    //Lazy initialization
    private static Janela janelaLazy = null;

    public static Janela getInstanceLazy(){
        if(janelaLazy == null){
            janelaLazy = new Janela();
        }
        return janelaLazy;
    }

    //Outra forma de fazer a mesma coisa de JanelaEnum
    enum JanelaEnum{

        JanelaEnum(){};

        public static Janela INSTANCE(){
            return janelaLazy;
        }

    }

    public static Janela getInstanceLazyCorreto(){
        if(janelaLazy == null){
            synchronized (Janela.class){
                janelaLazy = new Janela();
            }
        }
        return janelaLazy;
    }
}
