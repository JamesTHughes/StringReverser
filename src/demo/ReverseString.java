package demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
/**
 * JSF Bean that stores a string and returns the reversed form of the string
 */
public class ReverseString {
    private String stringToReverse = "";

    // no arg constructor, per JSF bean requirements
    public ReverseString() {}

    public String getStringToReverse() {
        return stringToReverse;
    }

    public void setStringToReverse(String s) {
        this.stringToReverse = s;
    }

    /**
     * Reverses the stored string and returns it
     * @return reversed stored string
     */
    public String getReverseString() {
        return new StringBuilder(stringToReverse).reverse().toString();
    }
}
