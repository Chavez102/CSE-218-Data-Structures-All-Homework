package airport_Operation;

public class Flight 
{
	int Flight_num;
	String Airline_Name;
	int Landing_Priority_level;
	double Time_Stamp;
	public Flight(int landing_Priority_level, String time_Stamp,String Airline_Name,int Flight_num) 
	{
		this.Airline_Name=Airline_Name;
		this.Flight_num=Flight_num;
		this.Landing_Priority_level = landing_Priority_level;
		Time_Stamp = convert_StringStamp_to_double(time_Stamp);
	}
	
	public double convert_StringStamp_to_double(String arrivaltime)
	{
		
		String[] time=arrivaltime.split(":");
		
		int minutes=Integer.parseInt(time[0]);			//takes minutes only 
		double seconds=Double.parseDouble(time[1])/100;	//makes seconds into decimal 
		double Integer_time=minutes+seconds;	//int+decimal=int.decimnal
		return Integer_time;
	}

	public int getFlight_num() {
		return Flight_num;
	}
	public void setFlight_num(int flight_num) {
		Flight_num = flight_num;
	}
	public String getAirline_Name() {
		return Airline_Name;
	}
	public void setAirline_Name(String airline_Name) {
		Airline_Name = airline_Name;
	}
	public int getLanding_Priority_level() {
		return Landing_Priority_level;
	}
	public void setLanding_Priority_level(int landing_Priority_level) {
		Landing_Priority_level = landing_Priority_level;
	}
	public double getTime_Stamp() {
		return Time_Stamp;
	}
	public void setTime_Stamp(int time_Stamp) {
		Time_Stamp = time_Stamp;
	}

}
