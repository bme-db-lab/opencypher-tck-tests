#
# Copyright 2017 "Neo Technology",
# Network Engine for Objects in Lund AB (http://neotechnology.com)
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
# http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

Feature: Create

 Scenario: Generate the movie graph correctly
    Given any graph
    When executing query:
      """
      CREATE (theMatrix:Movie {title: 'The Matrix', released: 1999, tagline: 'Welcome to the Real World'})
      CREATE (keanu:Person {name: 'Keanu Reeves', born: 1964})
      CREATE (carrie:Person {name: 'Carrie-Anne Moss', born: 1967})
      CREATE (laurence:Person {name: 'Laurence Fishburne', born: 1961})
      CREATE (hugo:Person {name: 'Hugo Weaving', born: 1960})
      CREATE (andyW:Person {name: 'Andy Wachowski', born: 1967})
      CREATE (lanaW:Person {name: 'Lana Wachowski', born: 1965})
      CREATE (joelS:Person {name: 'Joel Silver', born: 1952})
      CREATE
        (keanu)-[:ACTED_IN {roles: ['Neo']}]->(theMatrix),
        (carrie)-[:ACTED_IN {roles: ['Trinity']}]->(theMatrix),
        (laurence)-[:ACTED_IN {roles: ['Morpheus']}]->(theMatrix),
        (hugo)-[:ACTED_IN {roles: ['Agent Smith']}]->(theMatrix),
        (andyW)-[:DIRECTED]->(theMatrix),
        (lanaW)-[:DIRECTED]->(theMatrix),
        (joelS)-[:PRODUCED]->(theMatrix)

      CREATE (emil:Person {name: 'Emil Eifrem', born: 1978})
      CREATE (emil)-[:ACTED_IN {roles: ['Emil']}]->(theMatrix)

      CREATE (theMatrixReloaded:Movie {title: 'The Matrix Reloaded', released: 2003,
              tagline: 'Free your mind'})
      CREATE
        (keanu)-[:ACTED_IN {roles: ['Neo'] }]->(theMatrixReloaded),
        (carrie)-[:ACTED_IN {roles: ['Trinity']}]->(theMatrixReloaded),
        (laurence)-[:ACTED_IN {roles: ['Morpheus']}]->(theMatrixReloaded),
        (hugo)-[:ACTED_IN {roles: ['Agent Smith']}]->(theMatrixReloaded),
        (andyW)-[:DIRECTED]->(theMatrixReloaded),
        (lanaW)-[:DIRECTED]->(theMatrixReloaded),
        (joelS)-[:PRODUCED]->(theMatrixReloaded)

      CREATE (theMatrixRevolutions:Movie {title: 'The Matrix Revolutions', released: 2003,
        tagline: 'Everything that has a beginning has an end'})
      CREATE
        (keanu)-[:ACTED_IN {roles: ['Neo']}]->(theMatrixRevolutions),
        (carrie)-[:ACTED_IN {roles: ['Trinity']}]->(theMatrixRevolutions),
        (laurence)-[:ACTED_IN {roles: ['Morpheus']}]->(theMatrixRevolutions),
        (hugo)-[:ACTED_IN {roles: ['Agent Smith']}]->(theMatrixRevolutions),
        (andyW)-[:DIRECTED]->(theMatrixRevolutions),
        (lanaW)-[:DIRECTED]->(theMatrixRevolutions),
        (joelS)-[:PRODUCED]->(theMatrixRevolutions)

      CREATE (theDevilsAdvocate:Movie {title: 'The Devil\'s Advocate', released: 1997,
        tagline: 'Evil has its winning ways'})
      CREATE (charlize:Person {name: 'Charlize Theron', born: 1975})
      CREATE (al:Person {name: 'Al Pacino', born: 1940})
      CREATE (taylor:Person {name: 'Taylor Hackford', born: 1944})
      CREATE
        (keanu)-[:ACTED_IN {roles: ['Kevin Lomax']}]->(theDevilsAdvocate),
        (charlize)-[:ACTED_IN {roles: ['Mary Ann Lomax']}]->(theDevilsAdvocate),
        (al)-[:ACTED_IN {roles: ['John Milton']}]->(theDevilsAdvocate),
        (taylor)-[:DIRECTED]->(theDevilsAdvocate)

      CREATE (aFewGoodMen:Movie {title: 'A Few Good Men', released: 1992,
        tagline: 'Deep within the heart of the nation\'s capital, one man will stop at nothing to keep his honor, ...'})
      CREATE (tomC:Person {name: 'Tom Cruise', born: 1962})
      CREATE (jackN:Person {name: 'Jack Nicholson', born: 1937})
      CREATE (demiM:Person {name: 'Demi Moore', born: 1962})
      CREATE (kevinB:Person {name: 'Kevin Bacon', born: 1958})
      CREATE (kieferS:Person {name: 'Kiefer Sutherland', born: 1966})
      CREATE (noahW:Person {name: 'Noah Wyle', born: 1971})
      CREATE (cubaG:Person {name: 'Cuba Gooding Jr.', born: 1968})
      CREATE (kevinP:Person {name: 'Kevin Pollak', born: 1957})
      CREATE (jTW:Person {name: 'J.T. Walsh', born: 1943})
      CREATE (jamesM:Person {name: 'James Marshall', born: 1967})
      CREATE (christopherG:Person {name: 'Christopher Guest', born: 1948})
      CREATE (robR:Person {name: 'Rob Reiner', born: 1947})
      CREATE (aaronS:Person {name: 'Aaron Sorkin', born: 1961})
      CREATE
        (tomC)-[:ACTED_IN {roles: ['Lt. Daniel Kaffee']}]->(aFewGoodMen),
        (jackN)-[:ACTED_IN {roles: ['Col. Nathan R. Jessup']}]->(aFewGoodMen),
        (demiM)-[:ACTED_IN {roles: ['Lt. Cdr. JoAnne Galloway']}]->(aFewGoodMen),
        (kevinB)-[:ACTED_IN {roles: ['Capt. Jack Ross']}]->(aFewGoodMen),
        (kieferS)-[:ACTED_IN {roles: ['Lt. Jonathan Kendrick']}]->(aFewGoodMen),
        (noahW)-[:ACTED_IN {roles: ['Cpl. Jeffrey Barnes']}]->(aFewGoodMen),
        (cubaG)-[:ACTED_IN {roles: ['Cpl. Carl Hammaker']}]->(aFewGoodMen),
        (kevinP)-[:ACTED_IN {roles: ['Lt. Sam Weinberg']}]->(aFewGoodMen),
        (jTW)-[:ACTED_IN {roles: ['Lt. Col. Matthew Andrew Markinson']}]->(aFewGoodMen),
        (jamesM)-[:ACTED_IN {roles: ['Pfc. Louden Downey']}]->(aFewGoodMen),
        (christopherG)-[:ACTED_IN {roles: ['Dr. Stone']}]->(aFewGoodMen),
        (aaronS)-[:ACTED_IN {roles: ['Bar patron']}]->(aFewGoodMen),
        (robR)-[:DIRECTED]->(aFewGoodMen),
        (aaronS)-[:WROTE]->(aFewGoodMen)

      CREATE (topGun:Movie {title: 'Top Gun', released: 1986,
          tagline: 'I feel the need, the need for speed.'})
      CREATE (kellyM:Person {name: 'Kelly McGillis', born: 1957})
      CREATE (valK:Person {name: 'Val Kilmer', born: 1959})
      CREATE (anthonyE:Person {name: 'Anthony Edwards', born: 1962})
      CREATE (tomS:Person {name: 'Tom Skerritt', born: 1933})
      CREATE (megR:Person {name: 'Meg Ryan', born: 1961})
      CREATE (tonyS:Person {name: 'Tony Scott', born: 1944})
      CREATE (jimC:Person {name: 'Jim Cash', born: 1941})
      CREATE
        (tomC)-[:ACTED_IN {roles: ['Maverick']}]->(topGun),
        (kellyM)-[:ACTED_IN {roles: ['Charlie']}]->(topGun),
        (valK)-[:ACTED_IN {roles: ['Iceman']}]->(topGun),
        (anthonyE)-[:ACTED_IN {roles: ['Goose']}]->(topGun),
        (tomS)-[:ACTED_IN {roles: ['Viper']}]->(topGun),
        (megR)-[:ACTED_IN {roles: ['Carole']}]->(topGun),
        (tonyS)-[:DIRECTED]->(topGun),
        (jimC)-[:WROTE]->(topGun)

      CREATE (jerryMaguire:Movie {title: 'Jerry Maguire', released: 2000,
          tagline: 'The rest of his life begins now.'})
      CREATE (reneeZ:Person {name: 'Renee Zellweger', born: 1969})
      CREATE (kellyP:Person {name: 'Kelly Preston', born: 1962})
      CREATE (jerryO:Person {name: 'Jerry O\'Connell', born: 1974})
      CREATE (jayM:Person {name: 'Jay Mohr', born: 1970})
      CREATE (bonnieH:Person {name: 'Bonnie Hunt', born: 1961})
      CREATE (reginaK:Person {name: 'Regina King', born: 1971})
      CREATE (jonathanL:Person {name: 'Jonathan Lipnicki', born: 1996})
      CREATE (cameronC:Person {name: 'Cameron Crowe', born: 1957})
      CREATE
        (tomC)-[:ACTED_IN {roles: ['Jerry Maguire']}]->(jerryMaguire),
        (cubaG)-[:ACTED_IN {roles: ['Rod Tidwell']}]->(jerryMaguire),
        (reneeZ)-[:ACTED_IN {roles: ['Dorothy Boyd']}]->(jerryMaguire),
        (kellyP)-[:ACTED_IN {roles: ['Avery Bishop']}]->(jerryMaguire),
        (jerryO)-[:ACTED_IN {roles: ['Frank Cushman']}]->(jerryMaguire),
        (jayM)-[:ACTED_IN {roles: ['Bob Sugar']}]->(jerryMaguire),
        (bonnieH)-[:ACTED_IN {roles: ['Laurel Boyd']}]->(jerryMaguire),
        (reginaK)-[:ACTED_IN {roles: ['Marcee Tidwell']}]->(jerryMaguire),
        (jonathanL)-[:ACTED_IN {roles: ['Ray Boyd']}]->(jerryMaguire),
        (cameronC)-[:DIRECTED]->(jerryMaguire),
        (cameronC)-[:PRODUCED]->(jerryMaguire),
        (cameronC)-[:WROTE]->(jerryMaguire)

      CREATE (standByMe:Movie {title: 'Stand-By-Me', released: 1986,
          tagline: 'The last real taste of innocence'})
      CREATE (riverP:Person {name: 'River Phoenix', born: 1970})
      CREATE (coreyF:Person {name: 'Corey Feldman', born: 1971})
      CREATE (wilW:Person {name: 'Wil Wheaton', born: 1972})
      CREATE (johnC:Person {name: 'John Cusack', born: 1966})
      CREATE (marshallB:Person {name: 'Marshall Bell', born: 1942})
      CREATE
        (wilW)-[:ACTED_IN {roles: ['Gordie Lachance']}]->(standByMe),
        (riverP)-[:ACTED_IN {roles: ['Chris Chambers']}]->(standByMe),
        (jerryO)-[:ACTED_IN {roles: ['Vern Tessio']}]->(standByMe),
        (coreyF)-[:ACTED_IN {roles: ['Teddy Duchamp']}]->(standByMe),
        (johnC)-[:ACTED_IN {roles: ['Denny Lachance']}]->(standByMe),
        (kieferS)-[:ACTED_IN {roles: ['Ace Merrill']}]->(standByMe),
        (marshallB)-[:ACTED_IN {roles: ['Mr. Lachance']}]->(standByMe),
        (robR)-[:DIRECTED]->(standByMe)

      CREATE (asGoodAsItGets:Movie {title: 'As-good-as-it-gets', released: 1997,
          tagline: 'A comedy from the heart that goes for the throat'})
      CREATE (helenH:Person {name: 'Helen Hunt', born: 1963})
      CREATE (gregK:Person {name: 'Greg Kinnear', born: 1963})
      CREATE (jamesB:Person {name: 'James L. Brooks', born: 1940})
      CREATE
        (jackN)-[:ACTED_IN {roles: ['Melvin Udall']}]->(asGoodAsItGets),
        (helenH)-[:ACTED_IN {roles: ['Carol Connelly']}]->(asGoodAsItGets),
        (gregK)-[:ACTED_IN {roles: ['Simon Bishop']}]->(asGoodAsItGets),
        (cubaG)-[:ACTED_IN {roles: ['Frank Sachs']}]->(asGoodAsItGets),
        (jamesB)-[:DIRECTED]->(asGoodAsItGets)

      CREATE (whatDreamsMayCome:Movie {title: 'What Dreams May Come', released: 1998,
          tagline: 'After life there is more. The end is just the beginning.'})
      CREATE (annabellaS:Person {name: 'Annabella Sciorra', born: 1960})
      CREATE (maxS:Person {name: 'Max von Sydow', born: 1929})
      CREATE (wernerH:Person {name: 'Werner Herzog', born: 1942})
      CREATE (robin:Person {name: 'Robin Williams', born: 1951})
      CREATE (vincentW:Person {name: 'Vincent Ward', born: 1956})
      CREATE
        (robin)-[:ACTED_IN {roles: ['Chris Nielsen']}]->(whatDreamsMayCome),
        (cubaG)-[:ACTED_IN {roles: ['Albert Lewis']}]->(whatDreamsMayCome),
        (annabellaS)-[:ACTED_IN {roles: ['Annie Collins-Nielsen']}]->(whatDreamsMayCome),
        (maxS)-[:ACTED_IN {roles: ['The Tracker']}]->(whatDreamsMayCome),
        (wernerH)-[:ACTED_IN {roles: ['The Face']}]->(whatDreamsMayCome),
        (vincentW)-[:DIRECTED]->(whatDreamsMayCome)

      CREATE (snowFallingonCedars:Movie {title: 'Snow-Falling-on-Cedars', released: 1999,
        tagline: 'First loves last. Forever.'})
      CREATE (ethanH:Person {name: 'Ethan Hawke', born: 1970})
      CREATE (rickY:Person {name: 'Rick Yune', born: 1971})
      CREATE (jamesC:Person {name: 'James Cromwell', born: 1940})
      CREATE (scottH:Person {name: 'Scott Hicks', born: 1953})
      CREATE
        (ethanH)-[:ACTED_IN {roles: ['Ishmael Chambers']}]->(snowFallingonCedars),
        (rickY)-[:ACTED_IN {roles: ['Kazuo Miyamoto']}]->(snowFallingonCedars),
        (maxS)-[:ACTED_IN {roles: ['Nels Gudmundsson']}]->(snowFallingonCedars),
        (jamesC)-[:ACTED_IN {roles: ['Judge Fielding']}]->(snowFallingonCedars),
        (scottH)-[:DIRECTED]->(snowFallingonCedars)

      CREATE (youveGotMail:Movie {title: 'You\'ve Got Mail', released: 1998,
          tagline: 'At-odds-in-life, in-love-on-line'})
      CREATE (parkerP:Person {name: 'Parker Posey', born: 1968})
      CREATE (daveC:Person {name: 'Dave Chappelle', born: 1973})
      CREATE (steveZ:Person {name: 'Steve Zahn', born: 1967})
      CREATE (tomH:Person {name: 'Tom Hanks', born: 1956})
      CREATE (noraE:Person {name: 'Nora Ephron', born: 1941})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Joe Fox']}]->(youveGotMail),
        (megR)-[:ACTED_IN {roles: ['Kathleen Kelly']}]->(youveGotMail),
        (gregK)-[:ACTED_IN {roles: ['Frank Navasky']}]->(youveGotMail),
        (parkerP)-[:ACTED_IN {roles: ['Patricia Eden']}]->(youveGotMail),
        (daveC)-[:ACTED_IN {roles: ['Kevin Jackson']}]->(youveGotMail),
        (steveZ)-[:ACTED_IN {roles: ['George Pappas']}]->(youveGotMail),
        (noraE)-[:DIRECTED]->(youveGotMail)

      CREATE (sleeplessInSeattle:Movie {title: 'Sleepless-in-Seattle', released: 1993,
          tagline: 'What if someone you never met, someone you never saw, someone you never knew was the only someone for you?'})
      CREATE (ritaW:Person {name: 'Rita Wilson', born: 1956})
      CREATE (billPull:Person {name: 'Bill Pullman', born: 1953})
      CREATE (victorG:Person {name: 'Victor Garber', born: 1949})
      CREATE (rosieO:Person {name: 'Rosie O\'Donnell', born: 1962})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Sam Baldwin']}]->(sleeplessInSeattle),
        (megR)-[:ACTED_IN {roles: ['Annie Reed']}]->(sleeplessInSeattle),
        (ritaW)-[:ACTED_IN {roles: ['Suzy']}]->(sleeplessInSeattle),
        (billPull)-[:ACTED_IN {roles: ['Walter']}]->(sleeplessInSeattle),
        (victorG)-[:ACTED_IN {roles: ['Greg']}]->(sleeplessInSeattle),
        (rosieO)-[:ACTED_IN {roles: ['Becky']}]->(sleeplessInSeattle),
        (noraE)-[:DIRECTED]->(sleeplessInSeattle)

      CREATE (joeVersustheVolcano:Movie {title: 'Joe-Versus-the-Volcano', released: 1990,
          tagline: 'A story of love'})
      CREATE (johnS:Person {name: 'John Patrick Stanley', born: 1950})
      CREATE (nathan:Person {name: 'Nathan Lane', born: 1956})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Joe Banks']}]->(joeVersustheVolcano),
        (megR)-[:ACTED_IN {roles: ['DeDe', 'Angelica Graynamore', 'Patricia Graynamore']}]->(joeVersustheVolcano),
        (nathan)-[:ACTED_IN {roles: ['Baw']}]->(joeVersustheVolcano),
        (johnS)-[:DIRECTED]->(joeVersustheVolcano)

      CREATE (whenHarryMetSally:Movie {title: 'When-Harry-Met-Sally', released: 1998,
          tagline: 'When-Harry-Met-Sally'})
      CREATE (billyC:Person {name: 'Billy Crystal', born: 1948})
      CREATE (carrieF:Person {name: 'Carrie Fisher', born: 1956})
      CREATE (brunoK:Person {name: 'Bruno Kirby', born: 1949})
      CREATE
        (billyC)-[:ACTED_IN {roles: ['Harry Burns']}]->(whenHarryMetSally),
        (megR)-[:ACTED_IN {roles: ['Sally Albright']}]->(whenHarryMetSally),
        (carrieF)-[:ACTED_IN {roles: ['Marie']}]->(whenHarryMetSally),
        (brunoK)-[:ACTED_IN {roles: ['Jess']}]->(whenHarryMetSally),
        (robR)-[:DIRECTED]->(whenHarryMetSally),
        (robR)-[:PRODUCED]->(whenHarryMetSally),
        (noraE)-[:PRODUCED]->(whenHarryMetSally),
        (noraE)-[:WROTE]->(whenHarryMetSally)

      CREATE (thatThingYouDo:Movie {title: 'That-Thing-You-Do', released: 1996,
          tagline: 'There comes a time...'})
      CREATE (livT:Person {name: 'Liv Tyler', born: 1977})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Mr. White']}]->(thatThingYouDo),
        (livT)-[:ACTED_IN {roles: ['Faye Dolan']}]->(thatThingYouDo),
        (charlize)-[:ACTED_IN {roles: ['Tina']}]->(thatThingYouDo),
        (tomH)-[:DIRECTED]->(thatThingYouDo)

      CREATE (theReplacements:Movie {title: 'The Replacements', released: 2000,
          tagline: 'Pain heals, Chicks dig scars... Glory lasts forever'})
      CREATE (brooke:Person {name: 'Brooke Langton', born: 1970})
      CREATE (gene:Person {name: 'Gene Hackman', born: 1930})
      CREATE (orlando:Person {name: 'Orlando Jones', born: 1968})
      CREATE (howard:Person {name: 'Howard Deutch', born: 1950})
      CREATE
        (keanu)-[:ACTED_IN {roles: ['Shane Falco']}]->(theReplacements),
        (brooke)-[:ACTED_IN {roles: ['Annabelle Farrell']}]->(theReplacements),
        (gene)-[:ACTED_IN {roles: ['Jimmy McGinty']}]->(theReplacements),
        (orlando)-[:ACTED_IN {roles: ['Clifford Franklin']}]->(theReplacements),
        (howard)-[:DIRECTED]->(theReplacements)

      CREATE (rescueDawn:Movie {title: 'RescueDawn', released: 2006,
          tagline: 'The extraordinary true story'})
      CREATE (christianB:Person {name: 'Christian Bale', born: 1974})
      CREATE (zachG:Person {name: 'Zach Grenier', born: 1954})
      CREATE
        (marshallB)-[:ACTED_IN {roles: ['Admiral']}]->(rescueDawn),
        (christianB)-[:ACTED_IN {roles: ['Dieter Dengler']}]->(rescueDawn),
        (zachG)-[:ACTED_IN {roles: ['Squad Leader']}]->(rescueDawn),
        (steveZ)-[:ACTED_IN {roles: ['Duane']}]->(rescueDawn),
        (wernerH)-[:DIRECTED]->(rescueDawn)

      CREATE (theBirdcage:Movie {title: 'The-Birdcage', released: 1996, tagline: 'Come-as-you-are'})
      CREATE (mikeN:Person {name: 'Mike Nichols', born: 1931})
      CREATE
        (robin)-[:ACTED_IN {roles: ['Armand Goldman']}]->(theBirdcage),
        (nathan)-[:ACTED_IN {roles: ['Albert Goldman']}]->(theBirdcage),
        (gene)-[:ACTED_IN {roles: ['Sen. Kevin Keeley']}]->(theBirdcage),
        (mikeN)-[:DIRECTED]->(theBirdcage)

      CREATE (unforgiven:Movie {title: 'Unforgiven', released: 1992,
          tagline: 'It\'s a hell of a thing, killing a man'})
      CREATE (richardH:Person {name: 'Richard Harris', born: 1930})
      CREATE (clintE:Person {name: 'Clint Eastwood', born: 1930})
      CREATE
        (richardH)-[:ACTED_IN {roles: ['English Bob']}]->(unforgiven),
        (clintE)-[:ACTED_IN {roles: ['Bill Munny']}]->(unforgiven),
        (gene)-[:ACTED_IN {roles: ['Little Bill Daggett']}]->(unforgiven),
        (clintE)-[:DIRECTED]->(unforgiven)

      CREATE (johnnyMnemonic:Movie {title: 'Johnny-Mnemonic', released: 1995,
          tagline: 'The-hottest-data-in-the-coolest-head'})
      CREATE (takeshi:Person {name: 'Takeshi Kitano', born: 1947})
      CREATE (dina:Person {name: 'Dina Meyer', born: 1968})
      CREATE (iceT:Person {name: 'Ice-T', born: 1958})
      CREATE (robertL:Person {name: 'Robert Longo', born: 1953})
      CREATE
        (keanu)-[:ACTED_IN {roles: ['Johnny Mnemonic']}]->(johnnyMnemonic),
        (takeshi)-[:ACTED_IN {roles: ['Takahashi']}]->(johnnyMnemonic),
        (dina)-[:ACTED_IN {roles: ['Jane']}]->(johnnyMnemonic),
        (iceT)-[:ACTED_IN {roles: ['J-Bone']}]->(johnnyMnemonic),
        (robertL)-[:DIRECTED]->(johnnyMnemonic)

      CREATE (cloudAtlas:Movie {title: 'Cloud Atlas', released: 2012, tagline: 'Everything is connected'})
      CREATE (halleB:Person {name: 'Halle Berry', born: 1966})
      CREATE (jimB:Person {name: 'Jim Broadbent', born: 1949})
      CREATE (tomT:Person {name: 'Tom Tykwer', born: 1965})
      CREATE (davidMitchell:Person {name: 'David Mitchell', born: 1969})
      CREATE (stefanArndt:Person {name: 'Stefan Arndt', born: 1961})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Zachry', 'Dr. Henry Goose', 'Isaac Sachs', 'Dermot Hoggins']}]->(cloudAtlas),
        (hugo)-[:ACTED_IN {roles: ['Bill Smoke', 'Haskell Moore', 'Tadeusz Kesselring', 'Nurse Noakes', 'Boardman Mephi', 'Old Georgie']}]->(cloudAtlas),
        (halleB)-[:ACTED_IN {roles: ['Luisa Rey', 'Jocasta Ayrs', 'Ovid', 'Meronym']}]->(cloudAtlas),
        (jimB)-[:ACTED_IN {roles: ['Vyvyan Ayrs', 'Captain Molyneux', 'Timothy Cavendish']}]->(cloudAtlas),
        (tomT)-[:DIRECTED]->(cloudAtlas),
        (andyW)-[:DIRECTED]->(cloudAtlas),
        (lanaW)-[:DIRECTED]->(cloudAtlas),
        (davidMitchell)-[:WROTE]->(cloudAtlas),
        (stefanArndt)-[:PRODUCED]->(cloudAtlas)

      CREATE (theDaVinciCode:Movie {title: 'The Da Vinci Code', released: 2006, tagline: 'Break The Codes'})
      CREATE (ianM:Person {name: 'Ian McKellen', born: 1939})
      CREATE (audreyT:Person {name: 'Audrey Tautou', born: 1976})
      CREATE (paulB:Person {name: 'Paul Bettany', born: 1971})
      CREATE (ronH:Person {name: 'Ron Howard', born: 1954})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Dr. Robert Langdon']}]->(theDaVinciCode),
        (ianM)-[:ACTED_IN {roles: ['Sir Leight Teabing']}]->(theDaVinciCode),
        (audreyT)-[:ACTED_IN {roles: ['Sophie Neveu']}]->(theDaVinciCode),
        (paulB)-[:ACTED_IN {roles: ['Silas']}]->(theDaVinciCode),
        (ronH)-[:DIRECTED]->(theDaVinciCode)

      CREATE (vforVendetta:Movie {title: 'V for Vendetta', released: 2006, tagline: 'Freedom! Forever!'})
      CREATE (natalieP:Person {name: 'Natalie Portman', born: 1981})
      CREATE (stephenR:Person {name: 'Stephen Rea', born: 1946})
      CREATE (johnH:Person {name: 'John Hurt', born: 1940})
      CREATE (benM:Person {name: 'Ben Miles', born: 1967})
      CREATE
        (hugo)-[:ACTED_IN {roles: ['V']}]->(vforVendetta),
        (natalieP)-[:ACTED_IN {roles: ['Evey Hammond']}]->(vforVendetta),
        (stephenR)-[:ACTED_IN {roles: ['Eric Finch']}]->(vforVendetta),
        (johnH)-[:ACTED_IN {roles: ['High Chancellor Adam Sutler']}]->(vforVendetta),
        (benM)-[:ACTED_IN {roles: ['Dascomb']}]->(vforVendetta),
        (jamesM)-[:DIRECTED]->(vforVendetta),
        (andyW)-[:PRODUCED]->(vforVendetta),
        (lanaW)-[:PRODUCED]->(vforVendetta),
        (joelS)-[:PRODUCED]->(vforVendetta),
        (andyW)-[:WROTE]->(vforVendetta),
        (lanaW)-[:WROTE]->(vforVendetta)

      CREATE (speedRacer:Movie {title: 'Speed Racer', released: 2008, tagline: 'Speed has no limits'})
      CREATE (emileH:Person {name: 'Emile Hirsch', born: 1985})
      CREATE (johnG:Person {name: 'John Goodman', born: 1960})
      CREATE (susanS:Person {name: 'Susan Sarandon', born: 1946})
      CREATE (matthewF:Person {name: 'Matthew Fox', born: 1966})
      CREATE (christinaR:Person {name: 'Christina Ricci', born: 1980})
      CREATE (rain:Person {name: 'Rain', born: 1982})
      CREATE
        (emileH)-[:ACTED_IN {roles: ['Speed Racer']}]->(speedRacer),
        (johnG)-[:ACTED_IN {roles: ['Pops']}]->(speedRacer),
        (susanS)-[:ACTED_IN {roles: ['Mom']}]->(speedRacer),
        (matthewF)-[:ACTED_IN {roles: ['Racer X']}]->(speedRacer),
        (christinaR)-[:ACTED_IN {roles: ['Trixie']}]->(speedRacer),
        (rain)-[:ACTED_IN {roles: ['Taejo Togokahn']}]->(speedRacer),
        (benM)-[:ACTED_IN {roles: ['Cass Jones']}]->(speedRacer),
        (andyW)-[:DIRECTED]->(speedRacer),
        (lanaW)-[:DIRECTED]->(speedRacer),
        (andyW)-[:WROTE]->(speedRacer),
        (lanaW)-[:WROTE]->(speedRacer),
        (joelS)-[:PRODUCED]->(speedRacer)

      CREATE (ninjaAssassin:Movie {title: 'Ninja Assassin', released: 2009,
          tagline: 'Prepare to enter a secret world of assassins'})
      CREATE (naomieH:Person {name: 'Naomie Harris'})
      CREATE
        (rain)-[:ACTED_IN {roles: ['Raizo']}]->(ninjaAssassin),
        (naomieH)-[:ACTED_IN {roles: ['Mika Coretti']}]->(ninjaAssassin),
        (rickY)-[:ACTED_IN {roles: ['Takeshi']}]->(ninjaAssassin),
        (benM)-[:ACTED_IN {roles: ['Ryan Maslow']}]->(ninjaAssassin),
        (jamesM)-[:DIRECTED]->(ninjaAssassin),
        (andyW)-[:PRODUCED]->(ninjaAssassin),
        (lanaW)-[:PRODUCED]->(ninjaAssassin),
        (joelS)-[:PRODUCED]->(ninjaAssassin)

      CREATE (theGreenMile:Movie {title: 'The Green Mile', released: 1999,
          tagline: 'Walk a mile you\'ll never forget.'})
      CREATE (michaelD:Person {name: 'Michael Clarke Duncan', born: 1957})
      CREATE (davidM:Person {name: 'David Morse', born: 1953})
      CREATE (samR:Person {name: 'Sam Rockwell', born: 1968})
      CREATE (garyS:Person {name: 'Gary Sinise', born: 1955})
      CREATE (patriciaC:Person {name: 'Patricia Clarkson', born: 1959})
      CREATE (frankD:Person {name: 'Frank Darabont', born: 1959})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Paul Edgecomb']}]->(theGreenMile),
        (michaelD)-[:ACTED_IN {roles: ['John Coffey']}]->(theGreenMile),
        (davidM)-[:ACTED_IN {roles: ['Brutus Brutal Howell']}]->(theGreenMile),
        (bonnieH)-[:ACTED_IN {roles: ['Jan Edgecomb']}]->(theGreenMile),
        (jamesC)-[:ACTED_IN {roles: ['Warden Hal Moores']}]->(theGreenMile),
        (samR)-[:ACTED_IN {roles: ['Wild Bill Wharton']}]->(theGreenMile),
        (garyS)-[:ACTED_IN {roles: ['Burt Hammersmith']}]->(theGreenMile),
        (patriciaC)-[:ACTED_IN {roles: ['Melinda Moores']}]->(theGreenMile),
        (frankD)-[:DIRECTED]->(theGreenMile)

      CREATE (frostNixon:Movie {title: 'Frost/Nixon', released: 2008,
          tagline: '400 million people were waiting for the truth.'})
      CREATE (frankL:Person {name: 'Frank Langella', born: 1938})
      CREATE (michaelS:Person {name: 'Michael Sheen', born: 1969})
      CREATE (oliverP:Person {name: 'Oliver Platt', born: 1960})
      CREATE
        (frankL)-[:ACTED_IN {roles: ['Richard Nixon']}]->(frostNixon),
        (michaelS)-[:ACTED_IN {roles: ['David Frost']}]->(frostNixon),
        (kevinB)-[:ACTED_IN {roles: ['Jack Brennan']}]->(frostNixon),
        (oliverP)-[:ACTED_IN {roles: ['Bob Zelnick']}]->(frostNixon),
        (samR)-[:ACTED_IN {roles: ['James Reston, Jr.']}]->(frostNixon),
        (ronH)-[:DIRECTED]->(frostNixon)

      CREATE (hoffa:Movie {title: 'Hoffa', released: 1992, tagline: "He didn't want law. He wanted justice."})
      CREATE (dannyD:Person {name: 'Danny DeVito', born: 1944})
      CREATE (johnR:Person {name: 'John C. Reilly', born: 1965})
      CREATE
        (jackN)-[:ACTED_IN {roles: ['Hoffa']}]->(hoffa),
        (dannyD)-[:ACTED_IN {roles: ['Robert Bobby Ciaro']}]->(hoffa),
        (jTW)-[:ACTED_IN {roles: ['Frank Fitzsimmons']}]->(hoffa),
        (johnR)-[:ACTED_IN {roles: ['Peter Connelly']}]->(hoffa),
        (dannyD)-[:DIRECTED]->(hoffa)

      CREATE (apollo13:Movie {title: 'Apollo 13', released: 1995, tagline: 'Houston, we have a problem.'})
      CREATE (edH:Person {name: 'Ed Harris', born: 1950})
      CREATE (billPax:Person {name: 'Bill Paxton', born: 1955})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Jim Lovell']}]->(apollo13),
        (kevinB)-[:ACTED_IN {roles: ['Jack Swigert']}]->(apollo13),
        (edH)-[:ACTED_IN {roles: ['Gene Kranz']}]->(apollo13),
        (billPax)-[:ACTED_IN {roles: ['Fred Haise']}]->(apollo13),
        (garyS)-[:ACTED_IN {roles: ['Ken Mattingly']}]->(apollo13),
        (ronH)-[:DIRECTED]->(apollo13)

      CREATE (twister:Movie {title: 'Twister', released: 1996, tagline: 'Don\'t Breathe. Don\'t Look Back.'})
      CREATE (philipH:Person {name: 'Philip Seymour Hoffman', born: 1967})
      CREATE (janB:Person {name: 'Jan de Bont', born: 1943})
      CREATE
        (billPax)-[:ACTED_IN {roles: ['Bill Harding']}]->(twister),
        (helenH)-[:ACTED_IN {roles: ['Dr. Jo Harding']}]->(twister),
        (zachG)-[:ACTED_IN {roles: ['Eddie']}]->(twister),
        (philipH)-[:ACTED_IN {roles: ['Dustin Davis']}]->(twister),
        (janB)-[:DIRECTED]->(twister)

      CREATE (castAway:Movie {title: 'Cast Away', released: 2000,
          tagline: 'At the edge of the world, his journey begins.'})
      CREATE (robertZ:Person {name: 'Robert Zemeckis', born: 1951})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Chuck Noland']}]->(castAway),
        (helenH)-[:ACTED_IN {roles: ['Kelly Frears']}]->(castAway),
        (robertZ)-[:DIRECTED]->(castAway)

      CREATE (oneFlewOvertheCuckoosNest:Movie {title: 'One Flew Over the Cuckoo\'s Nest', released: 1975,
          tagline: 'If he is crazy, what does that make you?'})
      CREATE (milosF:Person {name: 'Milos Forman', born: 1932})
      CREATE
        (jackN)-[:ACTED_IN {roles: ['Randle McMurphy']}]->(oneFlewOvertheCuckoosNest),
        (dannyD)-[:ACTED_IN {roles: ['Martini']}]->(oneFlewOvertheCuckoosNest),
        (milosF)-[:DIRECTED]->(oneFlewOvertheCuckoosNest)

      CREATE (somethingsGottaGive:Movie {title: 'Something\'s Gotta Give', released: 2003})
      CREATE (dianeK:Person {name: 'Diane Keaton', born: 1946})
      CREATE (nancyM:Person {name: 'Nancy Meyers', born: 1949})
      CREATE
        (jackN)-[:ACTED_IN {roles: ['Harry Sanborn']}]->(somethingsGottaGive),
        (dianeK)-[:ACTED_IN {roles: ['Erica Barry']}]->(somethingsGottaGive),
        (keanu)-[:ACTED_IN {roles: ['Julian Mercer']}]->(somethingsGottaGive),
        (nancyM)-[:DIRECTED]->(somethingsGottaGive),
        (nancyM)-[:PRODUCED]->(somethingsGottaGive),
        (nancyM)-[:WROTE]->(somethingsGottaGive)

      CREATE (bicentennialMan:Movie {title: 'Bicentennial Man', released: 1999,
          tagline: 'One robot\'s 200 year journey to become an ordinary man.'})
      CREATE (chrisC:Person {name: 'Chris Columbus', born: 1958})
      CREATE
        (robin)-[:ACTED_IN {roles: ['Andrew Marin']}]->(bicentennialMan),
        (oliverP)-[:ACTED_IN {roles: ['Rupert Burns']}]->(bicentennialMan),
        (chrisC)-[:DIRECTED]->(bicentennialMan)

      CREATE (charlieWilsonsWar:Movie {title: 'Charlie Wilson\'s War', released: 2007,
          tagline: 'A stiff drink. A little mascara. A lot of nerve. Who said they could not bring down the Soviet empire.'})
      CREATE (juliaR:Person {name: 'Julia Roberts', born: 1967})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Rep. Charlie Wilson']}]->(charlieWilsonsWar),
        (juliaR)-[:ACTED_IN {roles: ['Joanne Herring']}]->(charlieWilsonsWar),
        (philipH)-[:ACTED_IN {roles: ['Gust Avrakotos']}]->(charlieWilsonsWar),
        (mikeN)-[:DIRECTED]->(charlieWilsonsWar)

      CREATE (thePolarExpress:Movie {title: 'The Polar Express', released: 2004,
          tagline: 'This Holiday Season... Believe'})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Hero Boy', 'Father', 'Conductor', 'Hobo', 'Scrooge', 'Santa Claus']}]->(thePolarExpress),
        (robertZ)-[:DIRECTED]->(thePolarExpress)

      CREATE (aLeagueofTheirOwn:Movie {title: 'A League of Their Own', released: 1992,
          tagline: 'A league of their own'})
      CREATE (madonna:Person {name: 'Madonna', born: 1954})
      CREATE (geenaD:Person {name: 'Geena Davis', born: 1956})
      CREATE (loriP:Person {name: 'Lori Petty', born: 1963})
      CREATE (pennyM:Person {name: 'Penny Marshall', born: 1943})
      CREATE
        (tomH)-[:ACTED_IN {roles: ['Jimmy Dugan']}]->(aLeagueofTheirOwn),
        (geenaD)-[:ACTED_IN {roles: ['Dottie Hinson']}]->(aLeagueofTheirOwn),
        (loriP)-[:ACTED_IN {roles: ['Kit Keller']}]->(aLeagueofTheirOwn),
        (rosieO)-[:ACTED_IN {roles: ['Doris Murphy']}]->(aLeagueofTheirOwn),
        (madonna)-[:ACTED_IN {roles: ['Mae Mordabito']}]->(aLeagueofTheirOwn),
        (billPax)-[:ACTED_IN {roles: ['Bob Hinson']}]->(aLeagueofTheirOwn),
        (pennyM)-[:DIRECTED]->(aLeagueofTheirOwn)

      CREATE (paulBlythe:Person {name: 'Paul Blythe'})
      CREATE (angelaScope:Person {name: 'Angela Scope'})
      CREATE (jessicaThompson:Person {name: 'Jessica Thompson'})
      CREATE (jamesThompson:Person {name: 'James Thompson'})

      CREATE
        (jamesThompson)-[:FOLLOWS]->(jessicaThompson),
        (angelaScope)-[:FOLLOWS]->(jessicaThompson),
        (paulBlythe)-[:FOLLOWS]->(angelaScope)

      CREATE
        (jessicaThompson)-[:REVIEWED {summary: 'An amazing journey', rating: 95}]->(cloudAtlas),
        (jessicaThompson)-[:REVIEWED {summary: 'Silly, but fun', rating: 65}]->(theReplacements),
        (jamesThompson)-[:REVIEWED {summary: 'The coolest football movie ever', rating: 100}]->(theReplacements),
        (angelaScope)-[:REVIEWED {summary: 'Pretty funny at times', rating: 62}]->(theReplacements),
        (jessicaThompson)-[:REVIEWED {summary: 'Dark, but compelling', rating: 85}]->(unforgiven),
        (jessicaThompson)-[:REVIEWED {summary: 'Slapstick', rating: 45}]->(theBirdcage),
        (jessicaThompson)-[:REVIEWED {summary: 'A solid romp', rating: 68}]->(theDaVinciCode),
        (jamesThompson)-[:REVIEWED {summary: 'Fun, but a little far fetched', rating: 65}]->(theDaVinciCode),
        (jessicaThompson)-[:REVIEWED {summary: 'You had me at Jerry', rating: 92}]->(jerryMaguire)

      """
    Then the result should be empty
    And the side effects should be:
      | +nodes         | 171 |
      | +relationships | 253 |
      | +properties    | 564 |
      | +labels        | 171 |

  Scenario: Non-existent values in a property map are removed with SET =
    Given any graph
    And having executed:
      """
      CREATE (:X {foo: 'A', bar: 'B'})
      """
    When executing query:
      """
      MATCH (n:X {foo: 'A'})
      SET n = {foo: 'B', baz: 'C'}
      RETURN n
      """
    Then the result should be:
      | n                         |
      | (:X {foo: 'B', baz: 'C'}) |
    And the side effects should be:
      | +properties | 2 |
      | -properties | 1 |
