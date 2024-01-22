import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ValorantRegistrationController {

    @GetMapping("/registration")
    public String showRegistrationForm() {
        return "registration-form";
    }

    @PostMapping("/registration")
    public String processRegistrationForm(@RequestParam("gameID") String gameID,
                                          @RequestParam("inGameName") String inGameName,
                                          @RequestParam("clanName") String clanName,
                                          @RequestParam("residence") String residence,
                                          @RequestParam("experienceLevel") String experienceLevel,
                                          Model model) {
        // Process the registration details and store them in a database or send them via email
        // ...

        // Add the registration details to the model so they can be displayed on the confirmation page
        model.addAttribute("gameID", gameID);
        model.addAttribute("inGameName", inGameName);
        model.addAttribute("clanName", clanName);
        model.addAttribute("residence", residence);
        model.addAttribute("experienceLevel", experienceLevel);

        // Return the name of the confirmation page
        return "registration-confirmation";
    }
}
