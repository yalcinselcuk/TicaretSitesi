package ticaretsitesi.Business.concretes;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ticaretsitesi.Business.abstracts.ProductService;
import ticaretsitesi.entities.concretes.Product;

public class RegexCheck implements ProductService {

    ProductService productService = new MailCheck();
    List<Product> list = new ArrayList<>();
    List<Product> list2 = new ArrayList<>();

    @Override
    public boolean CheckMail(List<Product> list) {
        String emailcontrol = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern emailPath = Pattern.compile(emailcontrol, Pattern.CASE_INSENSITIVE);
        for (int i = 0; i < list.size(); i++) {
            Matcher matcher = emailPath.matcher(list.get(i).getMail());
            if (matcher.find() == false) {
                System.out.println("The email entered is not valid. Please enter a valid email: " + list.get(i).getFirstName());
                System.out.println("Invalid Mail : "+list.get(i).getMail());
                list.remove(i);
            }

        }
        list2 = list;
        productService.checkMail(list2);
        return true;
    }

    @Override
    public void add(Product[] product) {
    }

    @Override
    public void checkMail(List<Product> list) {
    }

    @Override
    public void loginMail(String mail, String password) {
    }
}
