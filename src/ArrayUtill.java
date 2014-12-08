
public class ArrayUtill {
	/**
	 * ispisuje niz koji je poslan kao argument 
	 * elementi su razdvojeni razmakom
	 * @param array niz koji zelimo ispisati
	 */
		public static void printArray(int[] array)
		{
			for(int i = 0; i < array.length; i++)
				System.out.print(array[i] + " ");
		}
		/**
		 * uzima od korisnika elemente niza
		 * @param size int velicina niza
		 * @return niz sa unesenim elementima
		 */
		public static int[] getUserArray(int size)
		{
			int[] niz= new int[size];
			System.out.println("Unesite elemente niza: ");
			for(int i = 0; i < size; i++)
				niz[i] = TextIO.getInt();
			return niz;
		}
		/**
		 * funkcija vraca niz ciji su elementi neka zadana vrijednost 
		 * @param size int velicina niza
		 * @param defaultValue int zadana vrijednost koji moraju biti elementi niza
		 * @return niz 
		 */
		public static int[] getArray(int size, int defaultValue)
		{
			int[] niz = new int[size];
			for(int i = 0; i < size; i++)
				niz[i] = defaultValue;
			return niz;
		}
		/**
		 * kopira elemente iz jednog niza u drugi
		 * @param niz1 niz iz kojeg kopiramo
		 * @param niz2 niz u koji zelimo kopirati elemente
		 * @return prvi niz sa kopiranim elementima
		 */
		public static void copyArray(int[] niz1, int[] niz2)
		{
			if(niz2.length > niz1.length)
			{
				int[] niz3 = new int[niz2.length];
				for(int i = 0; i < niz1.length; i++)
					niz3[i] = niz1[i];
				for(int i = 0; i < niz2.length; i++)
					niz2[i] = niz3[i];
			}
			else{
				for(int i = 0; i < niz1.length; i++)
				niz2[i] = niz1[i];
			}
		}
		public static void MoveToLeftArray(int[] niz)
		{
			{
				int[] niz2=new int[niz.length];
				for(int i=0; i<niz.length-1; i++)
					niz2[i]=niz[i+1];
				niz2[niz.length-1]=0;
				for(int i=0; i<niz.length; i++)
					System.out.print(niz2[i] + " ");
				
			}
		}
		public static void MoveToRightArray(int[] niz)
		{
			{
				int[] niz2=new int[niz.length];
				for(int i=1; i<niz.length; i++)
					niz2[i]=niz[i-1];
				niz2[0]=0;
				for(int i=0; i<niz.length; i++)
					System.out.print(niz2[i] + " ");
				
			}
		}
		
}



