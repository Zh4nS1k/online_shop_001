import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Product laptop() {
        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setPrice(999.99);
        return laptop;
    }

    @Bean
    public Product smartphone() {
        Product smartphone = new Product();
        smartphone.setName("Smartphone");
        smartphone.setPrice(499.99);
        return smartphone;
    }

    // Define more beans as needed...
}
