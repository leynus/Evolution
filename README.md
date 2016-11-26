# **Evolution**

*ein Projekt von Leif Peters und Linus Reck*

Das vorliegende Programm wurde mit Hilfe "Greenfoot's" geschrieben. Beim Bearbeiten orientierten wir und an den Stride-Angaben und an dem Greenfoot-Buch.

## **Ziel**
Dieses Programm dient der Einarbeitung in das Programm "Greenfoot", weswegen es sowohl Elemente eines Spiels der aktiven Steuerung eines "Actors", als auch Elemente eines sich selbst entwickelnden Programms (evolutionssimulierende Ansätze) enthält. So mag es einem Betrachter erscheinen, als könne man einige Befehlsketten anders ausdrücken.

## **Stride Dokumente**
Als Grundlage verwenden wir die "Crab-World" Vorlage. Diese versuchten wir durch die verschiedenen neuen Programmierfähigkeiten nach unseren Wünschen anzupassen. Wie im Folgenden zu erkennen ist, widmeten wir uns selten direkt der genannten Aufgabe, sondern versuchten diese in unser Programm und unsere dahintersteckenden Ideen zu integrieren. Für unser Programm verwendeten wir hauptsächlich die Dokumente vier bis neun der Greenfoot-Stride-Lernaktivitäten.

## **Ablauf der Programmierung**

### **Dokument 4**
Anfangs begannen wir mit einer simplen Bewegung unserer "Actor".

### **Dokument 5**
Unser vorläufiges Ziel war es nun, eine Art Evolutionssimulation zu erstellen. Im ersten Schritt versuchten wir deshalb, die Zufallskomponente der Evolution in unser Programm zu integrieren. Hierzu begannen wir mit einer zufälligen Bewegung durch eine zufällige Winkeländerung bei einem Auftreffen auf die Wand.

### **Dokument 6**
Nun versuchten wir eine Nahrungskette zu programmieren, indem verschiedene "Actor" in die World eingefügt haben und ihnen den Befehl gaben, andere "Actor" beim zusammentreffen aus der World zu entfernen.

### **Dokument 7**
Wir haben Töne eingefügt, die immer dann erklingen, wenn zwei "Actor" gleicher Klasse aufeinander trafen. Da wir dies allerdings als relativ störend auf Dauer empfanden, haben wir diesen Programmabschnitt wieder entfernt.

### **Dokument 8**
Neue Objekte zu erzeugen stand weiterhin im Fokus unserer Anstrengungen. Wir versuchten eine Art Fortpflanzung einzuführen, indem wir immer ein neues Objekt in die World einfügten, wenn zwei gleiche Objekte aufeinandertrafen. Dies führte allerdings zu einem unkontrollierten, exponentiellen Wachstum (auch Crab-Bomb genannt). Wir mussten also wietere "Umweltfaktoren" hinzufügen. In diesem Zusammenhang kamen wir auf die Idee, den Zuschauer Spieler werden zu lassen und ihm damit Einfluss auf das Geschehen gaben. Wir fügten eine Worm.class ein, welche vom Zuschauer mit den Pfeiltasten gesteuert wird und die Funktion hat, jedes andere Objekt zu fressen (aus der World zu entfernen).

### **Dokument 9**
Mit der Einführung von Variablen eröffneten sich uns neue Möglichkeiten um Zähler einzubauen. Wir konnten jetzt den Faktor Zeit in unser Spiel einbauen. Wir haben einen Hungerwert eingeführt, der ein Objekt aus der World entfernt, wenn es zu lang kein anderes Objekt mehr gefressen (aus der World entfernt) hat.

## **Weiteres**
- Um unser Programm mehr mit einem Spiel und der damit verbundenen Leistung in Verbindung zu bringen, haben wir eine Verlust-Simulation eingeführt. Eine Schlange frisst den Wurm, wenn dieser einige Zeit lang keine Nahrung mehr zu sich genommen hat. Anschließend erscheint ein "Game Over"-Bild, welches wir erarbeiteten.
- In einer weiteren Programmergänzung behandelten wir das Problem, was mit toten Objekten passiert. Als weitere Spielherausforderung erschufen wir "Zombiekrabben". Crab-Objekte die von der Worm.class gefressen wurden sollten nach einer gewissen Zeit "wiederauferstehen". Hierzu ließen wir den Wurm über die World Objekte aus der Crab2.class entstehen. Diese Class hat die gleichen Eigenschaften, wie die normale Crab.class, "ersteht" aber nicht wieder auf, nachdem sie gefressen wurde. Herausforderung war hier vor allem das Abstimmen von Variablen und if-Schleifen, sodass pro toter Krabbe nur eine "Zombiekrabbe" am Todesort der gefressenen Krabbe entsteht.
