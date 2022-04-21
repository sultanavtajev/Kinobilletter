package com.example.oblig3;

import ch.qos.logback.classic.db.names.DBNameResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.security.PublicKey;
import java.util.List;

@Repository
public class BillettRepository {

    @Autowired
    private JdbcTemplate db;

    public void lagreBillett(Billetter billett) {
        String sql = "INSERT INTO Billetter (film, antallb, fornavn, etternavn, tlfnr, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, billett.getFilm(), billett.getAntallb(), billett.getFornavn(), billett.getEtternavn(),
                billett.getTlfnr(), billett.getEpost());
    }

    public List<Billetter> hentBilletter() {
        String sql = "SELECT * FROM Billetter ORDER BY etternavn ASC";
        List<Billetter> alleBilletter = db.query(sql, new BeanPropertyRowMapper(Billetter.class));
        return alleBilletter;
    }

    public void slettBilletter() {
        String sql = "DELETE FROM Billetter";
        db.update(sql);
    }
}
