/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author belob
 */
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person returnObject = this.persons.get(0);
        for (Person person: this.persons) {
            if (returnObject.getHeight() > person.getHeight()) {
                returnObject = person;
            }
        }
        return returnObject;
    }
    
    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);
        return shortestPerson;
    }
}
