import beans.Customer;
import beans.User;
import beans.Product;

import services.CustomerServices;
import services.ProductServices;
import services.UserServices;

import servicesImp.CustomerServicesImp;
import servicesImp.ProductServicesImp;
import servicesImp.UserServicesImp;


import Exception.ResourceNotFoundException;


import java.math.BigInteger;

import java.util.List;
import java.util.Scanner;

public class AllOperation {
    static Scanner sc = new Scanner(System.in);
    static CustomerServices customerServices=  new CustomerServicesImp();
    static ProductServices productServices = new ProductServicesImp();
    static UserServices userServices = new UserServicesImp();


    public static User inputUser() {
        System.out.println("Enter the id ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the user email ");
        String uemail = sc.nextLine();
        System.out.println("Enter the password");
        String upassword = sc.nextLine();
        System.out.println("Which type of user");
        String uType = sc.nextLine();
        return new User(id, uemail, upassword, uType);

    }


    public static void UserOperation() {

        while (true) {
            System.out.println("Press 1.Add User Details\nPress 2.Retrieve All User Data\n"
                    + "Press 3.Update User Data\nPress 4.Delete User Data\n"
                    + "Press 5.To getback to the main menu");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    User user = inputUser();
                    User savedEntity = userServices.createUser(user);
                    System.out.println("User Data has been saved successfully" + savedEntity);
                    break;
                case 2:
                    List<User> userList = userServices.getAllUser();
                    for (User user1 : userList) {
                        System.out.println(user1);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.println("Enter User Id to update the infromation");
                    int uid = sc.nextInt();
                    System.out.println(uid);
                    User s = userServices.getuser(uid);
                    if (s != null) {
                        User udateUser = updatedUserData();
                        //service
                        User updatedInfo = userServices.updatedUserData(uid, udateUser);
                        System.out.println("User Data has been updated Successfully" + updatedInfo);
                    } else {
                        throw new ResourceNotFoundException("User Id not found");
                    }

                    break;

                case 4:
                    System.out.println("Enter User Id to delete the infromation");
                    int id = sc.nextInt();
                    userServices.deleteUser(id);
                    System.out.println("deleted");
                    break;
                case 5:
                    Main.mainOps();
            }

        }


    }

    public static User updatedUserData() {
        sc.nextLine();

        System.out.println("Enter the user email ");
        String uemail = sc.nextLine();
        System.out.println("Enter the password");
        String upassword = sc.nextLine();
        System.out.println("Which type of user");
        String uType = sc.nextLine();

        return new User(uemail, upassword, uType);

    }


    public static Product inputProduct() {

        System.out.println("Entrer the product Id");
        int pid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the product Name");
        String pname=sc.nextLine();
        System.out.println("Enter the category No");
        int cid=sc.nextInt();
        System.out.println("Enter the Quantity");
        BigInteger qp=sc.nextBigInteger();
        sc.nextLine();
        System.out.println("Date of Manfauture");
        String mp=sc.nextLine();
        System.out.println("Date of Expire");
        String ep=sc.nextLine();
        System.out.println("product Prise ");
        double prise=sc.nextDouble();
        sc.nextLine();
        System.out.println("  manufactuingCompany product ");
        String manu=sc.nextLine();
        System.out.println("About this product ");
        String about=sc.nextLine();

        System.out.println("Made in    ");
        String made=sc.nextLine();


        return new Product(pid,pname,cid,qp,mp,ep,prise,manu,about,made);



    }

    public static  void ProductOperation() {
        while (true) {
            System.out.println("Press 1.Add Product. Details\nPress 2.Retrieve All Product Data\n"
                    + "Press 3.Update Product Data\nPress 4.Delete Product Data\n"
                    + "Press 5.To getback to the main menu");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    Product product = inputProduct();
                    Product savedEntity = productServices.createProduct(product);
                    System.out.println("Products  has been saved successfully" + savedEntity);
                    break;
                case 2:
                    List<Product> productList=productServices.getAllProduct();
//                    for (Product poduct1: productList){
////                        System.out.println(poduct1);
//                    }
                case 5:
                    Main.mainOps();
            }

        }
    }
    public static Customer inputCustomer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Id.");
        int cid=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Customer Name.");
         String name=sc.nextLine();
        System.out.println("Enter the Customer Eamil.");
         String email=sc.nextLine();
        System.out.println("Enter the Customer PhoneNo.");
         String phoneno=sc.nextLine();
        System.out.println("Enter the Customer Address.");
         String address=sc.nextLine();
        System.out.println("Enter the Customer Pincode.");
         String pincode=sc.nextLine();

         return new Customer(cid,name,email,phoneno,address,pincode);
    }

    public static void CustomerOperation(){

            while (true) {
                System.out.println("Press 1.Add Customer. Details\nPress 2.Retrieve All Customer Data\n"
                        + "Press 3.Update Customer Data\nPress 4.Delete Customer Data\n"
                        + "Press 5.To getback to the main menu");
                int input = sc.nextInt();

                switch (input) {
                    case 1:
                        Customer customer =  inputCustomer();
                      Customer savedEntity = customerServices.createCustomer(customer);
                        System.out.println("Customers  has been saved successfully" + savedEntity);
                        break;
                    case 2:
                        List<Customer> customerListt=  customerServices.getAllCustomer();
                    for (Customer customer1: customerListt){
                        System.out.println(customer1);
                    }
                    break;
                    case 5:
                        Main.mainOps();
                }

            }

    }
}

