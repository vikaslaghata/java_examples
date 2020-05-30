import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ParentDeserializationTest {

	public static void main(String[] args) {
		try {
			System.out.println("Creating...");
			Child c = new Child(1);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			c.field = 10;
			System.out.println("Serializing...");
			oos.writeObject(c); //Serializable is that the first non-serializable superclass in its inheritance hierarchy must have a no-argument constructor.
			oos.flush();
			baos.flush();
			oos.close();
			baos.close();

			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			System.out.println("Deserializing...");
			Child c1 = (Child) ois.readObject();
			System.out.println("c1.i=" + c1.getI());
			System.out.println("c1.field=" + c1.getField());
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public static class Parent  { //implements Serializable  { // If we open commented part then constutor will not call and  System.out.println("Parent::Constructor"); will not print.
		 
		protected int field;

		protected Parent() {
			field = 5;
			System.out.println("Parent::Constructor");
		}

		public int getField() {
			return field;
		}
	}

	public static class Child extends Parent implements Serializable {
		protected int i;

		public Child(int i) {
			this.i = i;
			System.out.println("Child::Constructor");
		}

		public int getI() {
			return i;
		}
	}
}
