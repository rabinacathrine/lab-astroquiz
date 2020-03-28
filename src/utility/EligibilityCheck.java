package utility;

import model.User;

public class EligibilityCheck extends BasicEligibility implements EligibilityInterface{

	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		int age =user.getAge();
		 int height =user.getHeight() ;
		 int weight=user.getWeight();
	     String country=user.getCountry();
	     
		if((18 <= age && age<= 35)&&(155 <=height&&height<=170)&&(55<= weight&&weight<= 90)&&(country.equals("ProGrad")) )
			return true;
				return false;
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		// TODO Auto-generated method stub
		int score=Integer.parseInt(points);
		if(score>50)
			return true;
		return false;
	}

	@Override
	public boolean basicEligibilityCheck(User user) {
		// TODO Auto-generated method stub
		if(checkUser(user))
			return true;
		
		return false;
	}
	
}







