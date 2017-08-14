package com.situ.day7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflactDemo {
	public static void main(String[] args) {
		String str = "java";
		Student student = new Student();
	}
	
	@Test
	public void testClass() throws ClassNotFoundException {
		//1.Class.forName("类路径");
		Class clazz1 = Class.forName("com.situ.day7.Student");
		//2.类名.class
		Class clazz2 = Student.class;
		//3.对象.getClass()
		Student student = new Student();
		Class clazz3 = student.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);
		
		System.out.println(clazz1.getName());;
	}
	
	@Test
	public void testConstructor() throws NoSuchMethodException, SecurityException {
		Class clazz = Student.class;
		Constructor[] cons = clazz.getConstructors();
		for (Constructor constructor : cons) {
			System.out.println(constructor);
		}
		System.out.println("-----------");
		Constructor constructor1 = clazz.getConstructor(String.class);
		System.out.println(constructor1);
		System.out.println("-----------");
		Constructor constructor2 = clazz.getConstructor();
		System.out.println(constructor2);
	}
	
	@Test
	public void testConstructor1() throws Exception {
		Class clazz = Student.class;
		Constructor constructor = clazz.getConstructor();
		System.out.println(constructor);
		//Student student = new Student();
		Student student = (Student) constructor.newInstance();
		//student.setName("zhangsan");
//		Method setNameMethod = clazz.getDeclaredMethod("setName", String.class, int.class);
		Method setNameMethod = clazz.getDeclaredMethod("setName", new Class[]{String.class, int.class});
//		setNameMethod.invoke(student, "zhangsan", 20);
		setNameMethod.invoke(student, new Object[]{"zhangsan", 20});
		String name = student.getName();
		System.out.println(name);
	}
	
	
	@Test
	public void testChangeField() throws Exception {
		Teacher teacher = new Teacher();
		System.out.println(teacher);
		changeField(teacher);
		System.out.println(teacher);
	}

	private void changeField(Object object) throws Exception {
		//1.获得对应的Class
		Class clazz = object.getClass();
		//2.获得所有的Fields
		Field[] fields = clazz.getDeclaredFields();
		//3.遍历所有的Field，如果是String类型，将包含b的改为a
		for (Field field : fields) {
			//3.1如果是String类型采取修改
			if (field.getType() == String.class) {
				//stu.name;
				field.setAccessible(true);//设置私有的也可以访问
				//3.2 得到Field的值
				String oldValue = (String) field.get(object);
				String newValue = oldValue.replace('a', 'b');
				//3.3将修改后的值重新设置到Field
				//stu.name="zhangsan"
				field.set(object, newValue);
			}
		}
	}

	
}
