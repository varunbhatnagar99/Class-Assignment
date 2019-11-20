import java.util.Stack;
import java.util.Scanner;

public class PartA {

    private static Stack<String> history = new Stack<String>();

    public static Boolean isBrowsingHistoryEmpty() {
      return history.empty();
        // Add CODE BELOW
    }

    public static String mostRecentlyVisitedSite() {
      return history.peek();
        // Add CODE BELOW
    }

    public static void addSiteToHistory(String url) {
      history.push(url);
        // Add CODE BELOW
    }

    public static void goBackInTime(int n) {
      if(n>1&&n<history.size()&&!(isBrowsingHistoryEmpty()))
      {
        for(int i=0;i<n;i++)
        history.pop();
      }
        // Add CODE BELOW
    }

    public static void printBrowsingHistory() {
      if(history.empty())
      System.out.println("no browsing history");
      else
      while(!history.empty())
      {
        System.out.println(history.pop());
      }
        // Add CODE BELOW
    }

    public static void main(String[] args) {
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        addSiteToHistory("www.google.co.in"); // Navigating to Google
        addSiteToHistory("www.facebook.com"); // Navigating to Facebook
        addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
        System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
        addSiteToHistory("www.youtube.com"); // Navigating to Youtube
        goBackInTime(2); // Going back by 2 sites
        addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
        System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
        printBrowsingHistory(); // Printing browsing history

    }

}