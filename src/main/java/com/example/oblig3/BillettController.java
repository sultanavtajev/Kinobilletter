package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BillettController {

    @Autowired
    BillettRepository rep;

    @PostMapping("/lagre")
    public void lagreKunde(Billetter billett) {
        rep.lagreBillett(billett);
    }

    @GetMapping("/hentAlle")
    public List<Billetter> hentAlle() {
        return rep.hentBilletter();
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        rep.slettBilletter();
    }
}
