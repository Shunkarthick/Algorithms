package ds.sort;

public class InsertionSort {
	
	public static void insertionSort(Integer args[]){
		
		int length = 0;
		int key = 0;
		
		if(args != null){
			length = args.length;
		}
				
		for(int i = 1; (null != args && i < length) ; i++){
			key = args[i];
			
			for(int j = i; (j > 0 && args[j-1] > key); j--){
				
				args[j] = args[j-1];
				args[j-1] = key;
				
			}
		}
		
		System.out.print("Output array: ");
		for(int x = 0; (null != args && x < length); x++){
			
			System.out.print(args[x] + ", ");
		}
		System.out.println();
	}
	
	public static void searchProblem(Integer args[], int value){
		if(null != args){
			int length = args.length;
			boolean isExists = false;
			for(int i = 0; i < length; i++){
				if(value == args[i]){
					System.out.println("Index : "+i);
					isExists = true;
					break;
				}
			}
			
			if(!isExists){
				System.out.println("NIL");
			}
		
		}else{
			System.out.println("NIL");
		}
	}

}
