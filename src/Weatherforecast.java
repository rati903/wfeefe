public class Weatherforecast {
    private String cityName;
    private double windSpeed;
    private double rainPercentage;
    private boolean isSunny;


    public Weatherforecast(String cityName, double windSpeed, double rainPercentage, boolean isSunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.isSunny = isSunny;
    }


    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(double rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }


    public void displayForecast() {
        String weather = isSunny ? "Sunny" : "Cloudy";
        System.out.println("City: " + cityName);
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Rain Percentage: " + rainPercentage + "%");
        System.out.println("Weather: " + weather);
    }


    public boolean recommendWalk() {
        if (isSunny && rainPercentage < 25 && windSpeed < 25) {
            return true;
        } else {
            return false;
        }
    }


}
