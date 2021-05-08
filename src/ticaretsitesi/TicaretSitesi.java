package ticaretsitesi;

import ticaretsitesi.Business.abstracts.ProductService;
import ticaretsitesi.Business.concretes.MailCheck;
import ticaretsitesi.Business.concretes.ProductManager;
import ticaretsitesi.core.abstracts.LoggerService;
import ticaretsitesi.core.concretes.JLoggerManager;
import ticaretsitesi.entities.concretes.Product;

public class TicaretSitesi {

    public static void main(String[] args) {

        Product product1 = new Product("Engin", "Demiroğ", "engindemirog@gmail.com", "123456");
        Product product2 = new Product("Yalçın", "Selçuk", "yalcinselcuk@gmail.com", "345678");
        Product product3 = new Product("Mustafa Murat", "Coşkun", "muratcoskun@asd.asd", "567899");
        Product product4 = new Product("Kerem", "Yılmazer", "keremyilmazer@gmail.com", "12345");
        Product product5 = new Product("Münevver", "Özhan", "engindemirog@gmail.com", "234567");
        Product products[] = {product1, product2, product3, product4, product5};

        ProductService productService = new ProductManager();
        productService.add(products);

        LoggerService loggerService = new JLoggerManager();

        loggerService.Login(1, "engindemirog@gmail.com", "123456");
        loggerService.Login(2, "yalcinselcuk@gmail.com", "345678");

        System.out.println("************************************");
        
     
    }

}
