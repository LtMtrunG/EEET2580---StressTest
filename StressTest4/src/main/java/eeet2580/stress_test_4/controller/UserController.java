package eeet2580.stress_test_4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eeet2580.stress_test_4.service.UserService;
import eeet2580.stress_test_4.user_profile.UserProfile;

@RestController
@RequestMapping("/{userID}")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/string")
    public String getUserAsString(@PathVariable("userID") String userID) {
        return userService.showProfileAsStr(userID);
    }
    
    @GetMapping("/object")
    public UserProfile getUserAsObject(@PathVariable("userID") String userID) {
        return userService.showProfileAsObj(userID);
    }
}
