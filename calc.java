import java.util.Scanner;


public class calc {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter No.1");
        int a = sc.nextInt();

        System.out.println("Enter NO.2");
        int b = sc.nextInt();

        System.out.println("Choose operation \n 1.ADD \n 2.SUB \n 3.MULTIPLY \n 4.DIVIDE");
 
        int result =0;
        while (true) {

            char ch = sc.next().trim().charAt(0);

            if(ch=='+'){
                result = a+b;
            }else if (ch=='-') {
                result = a-b;
            }else if (ch=='*') {
                result = a*b;
            }else if (ch=='/') {
                if (b != 0) {
                    result = a/b;
                }else{
                    System.out.println("Cannot be devide by zero");
                }
                
            }else if(ch == 'x'|| ch == 'X'){
                break;
            }else{
                System.out.println("Invalid input");
            }

            System.out.println(result);
            
        }

        


    }
    

    
}
