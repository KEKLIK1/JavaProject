package task_18;

/* class ThrowsDemo {
    public void getDetails(String key) {
        if(key == null) {
            throw new NullPointerException("null key in getDetails" );
        }
// do something with the key
    }
}*/
public class ThrowsDemo {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
        throw new NullPointerException("null key in getDetails" );
    }
        return "data for" + key; }
}