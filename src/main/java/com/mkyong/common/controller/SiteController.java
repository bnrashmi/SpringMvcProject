package com.mkyong.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkyong.common.controller.model.Friend;
import com.mkyong.common.controller.service.SiteService;

@Controller
@RequestMapping("/site")
public class SiteController {
	
	@Autowired
	private SiteService siteService;
	
	@RequestMapping(value ="/listOfSiteName" , method = RequestMethod.GET)
	public String getListOfSiteNames(ModelMap model) {
		
		Friend friend = siteService.getListOfSiteNames();
		model.addAttribute("friend", friend);
		
		return "sitelist";
	}
	
	/*@RequestMapping(value="/displayFriendPage", method= RequestMethod.GET)
	public String displayFriendPage(ModelMap model) {
		Friend friend = new Friend();
		
		model.addAttribute("friend",friend);
		
		return "displayFriendPage";
	}
	
	@RequestMapping(value="/addFriendPage", method= RequestMethod.POST)
	public String addFriendPage(@ModelAttribute Friend friend) {
		
		System.out.println("First Name:" +friend.getFirstName());
		System.out.println("First Name:" +friend.getFirstName());
		
		return "displayFriendPage";
	}*/

}
