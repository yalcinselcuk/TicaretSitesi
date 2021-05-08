package ticaretsitesi.DataAccess.concretes;

import ticaretsitesi.Business.concretes.ProductManager;
import ticaretsitesi.DataAccess.abstracts.ProductDao;
import ticaretsitesi.entities.concretes.Product;

public class Login implements ProductDao {

    ProductManager productManager = new ProductManager();

    @Override
    public void add(String mail,String password) {
        productManager.loginMail(mail,password);
    }

    @Override
    public void add() {
    }

    @Override
    public void notAdd() {
    }

}
