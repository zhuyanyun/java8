package design.patterns.chapter_11.proxy;

import jike.perfectcode.Person;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-08-12 10:30
 * @Vertion 1.0
 **/
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
//        initia
    }

    public void drive(){
        PersonBean personBean = new PersonBeanImpl();
        personBean.setName("zyy");
        PersonBean ownerProxy = getOwnerProxy(personBean);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling,go");
        System.out.println("Interests set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception e){
            System.out.println("应该不能改：" + ownerProxy.getHotOrNotRating());
        }
    }

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),new OwnerInvocationHandler(person));
    }
}
