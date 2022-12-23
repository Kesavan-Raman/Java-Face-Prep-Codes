import java.util.*;

class SwapTheNibble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n&0x0F)<<4 | (n&0xF0)>>4);
    }
}