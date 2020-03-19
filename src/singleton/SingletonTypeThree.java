package singleton;

public class SingletonTypeThree {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance:"+instance.hashCode());
        System.out.println("instance1:"+instance1.hashCode());
    }
    //单例模式  双重检查
    public static class Singleton{
        //volatile关键字能使变量在程序中处于可见状态
        private static volatile Singleton instance;
        //私有构造器
        private Singleton(){}
        //同步方法
        public static Singleton getInstance(){
            if (instance == null)
                //同步代码块
                synchronized (Singleton.class)
            {
                if (instance == null){
                    instance = new Singleton();
                }
            }
            return instance;
        }
    }
}
