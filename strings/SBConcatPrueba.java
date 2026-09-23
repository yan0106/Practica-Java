package strings;

public class SBConcatPrueba {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 50000; i++) {
            sb = sb.append(i);
        }
        System.out.println(sb.toString());

        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}