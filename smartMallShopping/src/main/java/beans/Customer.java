package beans;



import javax.persistence.*;

@Entity
@Table
public class Customer {
    @Id
    @Column(name = "CId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int cid;
    private String name;
    private String email;
    private String phoneno;
    private String address;
    private String pincode;



    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public Customer(int cid, String name, String email, String phoneno, String address, String pincode) {
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.address = address;
        this.pincode = pincode;
    }
 public Customer(){

}
    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneno='" + phoneno + '\'' +
                ", address='" + address + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
