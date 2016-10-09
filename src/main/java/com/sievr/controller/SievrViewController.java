package com.sievr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SievrViewController {

	@RequestMapping("/result")
	public String result(){
		return "results";
	}
}
