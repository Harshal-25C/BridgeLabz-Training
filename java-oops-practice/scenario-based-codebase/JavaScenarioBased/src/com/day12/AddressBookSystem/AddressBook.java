package com.day12.AddressBookSystem;

import java.util.ArrayList;
import java.util.Collections;

class AddressBook {

    private ArrayList<Contact> contacts = new ArrayList<>();

    //Add contact with duplicate validation
    public void addContact(Contact contact) {
        for(Contact c:contacts) {
            if(c.getFirstName().equalsIgnoreCase(contact.getFirstName()) &&
                c.getLastName().equalsIgnoreCase(contact.getLastName())) {

                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void editContact(String firstName, Contact updatedContact) {
        for(int i=0; i<contacts.size(); i++) {
            if(contacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                contacts.set(i, updatedContact);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(String firstName) {
        contacts.removeIf(c ->c.getFirstName().equalsIgnoreCase(firstName));
        System.out.println("Contact deleted if existed.");
    }

    public void searchByCityOrState(String value) {
        for(Contact c:contacts) {
            if(c.getAddress().getCity().equalsIgnoreCase(value) ||
                c.getAddress().getState().equalsIgnoreCase(value)) {

                System.out.println(c);
            }
        }
    }

    public void displayAllContacts() {
        Collections.sort(contacts);
        for(Contact c:contacts) {
            System.out.println(c);
        }
    }
}
