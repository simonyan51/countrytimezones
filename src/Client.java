import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

/**
 * Created by simonyan_51 on 09.04.2017.
 *
 * TimeZone ery chi chanachum null pointer exception a gcum
 */
public class Client {

    private ArrayList<TimeZone> timeZones;
    private ArrayList<Country> countries;

    public Client() {
        timeZones = new ArrayList<TimeZone>();
        countries = new ArrayList<Country>();
    }

    public void start() throws IOException {
        readCountries("C:\\Users\\simonyan_51\\IdeaProjects\\com.example.countriestimezones\\src\\countries.csv");
        readTimeZones("C:\\Users\\simonyan_51\\IdeaProjects\\com.example.countriestimezones\\src\\zone.csv");
        setCountriesTimeZones();

        for(Country country : countries) {
            StringBuilder str = new StringBuilder();
            str.append(country.getId()).append(", ").append(country.getCountryCode())
                    .append(", ").append(country.getEnglishName()).append(", ").append(country.getTimeZone().getTimeZone());

            System.out.println(str);
        }

        createNewFile("C:\\Users\\simonyan_51\\IdeaProjects\\com.example.countriestimezones\\src\\countriestimezones.csv");
    }

    private void readCountries(String src) throws IOException {
        FileReader file = new FileReader(src);
        BufferedReader read = new BufferedReader(file);
        String line;
        int id = 0;
        while((line = read.readLine()) != null) {
            String[] fileAttr = line.replace("\"", "").split(",");
            Country country = new Country(++id, fileAttr[0].trim(), fileAttr[1].trim(), fileAttr[2].trim());
            countries.add(country);
        }
    }

    private void readTimeZones(String src) throws IOException {
        FileReader file = new FileReader(src);
        BufferedReader read = new BufferedReader(file);
        String line;
        int id = 0;
        while((line = read.readLine()) != null) {
            String[] fileAttr = line.replace("\"", "").split(",");
            TimeZone timeZone = new TimeZone(Integer.parseInt(fileAttr[0].trim()), fileAttr[1].trim(), fileAttr[2].trim());
            timeZones.add(timeZone);
        }
    }

    private void setCountriesTimeZones() {
        for (Country country : countries) {
            for (TimeZone timeZone : timeZones) {
                if (country.getCountryCode().equals(timeZone.getCountryCode())) {
                    country.setTimeZone(timeZone);
                }
            }
        }
    }

    private void createNewFile(String src) throws IOException {
        PrintWriter file = new PrintWriter(src);
        for (Country country : countries) {
            file.println(country.getId() + ", " +
                         country.getCountryCode() + ", " +
                         country.getEnglishName() + ", " +
                         country.getTimeZone().getTimeZone());
        }
        file.close();
    }
}
