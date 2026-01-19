package digicontact;

import java.util.*;

class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate validation
    public void addContact(Contact contact) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed.");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Edit contact by name
    public void editContact(String name, String phone,
                            String email, Address address) {
        for (Contact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(name)) {
                c.update(phone, email, address);
                System.out.println("Contact updated.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact
    public void deleteContact(String name) {
        Iterator<Contact> it = contacts.iterator();
        while (it.hasNext()) {
            if (it.next().getFullName().equalsIgnoreCase(name)) {
                it.remove();
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Search by city or state
    public void searchByCityOrState(String key) {
        boolean found = false;
        for (Contact c : contacts) {
            Address a = c.getAddress();
            if (a.getCity().equalsIgnoreCase(key) ||
                a.getState().equalsIgnoreCase(key)) {
                c.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found.");
        }
    }

    // Display sorted contacts
    public void displayAll() {
        contacts.sort(Comparator.comparing(Contact::getFullName));
        for (Contact c : contacts) {
            c.display();
        }
    }
}

