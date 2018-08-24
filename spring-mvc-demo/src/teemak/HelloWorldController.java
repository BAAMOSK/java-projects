package teemak;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {	
	//show form -- renders helloworld-form.jsp
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
}
