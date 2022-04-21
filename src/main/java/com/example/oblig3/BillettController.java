package com.example.oblig3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {
    public final List<Billetter> billettRegister = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKunde(Billetter billett){
        billettRegister.add(billett);
    }

    @GetMapping("/hentAlle")
    public List<Billetter> hentAlle(){
        return billettRegister;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        billettRegister.clear();
    }
}
