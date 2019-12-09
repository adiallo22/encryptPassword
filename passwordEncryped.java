import java.util.Scanner;

public class passwordEncryped {

    public static Scanner input;

    public static void main (String[] args){

        input=new Scanner(System.in);

        char yn;

        do{
            System.out.println("Please input your five digit code : ");
            String str=input.next();
            System.out.println("Your original code is : "+str);
            System.out.print("Your new code is : ");
            encrypt(str);
            System.out.println();
            System.out.println("Would you like to Continue?(Y/N)");
            yn=input.next().charAt(0);
            System.out.println();
        } while(yn=='y' || yn=='Y');
    }

    public static void encrypt(String str){
        if(str.length()>5){
            System.out.println("Must be less than 5 digits");
        } else{
            for(int i=0; i<str.length(); i++){
                char c=str.charAt(i);
                int itsascii=(int)c;
                switch (c) {
                    case '1':
                    case '3':
                    case '5':
                    case '7':
                    case '9':
                        System.out.print(itsascii+" ");
                        break;
                    case '2':
                    case '4':
                    case '6':
                    case '8':
                        itsascii+=2;
                        System.out.print((char)itsascii+" ");
                        break;
                    default:
                        itsascii+=3;
                        System.out.print((char)itsascii+" ");
                        break;
                }
            }
        }
    }
}
