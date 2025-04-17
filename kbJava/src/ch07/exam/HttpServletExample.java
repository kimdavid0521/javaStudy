package ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());     // 로그인합니다.
        method(new FileDownloadServlet()); // 파일다운로드합니다.
    }
    public static void method(HttpServlet httpServlet) {
        httpServlet.service();
    }
}
