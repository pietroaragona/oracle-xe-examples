import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Java {

    public static void main(String[] args) throws Exception {


        OracleDataSource ods = new OracleDataSource();
        ods.setURL("jdbc:oracle:thin:@//localhost:1521/XEPDB1"); // jdbc:oracle:thin@//<hostname>:<port>/<DB name>
        ods.setUser("system"); // <username>
        ods.setPassword("GetStarted18c"); // <password>
        Connection conn = ods.getConnection();

        PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
        ResultSet rslt = stmt.executeQuery();
        while (rslt.next()) {
            System.out.println(rslt.getString(1));
        }

    }
}
