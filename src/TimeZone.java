/**
 * Created by simonyan_51 on 09.04.2017.
 */
public class TimeZone {
    private int id;
    private String countryCode;
    private String timeZone;

    public TimeZone(int id, String countryCode, String timeZone) {
        this.id = id;
        this.countryCode = countryCode;
        this.timeZone = timeZone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }
}
