# **Evolution**

*ein Projekt von Leif Peters und Linus Reck*

Das vorliegende Programm wurde mit Hilfe "Greenfoot's" geschrieben. Beim Bearbeiten orientierten wir und an den Stride-Angaben und an dem Greenfoot-Buch.

## **Anfänge**
Unsere eigentliche Idee war es, mit einem RaspberryPi zu arbeiten. In den ersten Stunden probierten wir dies aus und installierten ein neues Betriebssystem auf einem dieser Computer. Da wir uns diese Arbeit allerdings anders vorgestellt hatten, hörten wir recht schnell mit diesem Projekt auf und ließen uns eine neue Idee einfallen. Unser Ziel war (und ist) es ein Doppelkopfspiel mit Greenfoot zu programmieren. Dafür müssten wir uns aber erstmal mit dem Programm und Programmierung allgemein auseinandersetzen. Wir begannen mit den Greenfoot-Stride Lernaktivitäten. Später haben wir auf Grundlage dieser, eigene Ideen in die Welt gebracht, woraus nach einer Zeit ein Spiel entstanden ist.

## **Sinn des Programms**
Dieses Programm dient der Einarbeitung in das Programm "Greenfoot", weswegen es sowohl Elemente eines Spiels der aktiven Steuerung eines "Actors", als auch Elemente eines sich selbst entwickelnden Programms (evolutionssimulierende Ansätze) enthält. So mag es einem Betrachter erscheinen, als könne man einige Befehlsketten anders ausdrücken.

## **Ablauf des Spiels**
In diesem Spiel steuert man mit den Pfeiltasten einen Wurm. Mit der rechten und linken Pfeiltaste dreht sich der Wurm, mit der oberen und unteren Taste bewegt sich der Wurm vorwärts und rückwärts. In der Spielwelt gibt es noch drei weitere Spielklassen, die vom Computer gesteuert werden. Die Krabben, die Hummer und die Seesterne sind die anderen Klassen in diesem Spiel. Sie fressen sich gegenseitig und vermehren sich, wenn sie jemanden gefressen haben. Wenn sie zu lange nichts fressen, verhungern sie. Der Wurm hat die Fähigkeit, jedes andere Tier zu fressen und kann von keinem anderen Tier getötet werden. Er verhungert aber auch, wenn er zu lange nichts gegessen hat. Wenn der Wurm eine Krabbe frisst, erscheint diese nach einer Zeit als Zombiekrabbe am Todesort wieder. Zombiekrabben sind doppelt so schnell, wie normale Krabben und stecken diese bei Berührung an. Treffen sie auf Hummer oder Seesterne, sterben beide Tiere. 
Ziel des Spiels ist es, so lange wie möglich mit dem Wurm zu überleben.

## **Ablauf der Programmierung**

### **Erste Actor**
Als Grundlage verwenden wir die "Crab-World" Vorlage. Wir haben damit angefangen, dass wir eine einfache Crab.class in die World eingefügt haben. Durch den Befehl "move (5)" bewegt sich diese Crab.class geradeaus. Da die World begrenzt ist, veränderten wir die Bewegungsrichtung beim Auftreffen auf die Wand (Äußeres Ende der Welt). Die Richtung sollte nicht konkret vorgegeben sein, sondern immer zufällig sein. Mit dem Befehl "if (isAtEdge()) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }" konnten wir dies umsetzen. Wir haben mehrere Objekte der Crab.class in die World hinzugefügt. Außerdem haben wir die starfish.class und die lobster.class mit gleichen Eigenschaften wie die Crab.class eingefügt.

### **Nahrungskette**
Unser vorläufiges Ziel war es nun, eine Art Evolutionssimulation zu erstellen. Die drei verschiedenen Klassen sollten je eine Klasse haben, die sie fressen (aus der Welt entfernen) und von einer Klasse gefressen werden (aus der Welt entfernt werden). Wenn die Crab.class die starfish.class berührt, entfernt sie diese aus der World.

### **Zuschauer als Spieler**
Als nächstes haben wir eine worm.class in das Spiel eingefügt, welche vom Spieler gesteuert werden soll. Mit Befehlen, wie zum Beispiel "{
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        }" haben wir die Pfeiltasten belegt. Die obere und untere lässt den Wurm sich vorwärts und rückwärts bewegen. Die rechte und linke Teste lässt den Wurm sich nach rechts oder links drehen. Der Wurm bekam die Eigenschaft, alle anderen Tiere zu fressen. 


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
