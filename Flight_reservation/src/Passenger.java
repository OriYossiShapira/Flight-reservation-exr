
public class Passenger {

    private String firstName;
    private String lastName;
    private String  seatClass;
    private Double confirmationNumber = null;


    public Passenger() {
        this.firstName = IO.getString("Enter Your First Name");
        this.lastName =  IO.getString("Enter YourLast Name");
        this.seatClass =  IO.getString("Enter Your Address");
    }


    public Passenger(String firstName, String lastName, String seatClass) {
        this.firstName = firstName;
        this.lastName =  lastName;
        this.seatClass = seatClass;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public Double getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber( Double confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @Override
    public String toString() {
        return "Passenger number: "  + getConfirmationNumber() + ", Name: " + getFirstName() + " " + getLastName();
    }
}

