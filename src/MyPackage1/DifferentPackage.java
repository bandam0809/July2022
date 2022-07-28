package MyPackage1;

import MyPackage.DifferentClass;
import MyPackage.StaticMethod;

public class DifferentPackage 
{
	public static void method3()
	{
		System.out.println("Static Method3 From Different Package");
	}
		public static void main(String[] args) 
		{
			System.out.println("good");
			method3();
			DifferentClass.method2();
			StaticMethod.method1();
			}
	}

