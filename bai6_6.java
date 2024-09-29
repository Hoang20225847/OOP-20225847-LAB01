import java.util.Scanner;
public class bai6_6 {
	public static void nhapmatran(int arr[][],int n,int m){
        Scanner s1 =new Scanner(System.in);
        for(int k=0;k<n;k++){
            System.out.println("nhap hang thu "+(k+1)+" (cac so cach nhau boi dau cach)");
            String s=s1.nextLine();
            String input[]=s.split(" ");
            if(input.length!=m){
                System.out.println("nhap sai yeu cau nhap lai");
                k--;
                continue;
            }
            for(int b=0;b<m;b++){
                arr[k][b]=Integer.parseInt(input[b]);
            }
        }
    }
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n,m;
        System.out.println("nhap hang va cot ma tran can them:");
        n=s.nextInt();
        m=s.nextInt();
        s.nextLine();
        int[][] arr1=new int[n][m];
        System.out.println("nhap ma tran thu 1");
        nhapmatran(arr1, n, m);
        int[][] arr2=new int[n][m];
        System.out.println("nhap ma tran thu 2");
        nhapmatran(arr2, n, m);
        int[][] arr3=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("ma tran 1 sau khi them ma tran 2 la:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }
}
