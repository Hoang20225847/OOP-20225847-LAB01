import javax.swing.JOptionPane;
public class bai2_2_6 {
	public static void main(String[] args){
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null,"nhap a: ", "ax+b=0",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"nhap b: ", "ax+b=0",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        String x;
        if(num1!=0){
              x="x="+String.valueOf(-num2/num1);
        }
        else{
            if(num2==0){
                x="phuong trinh co vo so nghiem";
            }
            else{
                x="phuong trinh vo nghiem";
            }
        }
        JOptionPane.showMessageDialog(null, x);
        String strNum3, strNum4, strNum5,strNum6,strNum7,strNum8;
        strNum3 = JOptionPane.showInputDialog(null,"nhap a11 ", "a11x1 + a12x2= b1;a21x1+a22x2=b2 ",JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null,"nhap a12 ", "a11x1 + a12x2= b1;a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null,"nhap b1 ", "a11x1 + a12x2= b1;a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null,"nhap a21 ", "a11x1 + a12x2= b1;a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
        strNum7 = JOptionPane.showInputDialog(null,"nhap a22 ", "a11x1 + a12x2= b1;a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
        strNum8 = JOptionPane.showInputDialog(null,"nhap b2 ", "a11x1 + a12x2= b1;a21x1+a22x2=b2",JOptionPane.INFORMATION_MESSAGE);
        double num3 = Double.parseDouble(strNum3);
        double num4 = Double.parseDouble(strNum4);
        double num5 = Double.parseDouble(strNum5);
        double num6 = Double.parseDouble(strNum6);
        double num7 = Double.parseDouble(strNum7);
        double num8 = Double.parseDouble(strNum8);
        double D,D1,D2;

        D=num3*num7-num6*num4;
        D1=num5*num7-num8*num4;
        D2=num3*num8-num6*num5;
        if(D!=0){
           double x1=D1/D;
           double x2=D2/D;
           JOptionPane.showMessageDialog(null, "Phuong trinh co nghiem duy nhat: \n x1= "+x1+"\nx2= "+x2);
        }
        else{
            if(D1==0&&D2==0){
                JOptionPane.showMessageDialog(null, "Phuong trinh co vo so nghiem");
            }
            else{
                JOptionPane.showMessageDialog(null, "Phuong trinh vo nghiem");
            }
        }
        String strA,strB,strC;
        strA = JOptionPane.showInputDialog(null,"nhap a: ", "ax^2+bx+c=0",JOptionPane.INFORMATION_MESSAGE);
        strB = JOptionPane.showInputDialog(null,"nhap b: ", "ax^2+bx+c=0",JOptionPane.INFORMATION_MESSAGE);
        strC = JOptionPane.showInputDialog(null,"nhap c: ", "ax^2+bx+c=0",JOptionPane.INFORMATION_MESSAGE);
        double a=Double.parseDouble(strA);
        double b=Double.parseDouble(strB);
        double c=Double.parseDouble(strC);
        double delta;
        if(a!=0){
            delta=b*b-4*a*c;
            if(delta>0){
                double x1=(-b + Math.sqrt(delta))/(2*a);
                double x2=(-b - Math.sqrt(delta))/(2*a);
                JOptionPane.showMessageDialog(null, "phuong trinh co 2 nghiem: "+"\n"+"x1= "+x1+"\n"+"x2= "+x2);
            }
            else if(delta==0){
                double x3=(-b)/(2*a);
                JOptionPane.showMessageDialog(null, "phuong trinh co nghiem kep x= "+x3);
            }
            else{
                JOptionPane.showMessageDialog(null, "phuong trinh vo nghiem");
            }
        }
        else{
            if(b!=0){
                double x4=-c/b;
                JOptionPane.showMessageDialog(null, "phuong trinh co 1 nghiem x="+x4);
            }
            else{
                if(c==0){
                    JOptionPane.showMessageDialog(null, "phuong tirnh co vo so nghiem");
                }
                else{
                    JOptionPane.showMessageDialog(null, "phuong trinh vo nghiem");
                }
            }
        }
}
}
