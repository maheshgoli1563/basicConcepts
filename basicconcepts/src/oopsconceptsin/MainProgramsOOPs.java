package oopsconceptsin;

public class MainProgramsOOPs {
	public static void main(String[] args) {
		abstractmethod();
		System.out.println("-----------------------------------");
		superMethodProgram();
		System.out.println("-------------------------------------");

		System.out.println("-------------------------------------");
	}

	public static void abstractmethod() {
		System.out.println("Program for Abstract methods");
		AbstractClassInMYProgram s = new AbstractSubClass();
		s.method1();
		s.method2();

	}

	public static void superMethodProgram() {
		System.out.println("Program for super keyword");
		superchildclass sc = new superchildclass();
		sc.work();
		sc.suppichildclass();
	}

}
