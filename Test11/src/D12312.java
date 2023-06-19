public class D12312<Socket> {

	public void client(port) {
		int port = 3000;
		String serverIP;
		try {
			serverIP= InetAddress.getLocalHost().getHostAddress();
			
			Socket socket = new Socket(serverIP,(int) port);
		}
	}
}
}
