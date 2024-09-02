package Demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* Demo.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("before logger Called!");
    }

    @After("execution (* *.*.checkout(..))")
    public void afterLogger(){
        System.out.println("after logger Called!");
    }
}
