public class ExceptionTestArray {

public static void main(String[] args) {
try {
int a[] = new int[10];
int size = -10;
if (size < 0) {
throw new ArrayIndexOutOfBoundsException("Negative Index");
}
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println(e.getMessage());
}
}
}
