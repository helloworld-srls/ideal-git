package singleton;

public class SingletonTypeTwo {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println("instance---"+instance.hashCode());
        System.out.println("instance1---"+instance1.hashCode());
    }
    //懒汉模式
    public static class Singleton{
        //初始化一个空对象
        private static Singleton instance = null;
        //构造器私有化
        private Singleton(){}
        //创建实例对象并返回，同步方法但效率低下
        public static synchronized Singleton getInstance(){
            if (instance == null)
                {
                    instance = new Singleton();
                }
                return instance;
        }
    }
}
