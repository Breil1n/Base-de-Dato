public class Autor {
    private int id;
    private String name;
    private String biography;
    // Getters and setters
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

private static void Lesson5(Scanner pin) {
    DBEntity objEntity = new DBEntity();
    objEntity.ShowDbobject(pin);
    objEntity.CloseDB();
    }
    private static void UnitTesterAutor(Scanner pin) {
        AutorModel objautor = new AutorModel();
        String criterio = "";
        ArrayList<Autor> ladata;
        short opt=0;
        System.out.print("buscador de autores.....");
        do {
            System.out. print("\nentre el criterio");
            criterio = pin.nextLine();
            showDataSet(objautor.Get(criterio));
            System.out.println(objautor.getActionMessage());
            System.out.println("\nDesea continuar[0|1]");
            opt = pin.nextShort();
        }while(opt == 1);
        objautor.CloseDB();
    }


    private static void showDataSet(ArrayList<Autor> odt) { 
        System.out.println("Id\t|nombre\t|Apellido|Dir\Dir|Tel");

        for (Autor au: odt){
            System.out.println(au.auid+"\t|"+au.aufname+"Id\t|"+au.aulname+"Id\t|"+au.auaddress+"Id\t|"+au.auphone);
        }
    }