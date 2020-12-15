import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args){
        //---------------------- INSERT ----------------------//
        ExecuteQuery.Query("INSERT INTO public.Book(\"bookid\", \"booktitle\") VALUES (4, 'Mały Książę')");

        //---------------------- DELETE ----------------------//
        //ExecuteQuery.Query("DELETE FROM public.Book WHERE \"bookid\" = 4");

        //---------------------- SELECT ----------------------//
        try{
            ResultSet result = ExecuteQuery.Select("SELECT * FROM public.Book");
            while(result.next()){
                int BookID = result.getInt("bookid");
                String BookTitle = result.getString("booktitle");
                System.out.println(BookID + ". " + BookTitle);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
