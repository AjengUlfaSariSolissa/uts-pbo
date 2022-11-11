package project_uts;
import project_uts.DESAIN.Biodata;

public class PROJECT_UTS {

    public static void main(String[] args) {
        Biodata data = new Biodata();
        data.setNama("Ajeng Ulfa Sari Solissa");
        data.setKls("3F");
        data.setJurusan("D3 Teknik Komputer");
        System.out.println("Nama    : " + data.getNama() );
        System.out.println("Kelas   : " + data.getKls() );
        System.out.println("Jurusan : " + data.getJurusan() );
    }
    
}