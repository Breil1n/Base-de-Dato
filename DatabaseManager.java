public class DatabaseManager {
    // Connection setup and other methods

    public void addAutor(Autor autor) {
        String sql = "INSERT INTO Autor (name, biography) VALUES (?,?)";
        // Prepare statement, set parameters, and execute update
    }

    public Autor getAutorById(int id) {
        String sql = "SELECT * FROM Autor WHERE id =?";
        // Prepare statement, execute query, and map result to Autor object
    }

    public void addBook(Book book) {
        String sql = "INSERT INTO Book (title, autor_id) VALUES (?,?)";
        // Prepare statement, set parameters, and execute update
    }

    public Book getBookById(int id) {
        String sql = "SELECT * FROM Book WHERE id =?";
        // Prepare statement, execute query, and map result to Book object
    }
}


String dbur1 = objsetting.getPropValue("dbur1");
_vCatalog = objsetting.getPropValue("dcatalog");
dbur1 += "?user=" +objsetting.getPropValue("duser");
dbur1 += "&password=" +objsetting.getPropValue("dpassword");
oConn = DriverManager.getConnection(dburl);
stemQry = oConn.createStatement();

)catch (SQLException e) {

    e.printStackTrace();
} catch (Exception e) {
    e.printStackTrace();
}
}.  




