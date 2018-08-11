package com.project.bean;

import java.io.Serializable;

/*************************************************************
 * Author:		Shanmuganathan.N
 * Name:		CommonCode.java
 * Date:		18-Apr-2015 7:35:31 PM
 * Description:	This holds all the details which are common 
 * 				to the project.
 **************************************************************/

public class CommonCode implements Serializable{

	public String goToRed(){
		return ("red.xhtml?faces-redirect=true");
	}
	
	public String goToBlue(){
		return ("blue.xhtml?faces-redirect=true");
	}
}
