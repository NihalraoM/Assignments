package mvc.Q1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Q1 {
	
	@RequestMapping(value= "/greet")
	public ModelAndView helloWorld() {
		ModelAndView mav= new ModelAndView("Quest1/Hello");
		mav.addObject("msg", "Hello World");
		return mav;
	}

}
