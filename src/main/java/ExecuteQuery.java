import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {
    public static ResultSet Select(String SelectQuery){
        try{
            Connection connection = DbConnector.connect();
            Statement statement = connection.createStatement();
            return statement.executeQuery(SelectQuery);
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void Query(String anyQuery){
        try{
            Connection connection = DbConnector.connect();
            Statement statement = connection.createStatement();
            statement.execute(anyQuery);
        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
