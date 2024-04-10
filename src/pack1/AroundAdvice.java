package pack1;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;

public class AroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation m) throws Throwable {
		// TODO Auto-generated method stub
		
       System.out.println("additional concern before actual logic");  
       Object ob=  m.proceed();
       System.out.println("additional concern after actual logic");  

		
		return ob;
	}

	

		
	}
	
	


