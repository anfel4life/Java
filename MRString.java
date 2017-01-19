import java.util.Random;

public class MRString {
    String createString() {
        int len;
        String str = "";

        Random rnd = new Random();
        len = rnd.nextInt(1000);
        for (int i = 0; i < len; i++) {
            str += (char) rnd.nextInt(256);
        }
        return str;
    }

    public static void main(String[] args) {
        MRString mrs = new MRString();
        System.out.println(mrs.createString());
        System.out.println(mrs.createString());
    }
}
