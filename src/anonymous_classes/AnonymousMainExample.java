package anonymous_classes;

public class AnonymousMainExample {
    public static void main(String[] args) {

        HttpExecutor executor = new HttpExecutor() {
            public String executorRequest() {
                return "Siandien sviecia saule";
            }
        };
        System.out.println(executor.executorRequest());
    }
}
