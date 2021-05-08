package ticaretsitesi.core.abstracts;

import ticaretsitesi.entities.concretes.Product;

public interface LoggerService {

    public void SendMail(Product product);

    public void Save(Product product);

    public void notSaved(Product product);

    public void Login(int id, String mail, String password);
}
