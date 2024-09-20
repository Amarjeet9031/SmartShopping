package beans;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table
public class Product {
        @Id
        private int pid;
        private  String pname;
        //foregin key used
        private  int categoryId;
        private BigInteger Quality;
        private String manufacturingdate;
        private  String expirydate;
        private  double price;
        private String manufactuingCompany;
        private String about;
        private String madeIn;

       public Product(){

        }

    public Product(int pid, String pname, int categoryId, BigInteger quality, String manufacturingdate,
                   String expirydate, double price, String manufactuingCompany, String about, String madeIn) {
        this.pid = pid;
        this.pname = pname;
        this.categoryId = categoryId;
        Quality = quality;
        this.manufacturingdate = manufacturingdate;
        this.expirydate = expirydate;
        this.price = price;
        this.manufactuingCompany = manufactuingCompany;
        this.about = about;
        this.madeIn = madeIn;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public BigInteger getQuality() {
        return Quality;
    }

    public void setQuality(BigInteger quality) {
        Quality = quality;
    }

    public String getManufacturingdate() {
        return manufacturingdate;
    }

    public void setManufacturingdate(String manufacturingdate) {
        this.manufacturingdate = manufacturingdate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getManufactuingCompany() {
        return manufactuingCompany;
    }

    public void setManufactuingCompany(String manufactuingCompany) {
        this.manufactuingCompany = manufactuingCompany;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }


    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", categoryId=" + categoryId +
                ", Quality=" + Quality +
                ", manufacturingdate='" + manufacturingdate + '\'' +
                ", expirydate='" + expirydate + '\'' +
                ", price=" + price +
                ", manufactuingCompany='" + manufactuingCompany + '\'' +
                ", about='" + about + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
}
