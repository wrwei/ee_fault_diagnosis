package cnsa.ee.digital.twin.design.com.net;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class ServerUDP {

    public static void main(String[] args) {
        // ָ��UDP�������˿�
        int serverPort = 9999;

        try {
            // ����DatagramSocket���󲢰󶨵�ָ���˿�
            DatagramSocket serverSocket = new DatagramSocket(serverPort);
//            System.out.println("UDP�������������ȴ���Ϣ...");
            // ����һ���ֽ��������ڽ�������
            byte[] receiveData = new byte[1024];
            while (true) {
                // ����DatagramPacket�������ڽ�������
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                // ��������
                serverSocket.receive(receivePacket);
                // ��DatagramPacket�л�ȡ���յ������ݺͷ��ͷ�����Ϣ
                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("�յ���Ϣ: " + receivedMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
