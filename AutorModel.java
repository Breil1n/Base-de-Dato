public class AutorModel {
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
