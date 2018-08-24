package teemak;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {	
	//show form -- renders helloworld-form.jsp
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process form -- renders helloworld.jsp
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		//GET data
		String theName = request.getParameter("studentName");
		//CONVERT data
		//theName = theName.toUpperCase();
		
		//CREATE message
		String message = "Hello, Mr. " + theName + ".";
		//ADD message
		model.addAttribute("data",  message.toUpperCase());
		return "helloworld";
	}
}
