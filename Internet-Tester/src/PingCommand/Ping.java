package PingCommand;

public class Ping {
    public static void main(String[] args) throws Exception {
        int intitAddress = 100001;  
        int [] arrayIps = new int [254];

        AtribuirIps(arrayIps, intitAddress);

        IpFormmater(arrayIps);
    }

    public static void AtribuirIps (int [] array, int initValue){
        for (int i = 0; i<array.length; i++){
            array[i] = initValue;
            initValue ++;
        }
    }


    public static String IpFormmater (int [] array){
        //String stringAddress = String.valueOf(address); //Cast int for string
        String formatedAddress;
        String [] retorno = new String[254];

        for (int i = 0; i<array.length; i++){
            String stringAddress = String.valueOf(array[i]);
            StringBuilder buildIp = new StringBuilder(stringAddress);
            if(array[i]>100099){
                array[i] = 1000100;
                buildIp.insert(2,".");
                buildIp.insert(4,".");
                buildIp.insert(5,"0");
                buildIp.insert(6,".");
                formatedAddress = String.valueOf(buildIp);
                retorno[i] = formatedAddress;
                System.out.println(retorno[i]);
            } else {
                buildIp.insert(2,".");
                buildIp.insert(4,".");
                buildIp.insert(6,".");
                formatedAddress = String.valueOf(buildIp);
                retorno[i] = formatedAddress;
                System.out.println(retorno[i]);
            }
        }
        return "ok";
    }

    public static boolean SearchAddress (String address, int searchMaxTime) {
        try {
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}



