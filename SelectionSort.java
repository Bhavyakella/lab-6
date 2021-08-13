/*Bhavya kella 
 Programming Fundamentals
Exercise 5
Summer*/
public class SelectionSort {

	public static void main(String[] args) {
		
			int list[] = { 1, 29, 14, 15, 94 };
			
			int i, j, k, p, temp;

			for (i = 0; i < (list.length - 1); i++) {
				p = i;

				for (j = i + 1; j < list.length; j++) {
					if (list[p] > list[j])
						p = j;
				}
				if (p != i) {
					temp = list[i];
					list[i] = list[p];
					list[p] = temp;
				}
				for (k = 0; k < list.length; k++) {
					System.out.println(list[k]);

				}
				System.out.println("");
			}

			System.out.println("Sorted list :\n");

			for (i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}

			
			
		
	}

	
}
	


