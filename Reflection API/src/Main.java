import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

    Cat myCat = new Cat("Kuro", 6);
  Field[] catFields = myCat.getClass().getDeclaredFields();

  // myCat.name = "Dem" -> this is impossible because name is private

  // with Reflection i can make that, private or no


  for(Field field: catFields){
      if (field.getName().equals("name")){
          field.setAccessible(true);
          field.set(myCat, "goiaba");
           System.out.println(myCat.getName());


             }
        }

        Method[] catMethods = myCat.getClass().getDeclaredMethods();

        for(Method method: catMethods){
            if(method.getName().equals("heyThisIsPrivate")){
                method.setAccessible(true);
                method.invoke(myCat);
            }
             System.out.println(method.getName());
        }

    }
}