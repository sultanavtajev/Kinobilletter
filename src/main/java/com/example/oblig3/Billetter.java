package com.example.oblig3;

public class Billetter {
    private String film;
    private int antallb;
    private String fornavn;
    private String etternavn;
    private String tlfnr;
    private String epost;

    public Billetter(String film, int antallb, String fornavn, String etternavn, String tlfnr, String epost) {
        this.film = film;
        this.antallb = antallb;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.tlfnr = tlfnr;
        this.epost = epost;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAntallb() {
        return antallb;
    }

    public void setAntallb(int antallb) {
        this.antallb = antallb;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(String tlfnr) {
        this.tlfnr = tlfnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }
}
