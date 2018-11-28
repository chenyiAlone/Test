package test._io;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class TestExternal implements Externalizable{
	private int count = 0;
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream ow = new ObjectOutputStream(new FileOutputStream(new File("h:testExternal.out")));
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("h:testExternal.out")));
		TestExternal 
			outobj = new TestExternal();
		ow.writeObject(outobj);
		ow.close();
		TestExternal inobj = (TestExternal)oi.readObject();
		System.out.println(inobj);
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(count);
		System.out.println("writeExternal();");
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		count = (int)in.readObject();
		System.out.println("readExternal();");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass().getSimpleName()+"-->"+count;
	}

}
class Blip1 implements Externalizable {
	public Blip1() {
		System.out.println("Blip1 Constructor");
	}
	public void writeExternal(ObjectOutput out)throws IOException {
		System.out.println("Blip1 Constructor");
	}
	public void readExternal(ObjectInput in)throws IOException, ClassNotFoundException {
		System.out.println("Blip1 Constructor");
	}
}
