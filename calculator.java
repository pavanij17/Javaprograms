import java.util.*;

public class calculator {
    public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    int button=sc.nextInt();
    int x= sc.nextInt();
    int y= sc.nextInt();

    switch (button) {
        case 1 :int result=x+y;
        System.out.println(result);
        break;
        case 2 : result =x-y;
        System.out.println(result);
        break;
        case 3 : result = x*y;
        System.out.println(result);
        break;
        case 4 : result = x/y;
        System.out.println(result);
        break;
        case 5: result=x%y;
        System.out.println(result);
        break;
        default : System.out.println("Invalid Operation");
    }  
    

    
    
    }
    
}
