package FILM.Annotations;

import java.lang.reflect.Field;

public class AnnotationUsage {

    @ImportantFields(degree = 5)
    String name;

    String bio;

    @ImportantFields(degree = 3)
    int age;

    @ImportantFields(degree = 5)
    long phone;

    @ImportantFields(degree = 2)
    boolean available;

    boolean maritalStatus;

    public AnnotationUsage(String name, String bio, int age, long phone, boolean available, boolean maritalStatus) {
        this.name = name;
        this.bio = bio;
        this.age = age;
        this.phone = phone;
        this.available = available;
        this.maritalStatus = maritalStatus;
    }

    static void main() throws IllegalAccessException {
        AnnotationUsage annotationUsage = new AnnotationUsage("shakti", "just another human", 32, 1234567899, true, true);

        //now we will check how many fields have the ImportantFields annotation
        for (Field field : annotationUsage.getClass().getDeclaredFields()) {

            if (field.isAnnotationPresent(ImportantFields.class)) {

                ImportantFields importantFields = field.getAnnotation(ImportantFields.class);
                int degree = importantFields.degree();

                Object fieldValues = field.get(annotationUsage);

                for (int i = 0; i < degree; i++)
                    System.out.println(fieldValues);
            }
        }

    }
}
