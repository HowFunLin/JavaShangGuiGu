package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * ��̬����ľ���
 *
 * @author shkstart
 * @create 2019 ���� 10:18
 */

interface Human{

    String getBelief();

    void eat(String food);

}
//��������
class SuperMan implements Human{


    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("��ϲ����" + food);
    }
}

class HumanUtil{

    public void method1(){
        System.out.println("====================ͨ�÷���һ====================");

    }

    public void method2(){
        System.out.println("====================ͨ�÷�����====================");
    }

}

/*
Ҫ��ʵ�ֶ�̬������Ҫ��������⣿
����һ����θ��ݼ��ص��ڴ��еı������࣬��̬�Ĵ���һ�������༰�����
���������ͨ��������Ķ�����÷���aʱ����ζ�̬��ȥ���ñ��������е�ͬ������a��


 */

class ProxyFactory{
    //���ô˷���������һ��������Ķ��󡣽������һ
    public static Object getProxyInstance(Object obj){//obj:��������Ķ���
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
    }

}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;//��Ҫʹ�ñ�������Ķ�����и�ֵ

    public void bind(Object obj){
        this.obj = obj;
    }

    //������ͨ��������Ķ��󣬵��÷���aʱ���ͻ��Զ��ĵ������µķ�����invoke()
    //����������Ҫִ�еķ���a�Ĺ��ܾ�������invoke()��
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        HumanUtil util = new HumanUtil();
        util.method1();

        //method:��Ϊ�����������õķ������˷���Ҳ����Ϊ�˱����������Ҫ���õķ���
        //obj:��������Ķ���
        Object returnValue = method.invoke(obj,args);

        util.method2();

        //���������ķ���ֵ����Ϊ��ǰ���е�invoke()�ķ���ֵ��
        return returnValue;

    }
}

public class ProxyTest {

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance:������Ķ���
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
        //��ͨ�������������÷���ʱ�����Զ��ĵ��ñ���������ͬ���ķ���
        String belief = proxyInstance.getBelief();
        System.out.println(belief);
        proxyInstance.eat("�Ĵ�������");
    }
}