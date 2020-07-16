package application;

public class Weather {

    String stationName;
    int year;
    int month;
    float tmax;
    float tmin;
    int af;
    float rain;
    public Weather() {
	super();
	// TODO Auto-generated constructor stub
    }
    public Weather(String stationName, int year, int month, float tmax, float tmin, int af, float rain) {
	super();
	this.stationName = stationName;
	this.year = year;
	this.month = month;
	this.tmax = tmax;
	this.tmin = tmin;
	this.af = af;
	this.rain = rain;
    }
    public String getStationName() {
        return stationName;
    }
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public float getTmax() {
        return tmax;
    }
    public void setTmax(float tmax) {
        this.tmax = tmax;
    }
    public float getTmin() {
        return tmin;
    }
    public void setTmin(float tmin) {
        this.tmin = tmin;
    }
    public int getAf() {
        return af;
    }
    public void setAf(int af) {
        this.af = af;
    }
    public float getRain() {
        return rain;
    }
    public void setRain(float rain) {
        this.rain = rain;
    }
    @Override
    public String toString() {
	return "Weather [stationName=" + stationName + ", year=" + year + ", month=" + month + ", tmax=" + tmax
		+ ", tmin=" + tmin + ", af=" + af + ", rain=" + rain + "]";
    }

    
}
