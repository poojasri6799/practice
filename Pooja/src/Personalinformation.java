public class Personalinformation {
    String FirstName;
    String LastName;
    public Personalinformation(String FirstName,String LastName){
        super();
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
}
