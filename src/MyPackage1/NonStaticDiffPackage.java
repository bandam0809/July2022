package MyPackage1;

import MyPackage.NonStaticDiffClass;
import MyPackage.NonStaticMethod;

public class NonStaticDiffPackage 
{
public void method6()
{
	System.out.println("Non Static Method6 From Different Package");
}
	public static void main(String[] args) 
	{
		NonStaticDiffPackage C = new NonStaticDiffPackage();
		C.method6();
		NonStaticDiffClass B = new NonStaticDiffClass();
		B.method5();
		NonStaticMethod A = new NonStaticMethod();
		A.method4();
		
	}

}
