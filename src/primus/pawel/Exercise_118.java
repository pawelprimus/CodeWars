package primus.pawel;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

// Meeting
// 6kyu
// https://www.codewars.com/kata/59df2f8f08c6cec835000012/train/java
// 2021-05-10 T:18:50:05
class Exercise_118 {

    public static String meeting(String s) {
        String[] persons = s.split("[;+:]");
        LinkedList<Person> personsLinkedList= new LinkedList<>();
        for (int i = 0; i < persons.length; i = i +2) {
        personsLinkedList.add(new Person(persons[i].toUpperCase(), persons[i+1].toUpperCase()));
        }

        personsLinkedList.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getName));

        StringBuilder resultStringChain = new StringBuilder();
        for (Person person : personsLinkedList){
            resultStringChain.append(person.toString());
            System.out.println(person.toString());
        }

        return resultStringChain.toString();
    }

    public static void main(String[] args) {
        meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn");
    }

    public static class Person{
        String name;
        String lastName;

        Person(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        String getName() {
            return name;
        }

        String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return "(" + lastName + ", " + name + ")";
        }
    }
}
