package enthuware.Test1;

public class MyLong {

    public static void main(String[] args) {
        String mStr = "123";
        long m = new Long(mStr); // 1
        m = Long.parseLong(mStr);
        m = Long.valueOf(mStr).longValue();
        m = (new Long()).parseLong(mStr);
        System.out.println(m);
        
        float f2 = 123_345_667F;
        
    }
}
