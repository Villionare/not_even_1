package FILM.Annotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ImportantBlock(times = 3, age = 23, name = "classAnnotation")
public class AnnotationImplementation {
    String name = "jj thompson";

    static void main() throws InvocationTargetException, IllegalAccessException {

        AnnotationImplementation annotationImplementation = new AnnotationImplementation();
        //System.out.println(annotationImplementation.getClass().isAnnotationPresent(Annotationsx.class));

        for (Method mm : annotationImplementation.getClass().getDeclaredMethods()) {

            if (mm.isAnnotationPresent(ImportantBlock.class)) {

                ImportantBlock importantBlock = mm.getAnnotation(ImportantBlock.class);

                //we will run the annotation till the no of times
                for (int i = 1; i <= importantBlock.times(); i++)
                    mm.invoke(annotationImplementation);

            }
        }
    }

    void star() {
        System.out.println("starrrr....");
    }

    @MethodOne
    void dragon() {
        System.out.println("dragonnnn....");
    }


    @ImportantBlock(name = "jugnoo", age = 11, times = 10)
    void jugnoo() {
        System.out.println("jugnoo.....");
    }
}