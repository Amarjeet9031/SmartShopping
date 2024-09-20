package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class cart_item {
    @Id
    private    int cart_item_id;
//    foregn key
    private  int Cart_id;
//    foregn key
    private int pro_id;
    private  int noofQuantity;

    public int getCart_item_id() {
        return cart_item_id;
    }

    public void setCart_item_id(int cart_item_id) {
        this.cart_item_id = cart_item_id;
    }

    public int getCart_id() {
        return Cart_id;
    }

    public void setCart_id(int cart_id) {
        Cart_id = cart_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getNoofQuantity() {
        return noofQuantity;
    }

    public void setNoofQuantity(int noofQuantity) {
        this.noofQuantity = noofQuantity;
    }

    @Override
    public String toString() {
        return "cart_item{" +
                "cart_item_id=" + cart_item_id +
                ", Cart_id=" + Cart_id +
                ", pro_id=" + pro_id +
                ", noofQuantity=" + noofQuantity +
                '}';
    }
}
