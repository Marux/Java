public class ClassInner {

    private static class SingletonHolder {
        public static ClassInner instance = new ClassInner();
    }

    private ClassInner() {
    }
    public static ClassInner getInstabnce() {
        return SingletonHolder.instance;
    }

}
