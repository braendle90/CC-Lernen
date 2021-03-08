public class LessonForLoop2 {

    public static void main(String[] args) {


        int sum = 0;

        for (int i = 2; i <= 100; i = i +2) {

            System.out.println(i);
            sum = sum + i;

        }
        System.out.println("Die Summe ist "+sum);
    }
}
