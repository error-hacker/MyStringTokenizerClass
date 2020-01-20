public class Main {
    public static void main(String[] args) {
        String s = "country=india;country=japan;capital=delhi;capital=tokyo";
        MyStringTokenizer mst = new MyStringTokenizer(s, ";=");
        while (mst.hasMoreElements()) {
            System.out.println(mst.nextTokenizer());
        }
    }
}
