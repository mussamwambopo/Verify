import java.util.Scanner;
public class Main{

Scanner obj= new Scanner(System.in);

}
class halo extends Main{
public void gee(){

    System.out.println (" please enter your phone number");

    int x= obj.nextInt();
    System.out.println("please enter your first name");
    String y= obj.nextLine();

    System.out.println("please enter your Lastname");
    String z=obj.nextLine();

        String u="mussa";
if (y==u){
System.out.println(" you got this bro");
}
else{
    System.out.println("enter the name again bro");
}
}

public static void main(String[] args) {
   halo ko = new halo();
   ko.gee(); 
}
}

