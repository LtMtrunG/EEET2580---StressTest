package eeet2580.stress_test_4.service;

import org.springframework.stereotype.Service;

import eeet2580.stress_test_4.user_profile.UserProfile;

@Service
public class UserService {
    public String showProfileAsStr(String userId) {
        return String.format(
        """
        ID: %s
        Name: %s
        Balance: %d
        """, 
        "1", "Trung", 3
        );
    }

    public UserProfile showProfileAsObj(String userId) {
        return new UserProfile("Trung", "1", 3);
    }
}
