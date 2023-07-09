import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number==1){
            System.out.print(1);
        }
        else{
            while (number>1){

                System.out.print(number+" ");
                if(number%2==0){
                    number=number/2;

                }
                else{
                    number=(3*number)+1;

                }
            }
            System.out.print(1+" ");
        }
    }
}