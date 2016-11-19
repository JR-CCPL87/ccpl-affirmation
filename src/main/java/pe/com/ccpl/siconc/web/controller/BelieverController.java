package pe.com.ccpl.siconc.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pe.com.ccpl.siconc.web.form.AddBelieverForm;
import pe.com.ccpl.siconc.web.model.Believer;
import pe.com.ccpl.siconc.web.model.Network;
import pe.com.ccpl.siconc.web.model.Profile;
import pe.com.ccpl.siconc.web.service.BelieverService;

@Controller
@RequestMapping(value="/nb")
public class BelieverController {

	@Autowired
	private BelieverService believerService;
	
	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)  
	public ModelAndView printWelcome(ModelMap model,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
		List<Believer> believers=new ArrayList<Believer>();
		believers=believerService.getBelievers();
        mav.addObject("believerList", believers); 
        mav.setViewName("/nb/dashboard");
        return mav; 
    }
	
	@RequestMapping(value = "/findBelievers", method = RequestMethod.POST)  
	public ModelAndView findBelievers(ModelMap model,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
		List<Believer> believers=new ArrayList<Believer>();
		believers=believerService.getBelievers();
        mav.addObject("believerList", believers); 
        mav.setViewName("/nb/dashboard");
        return mav; 
    }
	
	@RequestMapping(value = "/addBeliever", method = RequestMethod.GET)  
	public ModelAndView addBeliever(ModelMap model,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("believer", new AddBelieverForm());
        mav.setViewName("/nb/addBeliever");
        return mav; 
    }
	
	@RequestMapping(value = "/saveBeliever", method = RequestMethod.POST)  
	public ModelAndView saveBeliever(AddBelieverForm believerForm,ModelMap model,HttpServletRequest request) {
		ModelAndView mav=new ModelAndView();
		Believer believer=new Believer();
		believer.setUsername(believerForm.getTxtName());
		believer.setPassword("password");
		believer.setNames(believerForm.getTxtName());
		believer.setFatherName(believerForm.getTxtFatherName());
		believer.setMotherName(believerForm.getTxtMotherName());
		Profile profile=new Profile();
		profile.setProfileId(1);
		believer.setProfile(profile);
		believer.setType(0);
		believer.setBirthDate("1987-07-12");
		believer.setChildrenInfo(believerForm.getTxtChildrenInfo());
		believer.setAddress("CALLE LITUMA PORTOCARRERO 139");
		believer.setHomePhone("");
		Network network=new Network();
		network.setNetworkId(3);
		believer.setNetwork(network);
		believerService.saveBeliever(believer);
		
		List<Believer> believers=new ArrayList<Believer>();
		believers=believerService.getBelievers();
        mav.addObject("believerList", believers); 
        mav.setViewName("/nb/dashboard");
        return mav; 
    }
	
}
