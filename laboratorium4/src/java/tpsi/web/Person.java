
package tpsi.web;

public class Person{

    private String firstName;
    private String lastName;
    private String mail;
    public Person(String firstName, String lastName, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
	this.mail = mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
	
    public String getmail() {
	return mail;
    }
	
    @Override
    public String toString() {
	return firstName + " " + lastName + " " + mail;
    }
	
}

