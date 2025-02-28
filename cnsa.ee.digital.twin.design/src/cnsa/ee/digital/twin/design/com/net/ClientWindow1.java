package cnsa.ee.digital.twin.design.com.net;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;

public class ClientWindow1 extends Frame{
	private static final long serialVersionUID = 5785073717134119223L;
	Socket socket = null;
	DataOutputStream dos = null;
	TextField tf = new TextField(40);
	List list = new List(10);
	String port = "8001";
//	String port = "5555";

	public static void main(String[] args){		
		ClientWindow1 client = new ClientWindow1();
		client.connect();
		client.createClientWindow();
		client.listen();
	}
	
	public void createClientWindow() {
		this.setLocation(400, 300);
		this.setSize(300, 300);
		this.list.add("��DTϵͳ�˷��͵�����:");
		this.setTitle("ģ�⴫����1");
		this.add(this.list, BorderLayout.NORTH);
		this.add(this.tf, BorderLayout.SOUTH);
		this.pack();
		this.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					disconnect();
					System.exit(0);
					}
				}
			);
		this.setVisible(true);
	}
	
	public void connect(){
		try{
			socket = new Socket("127.0.0.1", Integer.parseInt(port));
			dos = new DataOutputStream(socket.getOutputStream());
			System.out.println("���ӳɹ�");
		} catch (UnknownHostException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	public void disconnect(){
		try{
			dos.close();
			socket.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
	public void listen() {
		tf.addActionListener(new MyListener());
	}
	
	private class MyListener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
		    String str = tf.getText().trim();
		    list.add(str);
		    tf.setText("");
		    try{
		    	dos.writeUTF(str);
		    	dos.flush();
//		    	ServerSocket server = new ServerSocket(Integer.parseInt(port));
//				socket = server.accept();
//				DataInputStream dis = new DataInputStream(socket.getInputStream());
//				String str2 = dis.readUTF();
//			    System.out.println("�յ����ݣ�"+str2);
		    } catch (IOException e1){
		       e1.printStackTrace();  
		    }
		    if (str.equals("0") | str.equals("q")) {
		    	System.out.println("�������");
		    	disconnect();
		    	System.exit(0);
		    }
		    else if (str.equals("s")) {
		    	sendRegularly();
		    }
	    }
	}

	private void sendRegularly() {
		for (int i = 1; i <= 10; i++) {
	        try {
	            Thread.sleep(2200);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		    try{
		    	String str = String.valueOf(i*3.14159);
		    	list.add(str);
			    tf.setText("");
		    	dos.writeUTF(str);
		    	dos.flush();
		    } catch (IOException e1){
		       e1.printStackTrace();  
		    }
		}
	}
}


