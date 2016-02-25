import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		/*
		 * Прекопирайте един масив от цели числа в друг масив.
		 */
		int a[] = { 1, 2, 3, 4, 3, 2, 1 };
		int b[] = null;

		b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		/*
		 * Напишете програма, която обръща стойностите на един масив.
		 */
		for (int i = 0; i < a.length; i++) {
			b[a.length - i - 1] = a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		/*
		 * Напишете програма, която проверява дали един масив е симетричен.
		 */
		boolean symmetric = true;
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			if (a[i] != a[j]) {
				System.out.println("Не!");
				symmetric = false;
				break;
			}
		}
		if (symmetric == true) {
			System.out.println("Да!");
		}
	}
}
