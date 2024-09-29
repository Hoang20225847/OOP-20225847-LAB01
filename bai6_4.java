import java.util.Scanner;
public class bai6_4 {
	
	    public static boolean checkyear(int year){
	       if(year%400==0)
	    	   return true;
	       else if(year%4==0&&year%100!=0)
	    	   return true;
	       else return false;
	    }
	    public static int checkmonth(String month,int year){
	        switch (month) {
	            case "Jan.":
	            case "January":
	            case "1":
	            case "Jan":
	            return 31;
	            case "February":
	            case "Feb.":
	            case "Feb":
	            case "2":
	            return checkyear(year)?29:28;
	            case "3":
	            case "March":
	            case "Mar.":
	            case "Mar":
	            return 31;
	            case "April":
	            case "Apr":
	            case "Apr.":
	            case "4":
	            return 30;
	            case "May":
	            case "5":
	            return 31;
	            case "Jun":
	            case "6":
	            return 30;
	            case "July":
	            case "7":
	            return 31;
	            case "August":
	            case "Aug.":
	            case "Aug":
	            case "8":
	            return 31; 
	            case "September":
	            case "Sept.":
	            case "Sept":
	            case "9":
	            return 30; 
	            case "October":
	            case "Oct.":
	            case "OCt":
	            case "10":
	            return 31; 
	            case "November":
	            case "Nov.":
	            case "Nov":
	            case "11":
	            return 30;
	            case "December":
	            case "Dec.":
	            case "Dec":
	            case "12":
	            return 31;  
	            default:
	                return 0;//error month
	        }
	    }
	    public static void main(String args[]){
	        Scanner s=new Scanner(System.in);
	        String month;
	        int year;
	        while(true){
	            System.out.println("input Month and Year :");
	            month=s.nextLine();
	            year=s.nextInt();
	            s.nextLine();//xoa bo dem
	            if(year<0){
	                System.out.println("error Year");
	                continue;
	            }
	            int day=checkmonth(month, year);
	            if(day==0){
	                System.out.println("Error month please again:");
	                continue;
	            }
	            else{
	            System.out.println(day);
	        }
	        System.out.println("continue ? (y/n)");
	            String cont=s.nextLine();
	            if(cont.equals("y")){
	                continue;
	            }
	            else{
	                break;
	            }
	        }
	        s.close();
	    }
}
