// Address Types
// 1. Any Local Address:
// isAnyLocalAddress();
// LocalHost: 0.0.0.0-> Wildcard address

// 2. Loopback Address
// LocalHost: 127.0.0.1

// 3. Link Local Address(Yo private network vanda bahira jadaina)
// Ipv6: FE80.0000.0000:0000

//4.Site Local Address(Yo public hunxa mobile ma pani herna milxa)
// LocalHost: 10.0.0.0 - 10.255.255.255
// 172.16.0.0 - 172.31.255.255
// 192.168.0.0 - 192.168.255.255

//Any Local Address:
// import java.net.InetAddress;
// import java.net.UnknownHostException;

// public class InetAddressTypes {
//     public static void main(String[] args) {
//         try {
//             // InetAddress address = InetAddress.getByName("Www.google.com"); //Yesle false falxa
//              InetAddress address = InetAddress.getByName("0.0.0.0"); //Yesle true falxa

//             System.out.println("Host Address: " + address.getHostAddress());
//             System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }

//LoppbackAddress
// import java.net.InetAddress;
// import java.net.UnknownHostException;

// public class InetAddressTypes {
//     public static void main(String[] args) {
//         try {
//             // InetAddress address = InetAddress.getByName("www.google.com");// yesle false
//             InetAddress address = InetAddress.getByName("127.0.0.1");// Yesle true falxa

//             System.out.println("Host Address: " + address.getHostAddress());
//             System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
//             System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }

//Link Local Address
// import java.net.InetAddress;
// import java.net.UnknownHostException;

// public class InetAddressTypes {
//     public static void main(String[] args) {
//         try {

//             InetAddress address = InetAddress.getByName("169.254.0.1"); // This is IPv6 Link Local address

//             System.out.println("Host Address: " + address.getHostAddress());
//             System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
//             System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
//             System.out.println("Is Link Local Address? " + address.isLinkLocalAddress());
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }

//Site Local Address
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTypes {
    public static void main(String[] args) {
        try {

            InetAddress address = InetAddress.getByName("10.0.0.0");

            System.out.println("Host Address: " + address.getHostAddress());
            System.out.println("Is Any Local Address? " + address.isAnyLocalAddress());
            System.out.println("Is Loopback Address? " + address.isLoopbackAddress());
            System.out.println("Is Site Local Address? " + address.isSiteLocalAddress());
            System.out.println("isMulticastAddress: " + address.isMulticastAddress());
            System.out.println("isMulticastGlobal: " + address.isMulticastGlobal());
            System.out.println("isMulticastOrgLocal: " + address.isMulticastOrgLocal());
            System.out.println("isMulticastSiteLocal: " + address.isMulticastSiteLocal());
            System.out.println("isMulticastLinkLocal: " + address.isMulticastLinkLocal());
            System.out.println("isMulticastNodeLocal: " + address.isMulticastNodeLocal());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

// isMulticastAddress()
// isMulticastGlobal()
// isMulticastOrgLocal()
// isMulticastSiteLocal()
// isMulticastLinkLocal()
// isMulticastNodeLocal() (yesma ipv6 matra use hunxa)