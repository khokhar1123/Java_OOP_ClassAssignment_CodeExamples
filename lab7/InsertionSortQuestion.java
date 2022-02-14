package labs.lab7;

public class InsertionSortQuestion {

	public static void main(String[] args) {
		String data[] = {"cat", "fat", "dog", "apple", "bat", "egg"};
		System.out.println("The unsorted array is: cat, fat, dog, apple, bat, egg");
		isort(data);
	}
	
	public static void isort(String udata[]) {
		String temp;
	    int j;
       for(int i =1;i<udata.length;i++) {
    	   j=i;
    	   while(j>0 && (udata[j-1].compareToIgnoreCase(udata[j])>0)) {
    		   temp=udata[j-1];
			   udata[j-1]=udata[j];
			   udata[j]=temp;
			   j=j-1;
    	   }
       }
System.out.print("The sorted array is : "+udata[0]);
	   
	   for(int i=1;i<udata.length;i++) {
		   System.out.print(","+udata[i]);
	}   
}
}
