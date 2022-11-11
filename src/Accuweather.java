import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Accuweather {


    public static void main (String[] args) throws IOException {

        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/288674?apikey=uFtKP7BgIkvuAoJJofAErlYWKOGBUbgm").openConnection();
        System.out.println(httpURLConnection.getResponseCode());
        System.out.println(httpURLConnection.getRequestMethod());
        System.out.println(httpURLConnection.getResponseMessage());

        try (InputStream inputStream = httpURLConnection.getInputStream();){
            int c;
            while ((c = inputStream.read())!=-1){
                System.out.print((char) c);
            }
        }
    }
}