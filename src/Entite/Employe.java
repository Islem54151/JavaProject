package Entite;

public class Employe {
    private int id;
    private String nom, prenom, password, mail, departement;
    private int cin;


    public Employe(int id, String nom, String prenom,  int cin,String password, String mail, String departement) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.password = password;
        this.mail = mail;
        this.departement = departement;

    }

    public Employe(String nom, String prenom, int cin,String password, String mail, String departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.password = password;
        this.mail = mail;
        this.departement = departement;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public String getDepartement() {
        return departement;
    }

    public int getCin() {
        return cin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", departement='" + departement + '\'' +
                ", cin=" + cin +
                '}';
    }
}


