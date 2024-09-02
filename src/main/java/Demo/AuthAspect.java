package Demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthAspect {

    @Pointcut("within(Demo..*)")
    public void authenticatePointCut(){
    }

    @Pointcut("within(Demo..*)")
    public void authorizationPointCut(){
    }

    @Before("authenticatePointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("authenticating the request!");
    }
}
