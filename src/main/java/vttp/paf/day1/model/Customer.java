package vttp.paf.day1.model;

public class Customer {
    
    private int id;
    private String fullname;
    private String email;

    public Customer(){

    }

    public Customer(int id, String fullname, String email) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "customer [id=" + id + ", fullname=" + fullname + ", email=" + email + "]";
    }  

}
