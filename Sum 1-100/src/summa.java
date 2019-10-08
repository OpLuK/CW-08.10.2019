public class summa {
	public static void main (String[]args) {
		int i = 1;
		int sum = 0;
		int k = 0;
		do { 
			sum = sum + i;
			i+=1;
			if (i <= 100) {
				k = sum + i;
				System.out.println("Сумма " + i + " и " + sum + " равна " + k);
			}
		} while (i <= 100);
		System.out.println("Сумма чисел от 1 до 100 равна: " + sum);
	}
}