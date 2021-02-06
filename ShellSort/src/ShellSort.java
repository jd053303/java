
public class ShellSort {

	static void insertion(int[] element, int numbers) {
		for(int term=numbers/2; term>0; term=term/2) {
			System.out.printf("\n\n\n**±Þ°£ : %d", term);
			for(int i = term; i<numbers; i++) {
				int insertValue = element[i];
				int j;
				for (j=i-term; j>=0 && insertValue<element[j]; j=j-term) {
					element[j+term] = element[j];
				}
				element[j+term] = insertValue;
				System.out.printf("\n");
				for (int k =0; k < numbers; k++) {
				System.out.printf("%d ", element[k]);
				if((k+1)%term==0) System.out.printf(" | ");
				}
			}
		}

	}

}
