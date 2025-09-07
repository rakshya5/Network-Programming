import java.net.InetAddress;

public class InetAddressGetterMethod {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.example.com");

            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            System.out.println("IP Address (byte[]): " + address.getAddress());
            System.out.println("Host Address: " + address.getHostAddress());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// DNS Host Name chaiyo vane CanonicalHostName use garne
// InetAddress ley unknown host exception falxa
