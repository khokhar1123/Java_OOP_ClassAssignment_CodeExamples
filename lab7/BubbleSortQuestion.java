package labs.lab7;

public class BubbleSortQuestion {

	public static void main(String[] args) {
		int data[] ={10, 4, 7, 3, 8, 6, 1, 2, 5, 9};
		System.out.println("The unsorted array is: 10, 4, 7, 3, 8, 6, 1, 2, 5, 9 ");
		bsort(data);
		
        
	}
   public static void bsort(int udata[]) {
	   boolean flag;
	   int temp;
	   flag = false;
	   do {
		   flag=false;
		   for(int i=1;i<udata.length;i++) {
			   if(udata[i-1]>udata[i]) {
				   temp=udata[i-1];
				   udata[i-1]=udata[i];
				   udata[i]=temp;
				   flag=true;
			   }
		   }
	   }while(flag);
	   System.out.print("The sorted array is : "+udata[0]);
	   
	   for(int i=1;i<udata.length;i++) {
		   System.out.print(","+udata[i]);
	   }
   }
}
