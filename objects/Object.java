
public class Object {
	public static void main(String[] args) {
		Class1 obj = new Class1();
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
		obj.prop++;
		System.out.println(obj.prop);

		var obj2 = new Class1();
		System.out.println(obj2.prop);
		// int i = 90; // primitive -> stack
		// System.out.println(i.hashCode());
		// System.out.println(i.getClass().getName());

		// java 8, 10
		// Integer i = new Integer(90);
		var i = new Integer(90);
		System.out.println(i.hashCode());
		System.out.println(i.getClass().getName());
	}
}

class Class1 {
	// static int prop = 10;
	int prop = 10;
}