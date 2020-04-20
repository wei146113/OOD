
public class temperature {
	
	//private String C ;
	//private String F ;
	private float tem;
	private String chac;
	
public temperature(float temp) {    
	this.tem=tem;
	chac="C";	
}

public temperature(float tem, String chac){
	this.tem=tem;
	this.chac=chac;
	
}
public temperature(String chac){
	this.chac =chac;
	tem=0;
}

public temperature(){
	tem=0;
	chac="C";
	
}

public float getdegreesC() {
	
	return 5*(tem-32)/9;
}

public float getdegreesF() {
	
	return (9*(tem/5))+32;
}

public void setTemperature(float tem){
	this.tem=tem;
	
}
public void setChac(String chac){
	
	this.chac=chac;
	
}
	
public void setTemChac(float tem,String chac){
	this.tem=tem;
	this.chac=chac;
}

	

public boolean equals(temperature othertemperature){
	

	if (chac == othertemperature.chac){
		if (tem == othertemperature.tem){
			    return true;
			}
		
		else {
			    return false;
			}
		}
	
		
	if (chac == "C"&& othertemperature.chac == "F" ){
		
	
		if (9*(tem/5)+32 == othertemperature.tem){
			
			    return true;
			
			}
		else {
			     return false;
			}
		}
	
	if (chac == "F"&& othertemperature.chac == "C" ){
		
	
			if (5*(tem-32)/9 == othertemperature.tem){
				
				return true;
				
			}
			else {
				return false;}
			}
	else return false;
	}
public boolean more(temperature othertemperature){
	

	if (chac == othertemperature.chac){
		if (tem > othertemperature.tem){
			    return true;
			}
		
		else {
			    return false;
			}
		}
	
		
	if (chac == "C"&& othertemperature.chac == "F" ){
		
	
		if (9*(tem/5)+32 > othertemperature.tem){
			
			    return true;
			
			}
		else {
			     return false;
			}
		}
	
	if (chac == "F"&& othertemperature.chac == "C" ){
		
	
			if (5*(tem-32)/9 > othertemperature.tem){
				
				return true;
				
			}
			else {
				return false;}
			}
	else return false;
	}
public boolean less(temperature othertemperature){
	

	if (chac == othertemperature.chac){
		if (tem < othertemperature.tem){
			    return true;
			}
		
		else {
			    return false;
			}
		}
	
		
	if (chac == "C"&& othertemperature.chac == "F" ){
		
	
		if (9*(tem/5)+32 < othertemperature.tem){
			
			    return true;
			
			}
		else {
			     return false;
			}
		}
	
	if (chac == "F"&& othertemperature.chac == "C" ){
		
	
			if (5*(tem-32)/9 < othertemperature.tem){
				
				return true;
				
			}
			else {
				return false;}
			}
	else return false;
	}

}			
			
		
	 	
	


	


