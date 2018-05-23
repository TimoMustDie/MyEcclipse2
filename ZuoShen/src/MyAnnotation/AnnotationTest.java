package MyAnnotation;

@myAnnotation(value="abc",attr= {3,4,5},mataAnnotation=@MataAnnotation("bbb"))
public class AnnotationTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.runFinalizersOnExit(false);
		method1();
		if(AnnotationTest.class.isAnnotationPresent(myAnnotation.class)) {
			myAnnotation annotation=AnnotationTest.class.getAnnotation(myAnnotation.class);
			System.out.println(annotation);
			System.out.println(annotation.color());
			System.out.println(annotation.value());
			System.out.println(annotation.attr().length);
			System.out.println(annotation.mataAnnotation().value());
		}
	}
	@Deprecated
	public static void method1() {
		System.out.println("加了注解已经过时的方法");
	}
}
