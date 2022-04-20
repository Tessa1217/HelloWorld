package edu.nested;

public class Outer {

	private String f1;

	// Member Class
	class Inner {

		String f2;

		void method2() {
			System.out.println("method2() call.");
		}

	}

	static class Inner2 {

		static String f4;
		String f5;

		static void method4() {
			System.out.println("method4() call.");
		}

		void method5() {
			System.out.println("method5() call.");
		}
	}

	public void method1() {
		System.out.println("method1() call.");

		// Local Class
		class Local {
			String f3;

			void method3() {
				System.out.println("method3() call.");
			}
		}

		Local local = new Local();
		local.method3();

	}

}
