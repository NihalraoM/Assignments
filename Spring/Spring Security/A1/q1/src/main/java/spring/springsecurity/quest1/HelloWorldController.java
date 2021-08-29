package springsecurity.A1.q1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value="/hello")
	public String hello() {
		return "<h1>Hello World</h1>";
	}
}
