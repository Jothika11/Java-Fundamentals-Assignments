
public class Assignment_day2 {
	public static void main(String[] args) {
		float height_Output,weight_Output;
		
		height_Output= heightConvertor(5,11);
		System.out.println("Height in cm:"+height_Output);
		
		weight_Output=weightConvertor(60);
		System.out.println("Weight in pounds:"+weight_Output);
	}
	
			static float heightConvertor(int heightFeetPart, int heightInchPart){
				float height=(float)(((heightFeetPart*12)+heightInchPart)*2.54);
				return(height);
			}
		    
			static float weightConvertor(int weight){
				float weightS=(float)(weight*2.2);
				return(weightS);
		
	}

}
