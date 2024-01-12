# TextGame
## Practicing OOP with a simple text-based RPG

## Purpose
I want to learn more about object-oriented programming and program design. When I started learning about OOP, a 
text-based role-playing game seemed like a fun, natural way to explore the idea. I know very little about software 
design patterns but after learning a bit about the MVC pattern I wanted to practice implementing it as well, and I also
wanted to start working with JSON so that's how I plan to house the actual adventure data, at least for now (a database
makes more sense at some point).

## Structure
The Location class serves as the primary data model. A Location is, essentially, an ArrayList of POJOs (including
enemies, weapons, treasure, descriptions of rooms, etc.). I built a parent class for Location (called Adventure) with 
the idea that an adventure would be made up of multiple Locations, but I don't know if that's an unnecessary taxonomy. 

The Location class is assisted by the AdventureLoader class, which exists to read and parse JSON files into the model. 

The AdventureController class takes data from the model and feeds it through AdventureView for the user to interact
with on the console.

## 2023.12.05
I started this project in October 2023 and have added to it slowly as I've learned more about OOP. My immediate goal 
is to finalize the user interface using an MVC structure for both the adventure and character creation. 
Additional cleanup is needed on items generally, and specifically on weapons/inventory in the Warrior and 
Skeleton classes.
