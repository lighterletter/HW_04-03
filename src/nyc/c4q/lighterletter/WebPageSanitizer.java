package nyc.c4q.lighterletter;


import java.net.URL;

/**
 * Created by c4q-john on 3/30/15.
 *
 */
public class WebPageSanitizer {


     //Will receive a string and return a string.
     static String sanitize(String html){
         //Convert string into website format.
         URL site = HTTP.stringToURL(html);
         //Needed url to convert website info into string.
         String siteString = HTTP.get(site);

         //I now have a string of HTML code.
         //'while loop' searches through HTML code for <script>.
         //If index of <script returns -1, break.
         while (siteString.indexOf("<script") != -1){

             //Selects the first char of <script
             int starts = siteString.indexOf("<script");
             //Selects up to the last char of </script>
             int ends = siteString.indexOf("</script>",starts)+8;
             //IndexOf helps define the substring.

             //Initializes cleanScript as substring in order to replace it
             //using variables 'start' & 'end'.
             String cleanScript = siteString.substring(starts,ends);

             //replaces cleanScript with empty string during each iteration.
             //Updates siteString with a cleaner version each time.
             siteString = siteString.replace(cleanScript, "");

         }

         return siteString;

     }
    public static void main(String [] args){
        //Prints out result of website. Like magic.
        System.out.println(sanitize("http://www.google.com"));

    }

}
