package PingCommand;

import java.net.InetAddress;

public class Ping {
    public static void main(String[] args) throws Exception {
        int intitAddress = 100001;  
        int [] arrayIps = new int [254];
        
        AtribuirIps(arrayIps, intitAddress);
        String [] formatedIp = IpFormmater(arrayIps);

        System.out.println("RETORNO BUSCA DE IP:");
        for (String singleIp : formatedIp){
            System.out.println(singleIp+": " + SearchAddress(singleIp, 100));
        }
    }

    public static void AtribuirIps (int [] array, int initValue){
        for (int i = 0; i<array.length; i++){
            array[i] = initValue;
            initValue ++;
        }
    }

    public static String [] IpFormmater (int [] array){
        String mountedIP;
        String [] formatedIp = new String[254];

        for (int i = 0; i<array.length; i++){
            String stringAddress = String.valueOf(array[i]);
            StringBuilder buildIp = new StringBuilder(stringAddress);
            if(array[i]>100099){
                array[i] = 1000100;
                buildIp.insert(2,".");
                buildIp.insert(4,".");
                buildIp.insert(5,"0");
                buildIp.insert(6,".");
                mountedIP = String.valueOf(buildIp);
                formatedIp[i] = mountedIP;
            } else {
                buildIp.insert(2,".");
                buildIp.insert(4,".");
                buildIp.insert(6,".");
                mountedIP = String.valueOf(buildIp);
                formatedIp[i] = mountedIP;
            }
        }
        return formatedIp;
    }

    public static boolean SearchAddress (String ip, int searchMaxTime) {
        try {
                InetAddress address = InetAddress.getByName(ip);
                return address.isReachable(searchMaxTime);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}



