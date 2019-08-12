package design.patterns.chapter_11.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-12 10:06
 * @Vertion 1.0
 **/
public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean person;

    public NonOwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try {
            if(method.getName().startsWith("get")){
                return method.invoke(person,args);
            }else if(method.getName().equals("setHotOrNotRating")){
                return method.invoke(person,args);
            }else if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
