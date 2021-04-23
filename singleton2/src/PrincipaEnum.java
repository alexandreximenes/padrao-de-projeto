import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrincipaEnum {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Janela janela = JanelaEnum.getInstanceLazy();
        Janela janela2 = JanelaEnum.getInstanceLazy();
        Janela janela3 = null;

       Constructor[] constructors = JanelaEnum.class.getDeclaredConstructors();
       for(Constructor constructor : constructors){
           constructor.setAccessible(true);
           boolean b = constructor.trySetAccessible();
           System.out.println(b);
           janela3 = (Janela) constructor.newInstance();
       }

        System.out.println(janela.hashCode());
        System.out.println(janela2.hashCode());
        System.out.println(janela3.hashCode());
    }
}
