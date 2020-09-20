package annotation;

import java.lang.reflect.Method;

public class Exercise1 {
	public static void main( String[] args ) throws Exception {
		Method[] methods = MyAppWithAnnotation.class.getMethods();
		for( Method m : methods ) {
			if( m.isAnnotationPresent( MyMethodAnnotation.class ) ) {
				MyMethodAnnotation a = m.getAnnotation( MyMethodAnnotation.class );
				System.out.println( "Method: " + m.getName() );
				System.out.println( "name(): " + a.name() );
				System.out.println( "address(): " + a.address() );
			}
		}
	}
}
