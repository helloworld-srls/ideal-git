public class Test {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        int k = i+ ++i * i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println("**********************************");
        int ii =1;
        ii = ii++;
        System.out.println(ii);
        int jj =1;
        jj = ++jj;
        System.out.println(jj);
    }

}
