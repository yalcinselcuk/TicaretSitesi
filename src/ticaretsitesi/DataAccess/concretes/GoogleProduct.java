package ticaretsitesi.DataAccess.concretes;

import ticaretsitesi.DataAccess.abstracts.ProductDao;
import ticaretsitesi.entities.concretes.Product;

public class GoogleProduct implements ProductDao {

    @Override
    public void add() {
        System.out.println("Signing in with your Google Account Successful");
    }
    @Override
    public void notAdd(){
        System.out.println("Login With Your Google Account Was Not Successful");
    }

    @Override
    public void add(String mail, String password) {

    }

}
