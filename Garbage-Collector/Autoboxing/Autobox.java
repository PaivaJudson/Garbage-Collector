package Autoboxing;

public class Autobox {
    
    public static void main(String[] args) {
        
        Integer x = new Integer(555);

        int xy = x.intValue();
        xy++;

        x = new Integer(xy);

        Integer yx = 555;

        yx++;

        System.out.println(yx);
        
    }

}
