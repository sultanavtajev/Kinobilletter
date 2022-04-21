CREATE TABLE Billetter
(
    id        INTEGER AUTO_INCREMENT NOT NULL,
    film      VARCHAR(255) NOT NULL,
    antallb   INTEGER      NOT NULL,
    fornavn   VARCHAR(255) NOT NULL,
    etternavn VARCHAR(255) NOT NULL,
    tlfnr     VARCHAR(255) NOT NULL,
    epost     VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);