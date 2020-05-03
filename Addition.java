import java.util.Scanner;

public class Addition {

public static void main(String[] args) {

int x,y,z;

Scanner sc= new Scanner(System.in);

System.out.println("Enter the first number");
x = sc.nextInt();
          
System.out.println("Enter the Second number");
y = sc.nextInt();

sc.close();

z=x+y;

System.out.println("Sum"+"="+z);

	}

}
