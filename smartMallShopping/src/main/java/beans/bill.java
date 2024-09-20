package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class bill {
    @Id
  private   int billno;
//    use forgin key
  private   String email;
  private   double amount;
  private   Date billgenerate;

    public int getBillno() {
        return billno;
    }

    public void setBillno(int billno) {
        this.billno = billno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getBillgenerate() {
        return billgenerate;
    }

    public void setBillgenerate(Date billgenerate) {
        this.billgenerate = billgenerate;
    }

    @Override
    public String toString() {
        return "bill{" +
                "billno=" + billno +
                ", email='" + email + '\'' +
                ", amount=" + amount +
                ", billgenerate=" + billgenerate +
                '}';
    }
}
