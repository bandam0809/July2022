package MyPackage;

import MyPackage1.DifferentPackage;

public class DifferentClass 
{
	public static void method2()
	{
		System.out.println("Static Method2 From Different Class");
	}
		
		public static void main(String[] args)
		{
		System.out.println("hello");
			method2();
			StaticMethod.method1();
			DifferentPackage.method3();
		}
	}

