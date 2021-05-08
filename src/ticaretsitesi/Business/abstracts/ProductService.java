package ticaretsitesi.Business.abstracts;

import java.util.List;
import ticaretsitesi.entities.concretes.Product;

public interface ProductService {

    public void add(Product product[]);

    public void checkMail(List <Product> list);

    public void loginMail(String mail,String password);
    
    public boolean CheckMail(List<Product> list);
}
