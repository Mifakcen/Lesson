package HomeWork_10_12;

import java.lang.reflect.Field;

public class ToString {
    public static String toStr(Object obj) throws NoSuchFieldException, IllegalAccessException {
        String str = "";
        Class cls =  obj.getClass();
       Field[] fields = cls.getDeclaredFields() ;
        str+= cls.getSimpleName()+"\n";
        Field field ;
        for (Field i : fields){
            field = cls.getDeclaredField(i.getName());
            field.setAccessible(true);
            System.out.println(i);
            str+= i.getName() + " " + field.get(obj) + "\n"  ;
        }
        return str;
    }
}
