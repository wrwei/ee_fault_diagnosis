package cnsa.ee.digital.twin.design.com.net;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerVS {
	static DataInputStream dis = null;
	public static void main(String[] args){
		ServerVS server = new ServerVS();
//		server.run("8888");
		server.runTest("12345");
	}
	public void runTest(String port) {
		try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port)); // �������󶨵��˿� 12345
            System.out.println("Java���������ڼ����˿�...");

            // �ȴ��ͻ�������
            Socket clientSocket = serverSocket.accept();
            System.out.println("�ͻ������ӳɹ�");

            // ��ȡ�������������
            InputStream inputStream = clientSocket.getInputStream();
            OutputStream outputStream = clientSocket.getOutputStream();

            // �ӿͻ��˽�������
            byte[] buffer = new byte[1024];
            int bytesRead;
            bytesRead = inputStream.read(buffer);
            String receivedData = new String(buffer, 0, bytesRead);
            System.out.println("�ӿͻ��˽��յ�����: " + receivedData);

            // ������Ӧ���ͻ���
            String response = "Hello from Java Server";
            outputStream.write(response.getBytes());
            outputStream.flush();

            // �ر�����
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	public void run (String port) {
		Socket socket = null;
		ServerSocket server = null;
		try{
			server = new ServerSocket(Integer.parseInt(port));
			boolean listening = true;
			while(listening){
				try{
					System.out.println("��ʼ�������˿ںţ�"+port);
					socket = server.accept();
					dis = new DataInputStream(socket.getInputStream());
					while(listening){
					    String str = dis.readUTF();
					    System.out.println("�յ����ݣ�"+str);
					    if (str.equals("q")) {
					    	if(dis != null)
								dis.close();
							if(socket != null)
								socket.close();
							System.out.println("��⵽�ͻ��˹رա�");
							listening = false;
					    }
					}
				} catch (EOFException e) {
					System.out.println("��⵽�ͻ��˹رա�");
				} catch (IOException e) {
					e.printStackTrace();
					listening = false;
				} finally {
					try{
						if(dis != null)
							dis.close();
						if(socket != null)
							socket.close();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		} catch (BindException e){
			System.out.println(port + "�˿ڲ����ڡ�");
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}

