package pk13;

public class HttpServletExample {

	public static void httpService(HttpServlet httpservlet) {
		httpservlet.service();
	}
	
	public static void main(String[] args) {
		
		//HttpServletExample ht = new HttpServletExample();
		//�������� : �޼��忡 �Ű������� ��ü�� �����Ǿ� �־ 
		httpService(new LoginServlet());
		httpService(new FileDownloadServlet());
	}

}
