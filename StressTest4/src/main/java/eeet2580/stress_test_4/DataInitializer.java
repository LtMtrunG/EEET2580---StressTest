package eeet2580.stress_test_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eeet2580.stress_test_4.user_profile.UserProfile;

@Configuration
public class DataInitializer {

    @Bean
    public ApplicationRunner initializer() {
        return args -> {
            // List<UserProfile> hardcodedNumbers = Arrays.asList(UserProfile("Trung", "1", "100"));
            List<UserProfile> hardcodedUser = List.of(new UserProfile("Trung", "1", 100));
        };
    }
}
