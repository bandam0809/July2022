package MyPackage;

import MyPackage1.DifferentPackage;

public class StaticMethod
{
public static void method1()
{
	System.out.println("Static Method1 From Same Class");
}
	
	public static void main(String[] args)
	{
	System.out.println("hi");
		method1();
		DifferentClass.method2();
		DifferentPackage.method3();
	}

}
