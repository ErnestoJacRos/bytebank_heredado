package mx.com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		int[] edades = {20, 15, 67};
		for(int i = 0; i < edades.length; i++) {
			System.out.print(edades[i] + ", ");
		}
		System.out.println();
		for (int edad : edades) {
			System.out.print(edad + ", ");
		}
	}

}
