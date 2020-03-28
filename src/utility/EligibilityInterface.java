package utility;

import model.User;

//import model.User;

interface EligibilityInterface{
	public boolean checkUser (User user);
	public boolean checkQuizAnswer (String points);
}