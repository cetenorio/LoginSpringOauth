package hello;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String login() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println(auth.getPrincipal());
        return "/index";
    }
    
    @RequestMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
    
}
