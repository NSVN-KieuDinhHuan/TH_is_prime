import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một số");
        int number=scanner.nextInt();
        boolean isPrime=true;
        if (number<2){
            isPrime=false;
        }else if(number==2){
            isPrime=true;
        }else {
            for(int i=2;i<number;i++){
                if (number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Là số nguyên tố");
        }else {
            System.out.println("không phải là số nguyên tố");
        }


    }
}
