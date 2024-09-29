import javax.swing.JOptionPane;
public class bai2_2_5 {
	  public static void main(String[] args){
	        String strNum1, strNum2;
	        strNum1 = JOptionPane.showInputDialog(null,
	            "The first number: ", "The first number",
	            JOptionPane.INFORMATION_MESSAGE);

	        strNum2 = JOptionPane.showInputDialog(null,
	            "The second number: ", "The second number",
	            JOptionPane.INFORMATION_MESSAGE);
	        double num1 = Double.parseDouble(strNum1);
	        double num2 = Double.parseDouble(strNum2);
	        double sum=num1+num2;
	        double difference = num1 - num2;
	        double product = num1 * num2;
	        String quotient;
	        if(num2!=0){
	            quotient=String.valueOf(num1/num2); 
	        }
	        else{
	            quotient="error second number '0 ' ";
	        }
	        String result= "Result: \n "+"Sum: "+sum+"\n"+
	        "Difference: "+difference+"\n"+
	        "Product: "+product+"\n"+
	        "Quotient: "+quotient;
	        JOptionPane.showMessageDialog(null, result,
	            "Calculation", JOptionPane.INFORMATION_MESSAGE);
	        System.exit(0);
	    }
}
