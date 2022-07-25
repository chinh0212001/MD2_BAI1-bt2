import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd , usd ;
        int change;
        System.out.println("chon 1 hoac 2");
        //1 để đổi tiền vnd sang usd
        //2 để đổi tiền usd sang vnd
        change = scanner.nextInt();
        if (change == 1){
            System.out.println("nhap so tien can chuyen (vnd) :");
            vnd = scanner.nextInt();
            System.out.println("so tien chuyen doi la  :" + vnd/23000 +"usd");

        }if (change == 2){
            System.out.println("nhap so tien can chuyen (usd) :");
            usd = scanner.nextInt();
            System.out.println("so tien chuyen doi la  :" + usd*23000 +"vnd");
        }else {
            System.out.println("lmj co ma chon");
        }
    }
}