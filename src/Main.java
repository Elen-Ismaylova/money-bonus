public class Main {
    public static void main(String[] args) {
        long balance = 100;
        long put = 1100;
        long bonus = put / 100;
        if (put > 1000) {
            bonus = put / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}
