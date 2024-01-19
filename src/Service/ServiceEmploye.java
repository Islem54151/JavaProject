
package Service;

import Entite.Employe;
import Utils.DataSource;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

    public class ServiceEmploye  implements IService<Employe>{

        private Connection con1= DataSource.getInstance().getCon();

        private Statement ste;

        private static Service.ServiceEmploye ser;
        private ServiceEmploye() {
            try {
                ste = con1.createStatement();
            }catch (SQLException e)
            {
                System.out.println(e);
            }
        }
        public static Service.ServiceEmploye getInstance()
        {
            if(ser==null)
                ser=   new Service.ServiceEmploye();
            return ser;
        }
        @Override
        public void ajouter(Employe employe) throws SQLException {
            String req="INSERT INTO `employe` (`id`, `nom`, `prenom`, `cin`, `password`, `mail`, `departement`)  VALUES (NULL, '"+employe.getNom()+"', '"+employe.getPrenom()+"', '"+employe.getCin()+"' , '"+employe.getPassword()+"', '"+employe.getMail()+"' , '"+employe.getDepartement()+"'  );";

            ste.executeUpdate(req);

        }

        @Override
        public boolean supprimer(Employe employe) throws SQLException {
            return false;
        }

        @Override
        public boolean update(Employe employe) throws SQLException {
            return false;
        }

        @Override
        public Employe  findById(Employe employe) throws SQLException {
            return null;
        }

        @Override
        public List<Employe > readAll() throws SQLException {
            List<Employe> l1=new ArrayList<>();
            ResultSet res = ste.executeQuery("SELECT * FROM `employe`");
            while (res.next())
            {
                int id= res.getInt(1);
                String nom=res.getString(2);
                String prenom=res.getString("prenom");
                int cin=res.getInt("cin");
                String password =res.getString("password");
                String mail=res.getString("mail");
                String departement=res.getString("departement");

                System.out.println("id :"+id+"nom :"+nom+"prenom :"+prenom+"cin :"+cin+"password :"+password+"mail :"+mail+"departement :"+departement);
                Employe e=new Employe (id,nom,prenom, cin, departement,password,mail);
                l1.add(e);

            }

            return l1;
        }
    }

