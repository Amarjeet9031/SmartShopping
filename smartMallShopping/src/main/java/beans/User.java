package beans;



import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   int id;

    @Column(name="UserName")
    private  String email;
    @Column(name="Password")
    private  String password;
    @Column(name="UserType")
    private  String userType;


    public User(int id, String email, String password, String userType) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public User(String email, String password, String userType) {
        this.email = email;
        this.password = password;
        this.userType = userType;
    }



    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    public User(){

     }
    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
