import java.io.*;

public class UserInput {
    private static final BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    public static String getString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            return "Error";
        }
    }

    public static short getShort() {
        try {
            return Short.parseShort(br.readLine());
        } catch (Exception e) {
            return -1;
        }
    }

    public static int getInt() {
        try {
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            return -1;
        }
    }
}
