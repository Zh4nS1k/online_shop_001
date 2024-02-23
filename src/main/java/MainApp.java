import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            // Get the beans
            Product laptop = context.getBean("laptop", Product.class);
            Product smartphone = context.getBean("smartphone", Product.class);

            // Use the beans
            System.out.println("Laptop: " + laptop);
            System.out.println("Smartphone: " + smartphone);
        }
    }
}
