package ticaretsitesi.Business.concretes;

import java.util.List;
import ticaretsitesi.Business.abstracts.ProductService;
import ticaretsitesi.core.abstracts.LoggerService;
import ticaretsitesi.core.concretes.JLoggerManager;
import ticaretsitesi.entities.concretes.Product;

public class MailCheck implements ProductService {

    @Override
    public void checkMail(List<Product> list) {
        LoggerService loggerService = new JLoggerManager();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).getMail().equals(list.get(j).getMail())) {
                    System.out.println("***************************************");
                    System.out.println(list.get(j).getFirstName() + " change your mail ");
                    System.out.println("Similar Mails");
                    System.out.println("First User : " + list.get(i).getFirstName());
                    System.out.println("First Mail : " + list.get(i).getMail());
                    System.out.println("Second User : " + list.get(j).getFirstName());
                    System.out.println("Second Mail : " + list.get(j).getMail());
                    System.out.println("**************************************");
                    list.remove(j);
                }
            }
            System.out.println("Your contact information has been saved " + list.get(i).getFirstName());
                loggerService.SendMail(list.get(i));
                loggerService.Save(list.get(i));

        }
    }

    @Override
    public void add(Product products[]) {
    }

    @Override
    public void loginMail(String mail, String password) {
    }

    @Override
    public boolean CheckMail(List<Product> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
