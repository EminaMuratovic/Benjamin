
public class TestnaKlasa {
	public static void main(String[] args) {
		int[] niz = ArrayUtill.getUserArray(5);
		int[] nizz = ArrayUtill.getUserArray(5);
		ArrayUtill.printArray(niz);
		niz = ArrayUtill.getArray(5, -3);
		int[] niz2 = ArrayUtill.getArray(6, 1);
		System.out.println();
		ArrayUtill.printArray(niz);
		System.out.println();
		ArrayUtill.printArray(niz2);
		System.out.println();
		ArrayUtill.copyArray(niz, niz2);
		System.out.println();
		ArrayUtill.printArray(niz2);
		System.out.println();
		ArrayUtill.MoveToLeftArray(nizz);
		System.out.println();
		ArrayUtill.MoveToRightArray(nizz);
		
	}

}
