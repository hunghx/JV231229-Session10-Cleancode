package ra.run;

import ra.config.ShopMessage;

import java.util.Scanner;

public class Main {
    public static final int NUMBER = 3;

    public static void main(String[] args) {
        System.out.println("Nhap 1 số và kiem tra chia het cho 3 hoawch 5");
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        boolean isMod3 = number % NUMBER == 0;
        boolean isMod5 = number % 5 == 0;
        if (isMod3) {
            if (isMod5) {
                System.out.println("CHia het cho 3 và 5");
            } else {
                System.out.println("chia het cho 3 nhung ko chia het cho 5");
            }
        } else {
            if (isMod5) {
                System.out.println("ko het cho 3 nhưng chia hết 5");
            } else {
                System.out.println("không chia het cho 3 và 5");
            }
        }
    }
}