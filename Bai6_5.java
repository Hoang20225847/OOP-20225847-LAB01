import java.util.Scanner;
public class Bai6_5 {
	 public static int Sum(int arr[]){
	        int sum=0;
	        for(int i=0;i<arr.length;i++){
	            sum+=arr[i];
	        }
	        return sum;
	    }
	    public static double averagevalue(int arr[]){
	        double a;
	        double sum=Sum(arr);
	        a=(double)sum/arr.length;
	        return a;
	    }
	    public static void insertsort(int arr[]){
	    	for( int i=1;i<arr.length;i++)
	    	{
	    		int pos=i-1;
	    		int x=arr[i];
	    		while(pos >=0 && x<arr[pos])
	    		    {
	    			  arr[pos+1]=arr[pos];
	    			  pos--;
	    		 	}
	    		 	arr[pos+1]=x;
	    	}
	    }
	    public static void main(String args[]){
	        int n;
	        Scanner s=new Scanner(System.in);
	        System.out.println("nhap so phan tu: ");
	        n=s.nextInt();
	        s.nextLine();
	        int[]arr=new int[n];
	        System.out.println("nhap phan tu:");
	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();
	        }
	        int sum1=Sum(arr);
	        System.out.println(sum1);
	        double sum2=averagevalue(arr);
	        System.out.println(sum2);
	        insertsort(arr);
	        for(int i=0;i<arr.length;i++){
	            System.out.print(arr[i]+" ");
	        }
	        s.close();
	    }
}
