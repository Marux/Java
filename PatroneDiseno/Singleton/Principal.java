public class Principal {

    public static void main(String[] args) {
Singleton.getInstance();


        Ejemplo e = new Ejemplo();
        Ejemplo e1 = new Ejemplo();

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        ClassInner c = ClassInner.getInstabnce();

        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(c.hashCode());

    }

}
