package pk13;

public class HttpServletExample {

	public static void httpService(HttpServlet httpservlet) {
		httpservlet.service();
	}
	
	public static void main(String[] args) {
		
		//HttpServletExample ht = new HttpServletExample();
		//생략가능 : 메서드에 매개변수로 객체가 설정되어 있어서 
		httpService(new LoginServlet());
		httpService(new FileDownloadServlet());
	}

}
