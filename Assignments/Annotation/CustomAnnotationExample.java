package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.annotation.Retention;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ interface TestAnnotation{
	String teacher() default "Sahil";
	String subject();
}

public class CustomAnnotationExample {
    int a;
 
   @TestAnnotation(teacher="sachine", subject="Java Full Stack")
   public void method1() {
	   System.out.println("Test method 1");
   }
   
  @TestAnnotation(teacher="Myname", subject="Java Full Stack")
   public void method2() {
	   System.out.println("Test method 2");
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   Method m = CustomAnnotationExample.class.getMethod("method2");
    	   TestAnnotation personAnnotation =(TestAnnotation) m.getAnnotation(TestAnnotation.class);
    	   if(personAnnotation != null) {
    		   System.out.println("Name : "+personAnnotation.teacher());
    		   System.out.println("Subject : "+personAnnotation.subject());
    		   System.out.println("-------------------");
    	   }
       }
       catch(NoSuchMethodException e) {
    	   System.out.println("No such Methods Exception");
    	   return;
       }
       
       CustomAnnotationExample obj = new CustomAnnotationExample();
       obj.method1();
       obj.method2();
	}

}
