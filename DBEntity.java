public void AutorModel() {
}
private void Mapping(ResulSet dset) {
   
    aumodel = new ArrayList<Autor>();
 
    try {
        while(dset.next()) {
            Autor objau = new Autor();
            objau.auid= dSet.getString("au_id");
            objau.auid= dSet.getString("au_lname");
            objau.auid= dSet.getString("au_fname");
            objau.auid= dSet.getString("au_phone");
            objau.auid= dSet.getString("au_address");
            aumodel.add(objau);
        }
        dset.Close();
    } catch (SQLException e){
        };
    }



    public ArrayList<Autor> get(String shc){
        String sql = "SELECT * FROM authors"
        where";
        sql+= "concat(au_lname,au_fname) Like
        '%"+shc+"%'";
        Mapping(getData(sql)); 
        return aumodel;
    }
    public boolean Put(Autor odata){
        String sql = "update authors set campo = valor ***....where";
        sql+= " au_id = '"+odata.auid +"'";

        return execSQL(sql);
    }
    public boolean Post(Autor odata){
        String sql = "insert into authors(col1, col2... ***...) Values(";
        sql+= "'"+odata.auid +"','...);";

        return execSQL(sql ); 
    }
}
     public class Autor { 
public String auid; 
public String aulname;
public String aufname;
public String auphone;
public String auaddress;
public String aucity; 
public String austate;
public String auzip;
public boolean aucontract;
public Autor() {
    this.auid = "";
    this.aulname = "";
    this.aufname = "";
    this.auphone = "";
    this.auaddress = "";
    this.aucity = "";
    this.austate = "";
    this.auzip = "";
    this.aucontract = false;
    }
    public Autor(String aid, String aln, String afn, String aph, String aadr) {
        this.auid = aid;
        this.aulname = aln;
        this.aufname = afn;
        this.auphone = aph;
        this.auaddress = aadr;
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
} 
public public class AutorModel {
private ArrayList<Autor> aumodel;

public void AutorModel() {
}
private void Mapping(ResulSet dset) {

aumodel = new ArrayList<Autor>();

try {
    while(dset.next()) {
        Autor objau = new Autor();
        objau.auid= dSet.getString("au_id");
        objau.auid= dSet.getString("au_lname");
        objau.auid= dSet.getString("au_fname");
        objau.auid= dSet.getString("au_phone");
        objau.auid= dSet.getString("au_address");
        aumodel.add(objau);
    }
    dset.Close();
} catch (SQLException e){
    };
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


public ArrayList<Autor> get(String shc){
    String sql = "SELECT * FROM authors"
    where";
    sql+= "concat(au_lname,au_fname) Like
    '%"+shc+"%'";
    Mapping(getData(sql)); 
    return aumodel;
}
public boolean Put(Autor odata){
    String sql = "update authors set campo = valor ***....where";
    sql+= " au_id = '"+odata.auid +"'";

    return execSQL(sql);
}
public boolean Post(Autor odata){
    String sql = "insert into authors(col1, col2... ***...) Values(";
    sql+= "'"+odata.auid +"','...);";

    return execSQL(sql ); 
}
}
    