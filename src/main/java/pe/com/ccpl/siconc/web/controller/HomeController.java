package pe.com.ccpl.siconc.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)  
	public ModelAndView printWelcome(ModelMap model,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
        mav.addObject("message", "Jesus is alive!"); 
        mav.setViewName("/home");
        return mav; 
    }  
	
	@RequestMapping(value = "/home2", method = RequestMethod.GET)  
	public ModelAndView home2(ModelMap model,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
        mav.addObject("message", "Jesus is risen!"); 
        mav.setViewName("/security/home");
        return mav; 
    }  
}
