package annotation;

public class Exercise2 {
	public static void main( String[] args ) throws Exception {
		System.out.println(new MyClassA().getClass().getAnnotation(AnnotationTypeInherited.class));
		System.out.println(new MyClassB().getClass().getAnnotation(AnnotationTypeInherited.class));
		System.out.println(new MyClassC().getClass().getAnnotation(AnnotationTypeInherited.class));
		System.out.println("_________________________________");
		System.out.println(new MyClassA().getClass().getAnnotation(AnnotationTypeUninherited.class));
		System.out.println(new MyClassB().getClass().getAnnotation(AnnotationTypeUninherited.class));
		System.out.println(new MyClassC().getClass().getAnnotation(AnnotationTypeUninherited.class));
	}
}

