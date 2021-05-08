package ticaretsitesi.core.concretes;

import ticaretsitesi.DataAccess.abstracts.ProductDao;
import ticaretsitesi.DataAccess.concretes.GoogleProduct;
import ticaretsitesi.DataAccess.concretes.Login;
import ticaretsitesi.core.abstracts.LoggerService;
import ticaretsitesi.entities.concretes.Product;

public class JLoggerManager implements LoggerService {

    ProductDao login = new Login();
    ProductDao googleProduct = new GoogleProduct();

    public void Login(int id, String mail, String password) {
        if (id == 1) {
            System.out.println("***************************");
            System.out.println("You Selected Sign in with Google ");
            System.out.println("Mail : " + mail);
            System.out.println("Password : " + password);
            googleProduct.add();
        } else if (id == 2) {
            System.out.println("************************");
            System.out.println("You Chose Normal Login");
            login.add(mail, password);
        }
    }

    @Override
    public void SendMail(Product product) {
        System.out.println("To Verify Your Membership " + product.getMail() + " A confirmation email has been sent to your address");
    }

    @Override
    public void Save(Product product) {
        System.out.println("Clicked Verification Link");
        System.out.println("Your membership has been completed " + product.getFirstName());
        System.out.println("");

    }

    public void notSaved(Product product) {
        System.out.println("Verification Link Not Clicked");
        System.out.println("Your Membership Is Not Completed " + product.getFirstName());
    }

}
