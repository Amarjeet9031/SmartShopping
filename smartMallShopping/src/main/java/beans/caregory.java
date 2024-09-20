package beans;

import javax.persistence.*;

@Entity
@Table
public class caregory {
    @Id
    @Column(name = "Category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private   int category_id;
   private String CategoryName;

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    @Override
    public String toString() {
        return "caregory{" +
                "category_id=" + category_id +
                ", CategoryName='" + CategoryName + '\'' +
                '}';
    }
}
