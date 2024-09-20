package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table

public class purchase {
    @Id
    private int purchaseId;
//    use forgin key
    private int billNo;

//    use forgin key
    private String email;
//    use foregin key
    private int productid;
   private Date purchageDate;
    private BigInteger Quantity;

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public Date getPurchageDate() {
        return purchageDate;
    }

    public void setPurchageDate(Date purchageDate) {
        this.purchageDate = purchageDate;
    }

    public BigInteger getQuantity() {
        return Quantity;
    }

    public void setQuantity(BigInteger quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "purchase{" +
                "purchaseId=" + purchaseId +
                ", billNo=" + billNo +
                ", email='" + email + '\'' +
                ", productid=" + productid +
                ", purchageDate=" + purchageDate +
                ", Quantity=" + Quantity +
                '}';
    }
}
