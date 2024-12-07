package org.example.restspring_2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Usuari {
    @Id
    @Column(name = "DNI")
    private String dni;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "telefon")
    private Integer telefon;
    @Basic
    @Column(name = "correu")
    private String correu;
    @Basic
    @Column(name = "token")
    private String token;
    @JsonIgnore
    @OneToMany(mappedBy = "usuariByDni")
    private Collection<Prestec> prestecsByDni;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuari usuari = (Usuari) o;
        return Objects.equals(dni, usuari.dni) && Objects.equals(nom, usuari.nom) && Objects.equals(telefon, usuari.telefon) && Objects.equals(correu, usuari.correu) && Objects.equals(token, usuari.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nom, telefon, correu, token);
    }

    public Collection<Prestec> getPrestecsByDni() {
        return prestecsByDni;
    }

    public void setPrestecsByDni(Collection<Prestec> prestecsByDni) {
        this.prestecsByDni = prestecsByDni;
    }
}
