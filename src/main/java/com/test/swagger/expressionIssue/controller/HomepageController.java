package com.test.swagger.expressionIssue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class HomepageController {
	@ApiOperation(value="The home page. Split character is ${splitChar}", 
			notes="Notes - The home page. Split character is ${splitChar}")
	@GetMapping(value={"/"})
	public String homepage() {
		return "<html><body>Home page .... <br/>Swagger URL: <a href='/swagger-ui.html'>Click here</a></body</html>";
	}
	
	@ApiOperation(value="${splitChar} - The home page. ", 
			notes="${splitChar} - Notes")
	@GetMapping(value={"/test"})
	public String testPage() {
		return "<html><body>Home page .... <br/>Swagger URL: <a href='/swagger-ui.html'>Click here</a></body</html>";
	}
	
}