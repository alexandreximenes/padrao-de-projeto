import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrincipalReflection {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Janela janela = Janela.getInstanceLazyCorreto();
        Janela janela2 = Janela.getInstanceLazyCorreto();
        Janela janela3 = null;

       Constructor[] constructors = Janela.class.getDeclaredConstructors();
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
