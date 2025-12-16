public class Test {
       public static void main(String[] args) {
           System.out.println("Hello from Jenkins!");
           System.out.println("Build Number: " + System.getenv("BUILD_NUMBER"));
           System.out.println("Job Name: " + System.getenv("JOB_NAME"));
       }
   }