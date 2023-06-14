package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class reflectionClass = Reflection.class;
       Method[] methods = reflectionClass.getDeclaredMethods();

       for (Method method: methods){
           Author annotation = method.getAnnotation(Author.class);
           if (annotation != null){
           System.out.println(method.getName() + " " + annotation.name());

           }
       }

    }
}
