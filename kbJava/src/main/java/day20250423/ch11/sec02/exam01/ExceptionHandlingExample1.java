package day20250423.ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수: " + result);
    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }
}

// 이 코드의 문제점
// printLength(null) 호출 -> data가 null이므로 data.length()에서 NullPointerException  발생
// 예외가 발생하면 이후 코드는 실행되지 않고, 프로그램은 비정상 종료됨

//실행 결과
//        /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=62979:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/kimtaeyoung/Desktop/java스터디/javaStudy/kbJava/out/production/kbJava day20250423.ch11.sec02.exam01.ExceptionHandlingExample
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "data" is null
//at day20250423.ch11.sec02.exam01.ExceptionHandlingExample.printLength(ExceptionHandlingExample.java:5)
//at day20250423.ch11.sec02.exam01.ExceptionHandlingExample.main(ExceptionHandlingExample.java:11)
//[프로그램 시작]
//
//문자 수: 10
