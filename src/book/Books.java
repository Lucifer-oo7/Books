package book;
import java.util.Scanner;
public class Books {
    public static void main(String[] args){
        String THE_BOOK_NAME;
        String THE_AUTHOR_NAME;
        String ISBN;;
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int m=n;
        if(n!=0)
        {
            while(n!=0){
                if(n==m)
                    scanner.nextLine();
                THE_BOOK_NAME=scanner.nextLine();
                THE_AUTHOR_NAME=scanner.nextLine();
                ISBN=scanner.nextLine();

                System.out.println("-----------------------------");
                System.out.println("Book name:\t"+THE_BOOK_NAME);
                System.out.println("Author name:\t"+THE_AUTHOR_NAME);
                System.out.println("ISBN:\t"+ISBN);
                System.out.println("-----------------------------");
                n--;
            }
        }
        else
            System.out.println("N/A");
    }
}
