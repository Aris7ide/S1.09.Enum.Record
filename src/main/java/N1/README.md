# Nivell 1: Enums

## 📌 Enunciat del exercici
Els enums (enumeracions) permeten definir un conjunt de valors constants, donant noms significatius i millorant la seguretat del codi. Són molt útils per representar opcions tancades com dies de la setmana, nivells de prioritat o estats d’una entitat. A diferència dels String o int, els enums eviten errors per valors incorrectes i poden incloure comportament (mètodes).

En aquest nivell treballarem la creació d’enums, l’ús en condicions i classes, i com extreure informació útil a partir d’ells.

### Exercicis:
- Crea un enum anomenat Day amb els dies de la setmana. Fes una funció que rebi un Day i imprimeixi si és laborable o cap de setmana.
- Crea un enum Level amb valors LOW, MEDIUM i HIGH. Crea una classe Task amb una propietat Level i mostra com canvia el comportament en funció del nivell.
- Afegeix mètodes dins l’enum i comprova que poden tenir lògica (ex: getColor() per cada nivell de Level).
- Converteix un String a enum (amb valueOf) i gestiona errors si el valor no és vàlid.

## ✨ Funcionalitats
- Scanner
- Excepciones

## 🛠 Tecnologies
- **Llenguatge**: Java 25
- **IDE**: IntelliJ IDEA

## Excecution

### Ejercicio 1
- Creo el enum Day con los dias de la semana
- He creado una clase DayUtils con un metodo y un switch que separe weekdays de weekend

### Ejercicio 2
- creo el enum con LOW, MEDIUM, HIGH
- tambièn he creado la clase task con el atributo Level
- creo una clase TaskUtils para darle un sentido al task level

### Ejercicio 3
- creo el enum con getColor()

### Ejercicio 4
- copio el enum con getColor()