import java.util.ArrayList;

/**
 * Created by simonyan_51 on 09.04.2017.
 */
public class Country {
    private int id;
    private String countryCode;
    private String englishName;
    private String franchName;
    private TimeZone timeZone;

    public Country(int id, String countryCode, String englishName, String franchName) {
        this.id = id;
        this.countryCode = countryCode;
        this.englishName = englishName;
        this.franchName = franchName;
    }

    public TimeZone getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(TimeZone timeZone) {
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

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getFranchName() {
        return franchName;
    }

    public void setFranchName(String franchName) {
        this.franchName = franchName;
    }
}
