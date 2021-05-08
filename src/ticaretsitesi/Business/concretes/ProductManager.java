package ticaretsitesi.Business.concretes;

import java.util.ArrayList;
import java.util.List;
import ticaretsitesi.Business.abstracts.ProductService;
import ticaretsitesi.core.abstracts.LoggerService;
import ticaretsitesi.core.concretes.JLoggerManager;
import ticaretsitesi.entities.concretes.Product;

public class ProductManager implements ProductService {

    private String mail = "yalcinselcuk@gmail.com";
    private String password = "345678";

    @Override
    public void add(Product products[]) {
        List<Product> list = new ArrayList<>();
        ProductService regexCheck = new RegexCheck();

        for (Product product : products) {

            if (product.getFirstName().length() < 2 && product.getLastName().length() < 2) {
                System.out.println("Your Name and Surname must be Min 2 characters.");
                System.out.println("Try Again");
                System.out.println("*********");
            } else if (product.getFirstName().length() < 2 && product.getLastName().length() >= 2) {
                System.out.println("Your Name must be Min 2 characters");
                System.out.println("Try Again");
                System.out.println("*********");
            } else if (product.getFirstName().length() >= 2 && product.getLastName().length() < 2) {
                System.out.println("Surname must be Min 2 characters");
                System.out.println("Try Again");
                System.out.println("*********");
            } else if (product.getFirstName().length() >= 2 && product.getLastName().length() >= 2 && product.getPassword().length() < 6) {

                System.out.println("Your Password Should Not Be Less Than 6 Characters. " + product.getFirstName());
                System.out.println("Try Again");
                System.out.println("*********");
            } else if (product.getFirstName().length() >= 2 && product.getLastName().length() >= 2 && product.getPassword().length() >= 6) {
                 list.add(product);
            }
        }
        regexCheck.CheckMail(list);

    }

    @Override
    public void loginMail(String mail, String password) {

        System.out.println("Enter Your E-Mail and Password ");
        System.out.println("Mail : " + mail);
        System.out.println("Password : " + password);
        System.out.println("Mail and Password Entered");
        System.out.println("Controlling");
        if (this.mail.equals(mail) && this.password.equals(password)) {
            System.out.println("Login successful");
            System.out.println("Welcome ");
        } else if (!this.mail.equals(mail) && this.password.equals(password)) {
            System.out.println("Your Mail Is Wrong ");
            System.out.println("Check It");
        } else if (this.mail.equals(mail) && !this.password.equals(password)) {
            System.out.println("Your Password Is Wrong ");
            System.out.println("Check It");

        }
    }

    @Override
    public void checkMail(List<Product> list) {
    }

    @Override
    public boolean CheckMail(List<Product> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
