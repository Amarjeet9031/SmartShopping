package beans;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table
public class stock {
    @Id
    @Column(name = "Stock_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private int pid;
    private BigInteger Stock;
    private   Date StaokDate;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public BigInteger getStock() {
        return Stock;
    }

    public void setStock(BigInteger stock) {
        Stock = stock;
    }

    public Date getStaokDate() {
        return StaokDate;
    }

    public void setStaokDate(Date staokDate) {
        StaokDate = staokDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "stock{" +
                "id=" + id +
                ", pid=" + pid +
                ", Stock=" + Stock +
                ", StaokDate=" + StaokDate +
                ", status='" + status + '\'' +
                '}';
    }
}
