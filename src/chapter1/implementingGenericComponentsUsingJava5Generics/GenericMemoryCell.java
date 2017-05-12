package chapter1.implementingGenericComponentsUsingJava5Generics;

public class GenericMemoryCell<AnyType> {

	private AnyType storedValue;
	
	public AnyType read() {
		return storedValue;
	}

	public void write( AnyType x ) {
		storedValue = x;
	}
	
}
