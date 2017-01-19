import java.util.ArrayList;
import java.util.Random;

public class MRString {
    private ArrayList<String> strings = new ArrayList<>();

    private String createString() {
        int len;
        String str = "";

        Random rnd = new Random();
        len = rnd.nextInt(1000);
        for (int i = 0; i < len; i++) {
            str += (char) rnd.nextInt(256);
        }
        return str;
    }

    private void CreateStringCollection() {
        createString();
    }
    public static void main(String[] args) {
        MRString mrs = new MRString();
        mrs.CreateStringCollection();
    }
}
