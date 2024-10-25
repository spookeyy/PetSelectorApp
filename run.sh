#!/bin/bash
mkdir -p target/classes
javac -d target/classes src/main/java/com/mycompany/petselectorapp/PetSelectorApp.java
java -cp target/classes com.mycompany.petselectorapp.PetSelectorApp