package Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(){
        System.out.println("checkout method from shopping cart called and executed!");
    }
}
