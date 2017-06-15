public class ExceptionTestClass {
public static void main(String[] args) {
try {
Object o = new Integer(5);
System.out.println((String)o);
} catch (ClassCastException e) {
System.out.println(e);
}
}
}