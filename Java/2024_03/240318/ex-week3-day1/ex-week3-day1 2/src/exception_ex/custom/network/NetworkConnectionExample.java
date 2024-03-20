package exception_ex.custom.network;

public class NetworkConnectionExample {
	public static void main(String[] args) {
		try {
			connectToNetwork("wifi");
		} catch (NetworkConnectionException e) {
			System.out.println(e.getMessage());
		}
	}

	static void connectToNetwork(String networkType) throws NetworkConnectionException {
		// 네트워크 연결 로직 (여기서는 예시를 위한 가상 코드)
		boolean connectionFailed = true; // 연결 실패 상황을 가정
		if (connectionFailed) {
			throw new NetworkConnectionException(networkType + " 네트워크에 연결할 수 없습니다.");
		}
		System.out.println(networkType + " 네트워크에 연결되었습니다.");
	}
}
