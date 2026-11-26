# Biljettkassa

Programmet är ett enkelt biljettsystem för en biograf med tre typer av biljetter: vuxen, barn och pensionär.

## 1. Hur kör man programmet?

Programmet körs genom att öppna Main.java och klicka på den gröna pilen bredvid main-metoden.

**Utskrift från Run-fönstret:**

Vuxenbiljett Ordinarie pris: 150.0 kr
Pris efter rabatt: 135.0 kr
------------------------
Barnbiljett Ordinarie pris: 85.0 kr
Pris efter rabatt: 76.5 kr
------------------------
Pensionarbiljett Ordinarie pris: 90.0 kr
Pris efter rabatt: 81.0 kr
------------------------
Antal biljetter: 3
Kan inte sätta rabatten till 60.0%. Rabatten är fortfarande 10.0%.


## 2. Felsökning

Jag hade svårt att förstå hur jag skulle skriva en for-loop för att gå igenom alla biljetter och visa både grundpriset och priset efter rabatten. Jag löste det genom att använda en loop som går igenom biljettlistan och beräknar priset för varje biljett.

## 3. Hjälpmedel

Jag använde ChatGPT som hjälpmedel för att förstå Java och få hjälp med felsökning. ChatGPT föreslog först en for-loop för att visa biljettpriserna. Jag bad om en ändring så att loopen visar biljettpriserna både före och efter rabatten.

## 4. Ny sort

Jag lade till följande rader i Main:

Pensionar p = new Pensionar();
Biljett[] biljetter = {v, b, p};

Jag behövde inte ändra metoden visaBiljett() eller looparna eftersom de redan fungerar med alla biljettyper genom superklassen Biljett.