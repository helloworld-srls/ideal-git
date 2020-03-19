package singleton;

public class SingletonTypeOne {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }

    //饿汉模式
    public static class Singleton{
        //内部创建实例
        private static Singleton instance = new Singleton();
        //私有化构造器
        private Singleton(){}
        //返回实例
        public static Singleton getInstance(){
            return instance;
        }
    }
}
