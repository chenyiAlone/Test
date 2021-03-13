package com.demo.test.test._io;

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
import java.io.Serializable;

/**
 * 
 * ClassName: TestExternal
 * @author chenyiAlone  
 * Create Time: 2019/01/02 14:57:17
 * Description: 测试Externalizable和Serializable接口的区别之处
 * 
 * 1.使用Serializable接口进行序列化，transient关键字可以保护变量不被序列化
 * 2.使用Externalizable接口时
 *      a.必须拥有public默认构造器
 *      b.调用其内部的writerExternal(OutputStream os)和readExternal(InputStream is)方法,
 *        因此可以直接将带有transient关键字(无效)的变量写入,逻辑都是写在这里,两个方法的读写顺序要一致
 */
public class TestExternal implements Serializable /* Externalizable */{
    public TestExternal(int count) {
        this.count = count;
    }
    public TestExternal() {
        
    }
	private transient int count = 0;
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream ow = new ObjectOutputStream(new FileOutputStream(new File("h:testExternal.out")));
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(new File("h:testExternal.out")));
		TestExternal 
			outobj = new TestExternal(2);
		ow.writeObject(outobj);
		System.out.println(outobj);
		ow.close();
		TestExternal inobj = (TestExternal)oi.readObject();
		System.out.println(inobj);
		
	}
	/*

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(count);
		System.out.println("writeExternal();");
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		count = (int)in.readObject();
		System.out.println("readExternal();");
		
	}
	*/
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
