function sjekkinput() {
    let sjekkinput = 1;
    if ($("#film").val() === "") {
        $("#tfilm").html(" Du må velge en film!");
        sjekkinput = 0;
    } else {
        $("#tfilm").html("");
    }
    if ($("#antallb").val() === "" || isNaN($("#antallb").val())) {
        $("#tantallb").html(" Kan ikke være tom og må være et tall");
        sjekkinput = 0;
    } else {
        $("#tantallb").html("");
    }
    if ($("#fornavn").val() === "") {
        $("#tfornavn").html(" Du må skrive inn et fornavn!");
        sjekkinput = 0;
    } else {
        $("#tfornavn").html("");
    }
    if ($("#etternavn").val() === "") {
        $("#tetternavn").html(" Du må skrive inn et etternavn!");
        sjekkinput = 0;
    } else {
        $("#tetternavn").html("");
    }
    if ($("#telefonnr").val() === "") {
        $("#ttelefonnr").html(" Du må skrive inn et telefonnummer!");
        sjekkinput = 0;
    } else {
        $("#ttelefonnr").html("");
    }
    if ($("#epost").val() === "") {
        $("#tepost").html(" Du må skrive inn en e-postadresse!");
        sjekkinput = 0;
    } else {
        $("#tepost").html("");
    }
    if (sjekkinput === 0) {
        console.log("Alle felt er ikke fylt ut");
    } else {
        console.log("Alle felt er fylt ut");
    }
    return (sjekkinput);
}

function kjopreg() {
    if (sjekkinput() === 0) {
        $("#allefelt").html(" Alle felt må være fylt ut!");
    } else {
        $("#allefelt").html("");
        const billett = {
            film: $("#film").val(),
            antallb: $("#antallb").val(),
            fornavn: $("#fornavn").val(),
            etternavn: $("#etternavn").val(),
            tlfnr: $("#telefonnr").val(),
            epost: $("#epost").val(),
        }
        $.post("/lagre", billett, function () {
            hentAlle();
        });
        $("#film").val("");
        $("#antallb").val("");
        $("#fornavn").val("");
        $("#etternavn").val("");
        $("#telefonnr").val("");
        $("#epost").val("");

        console.log("Billett sendt til server");
        console.log("Inputfelt nullet");
    }
}

function hentAlle() {
    $.get("/hentAlle", function (billetter) {
        console.log("Billett mottatt fra server");
        formaterData(billetter);
    });
}

function formaterData(billetter) {
    let ut = "<table class='table table-striped tab'><thead><th>Film</th><th>Antall billetter</th><th>Fornavn</th>" +
        "<th>Etternavn</th><th>Telefonnr</th><th>E-post</th></thead>";
    for (const billett of billetter) {
        ut += "<tbody><tr><td>" + billett.film + "</td><td>" + billett.antallb + "</td><td>" + billett.fornavn + "</td>" +
            "<td>" + billett.etternavn + "</td><td>" + billett.tlfnr + "</td><td>" + billett.epost + "</td></tr></tbody>";
    }
    ut += "</table>";
    $("#billettregister").html(ut);
    console.log("Billett lagt i tabell");
}

function slettAlle() {
    $.get("/slettAlle", function () {
        hentAlle();
        console.log("Alle billetter slettet");
    });
}