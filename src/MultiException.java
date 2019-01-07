import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MultiException {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(""));
            String str = reader.readLine();
            Connection conn = null;
            Statement stmt = conn.createStatement();
            System.out.println(stmt.toString() + reader.toString());
        } catch (IOException | SQLException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        try (BufferedReader br = new BufferedReader(new FileReader(""))) {
            String str = br.readLine();
            while (null != str) {
                System.out.println(str);
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
