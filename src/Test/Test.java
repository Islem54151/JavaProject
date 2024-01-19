package Test;

import java.sql.SQLException;
import java.util.List;
import Service.ServiceEmploye;
import Entite.Employe;

public class Test {
    public static void main(String[] args) {


        ServiceEmploye ser=ServiceEmploye.getInstance();

        Employe e1=new Employe("bbb","ons",12,"fjj","ons@gmil.com","tech");

        try {
            ser.ajouter(e1);
        }catch (SQLException e)
        {
            System.out.println(e);
        }

        List<Employe> l=null;
       try {
           l = ser.readAll();
       }catch (SQLException e)
       {
           System.out.println(e);
       }
       l.forEach(e-> System.out.println(e));
    }
}
