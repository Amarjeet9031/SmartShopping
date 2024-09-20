package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class cart {
    @Id
   private int cartid;
   private String email;
   private Date cdate;

    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    @Override
    public String toString() {
        return "cart{" +
                "cartid=" + cartid +
                ", email='" + email + '\'' +
                ", cdate=" + cdate +
                '}';
    }
}
