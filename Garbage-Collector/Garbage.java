public class Garbage {
    public static void main(String[] args) {


        int x = 7;
        x = 9;
        
        /*
         * xti é apenas uma referência 
         * Quando deixa de apontar para "XTI" ele aponta para "xti.com.br"
         * Todavia o objecto XTI ainda está em memória e será gerenciado pelo garbage collector 
         */
        String xti = "XTI";
        xti = "xti.com.br";
        xti = null;

    }
}
