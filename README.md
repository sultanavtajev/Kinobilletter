JavaScript-applikasjon som registrerer kjøp av kinobilletter. Programmert ved bruk av Spring Boot og Java. Stylet med Bootstrap.

Etter at knappen "Kjøp billett" er trykket skal billetten lagres i en tabell i en relasjonsdatabase. Tabellen listes ut under "Alle billetter". Etter at det er registrert en bestilling blir alle inputfelt tømt slik at en ny billett kan registreres.

Knappen "Slett alle billettene" sletter alle billettene (tømmer tabellen).

Det er også kodet input-validering som sjekker at alle inputfeltene inneholder noe. Dersom et eller flere av feltene er tomme når knappen "Kjøp billett" trykkes så vises det feilmeldinger etter det respektive feltet og det lagres ikke noe.
