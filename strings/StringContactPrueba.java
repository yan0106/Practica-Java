package strings;

public class StringContactPrueba {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String s = " ";

        for (int i = 0; i < 50000; i++){
            s = s + i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
