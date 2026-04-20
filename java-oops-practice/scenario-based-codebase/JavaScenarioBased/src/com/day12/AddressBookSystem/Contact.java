package com.day12.AddressBookSystem;

class Contact implements Comparable<Contact> {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private Address address;

    public Contact(String firstName, String lastName,String phoneNumber, String email,Address address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public int compareTo(Contact c) {
        return this.firstName.compareToIgnoreCase(c.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName +
               ", Phone: " + phoneNumber +
               ", Email: " + email +
               ", Address: " + address;
    }
}
