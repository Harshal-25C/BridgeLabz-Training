package com.day12.AddressBookSystem;

public class AddressBookApp {

    public static void main(String[] args) {

        AddressBook book = new AddressBook();

        Address a1 = new Address("Pune", "Maharashtra", "411001");
        Address a2 = new Address("Mumbai", "Maharashtra", "400001");

        Contact c1 = new Contact("Harshal", "Choudhary",
                "9876543210", "harshal@gmail.com", a1);

        Contact c2 = new Contact("Amit", "Sharma",
                "9123456780", "amit@gmail.com", a2);

        book.addContact(c1);
        book.addContact(c2);

        System.out.println("\nAll Contacts:");
        book.displayAllContacts();

        System.out.println("\nSearch by City:");
        book.searchByCityOrState("Pune");

        System.out.println("\nDelete Contact:");
        book.deleteContact("Amit");

        System.out.println("\nFinal Contact List:");
        book.displayAllContacts();
    }
}
