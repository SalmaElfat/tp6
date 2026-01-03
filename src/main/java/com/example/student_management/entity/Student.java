package com.example.student_management.entity;
import jakarta.persistence.*;
import java.util.Date;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    //getters et setters
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public  void setDateNaissance(Date ddn){
        this.dateNaissance=ddn;
    }

    /*public int getId(){
        return id;
    }*/
    public String getNom(){
        return nom;
    }
    public String getprenom(){
        return prenom;
    }
    public Date getDateNaissance(){
        return dateNaissance;
    }

    public void setId(int i) {
    }

    /*public String getNom() {
        return nom;
    }*/
}
