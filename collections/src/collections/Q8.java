package collections;
import java.util.*;
class Country {
    private HashSet<String> H1;

    Country() {
        H1 = new HashSet<>(); 
    }
    public HashSet<String> saveCountryNames(String CountryName) {
        H1.add(CountryName);
        return H1;
    }
    public String getCountry(String CountryName) {
        if (H1.contains(CountryName)) {
            return CountryName;
        }
        return null;
    }
}
public class Q8 {
    public static void main(String[] args) {
        Country cc = new Country();

        cc.saveCountryNames("India");
        cc.saveCountryNames("America");

        System.out.println("Search for 'India': " + cc.getCountry("India"));  
        System.out.println("Search for 'Japan': " + cc.getCountry("Japan"));   
    }
}
