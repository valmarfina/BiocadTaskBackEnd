package marfina.lera.BiocadTaskBackEnd.jsonReaderTool;

import marfina.lera.BiocadTaskBackEnd.BiocadTaskBackEndApplication;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonReaderHelper {
    public static String  JsonHelperReturnConway() throws IOException, ParseException {
        InputStream in = BiocadTaskBackEndApplication.class.getResourceAsStream("/data.json");
        assert in != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(reader);
        JSONArray a = new JSONArray();
        a.add(obj);

        String conwayStr = " ";

        for (Object o : a) {
            JSONObject sequense = (JSONObject) o;
            JSONArray ConwayList = (JSONArray) sequense.get("Conway");

            for (int i = 0; i < ConwayList.size(); i++) {
                conwayStr = conwayStr + ConwayList.get(i) + " ";
            }


        }
        return conwayStr;
    }

    public static String JsonHelperReturnFibonacci() throws IOException, ParseException {
        InputStream in = BiocadTaskBackEndApplication.class.getResourceAsStream("/data.json");
        assert in != null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(reader);
        JSONArray a = new JSONArray();
        a.add(obj);

        String FibonacciStr = " ";

        for (Object o : a) {
            JSONObject sequense = (JSONObject) o;
            JSONArray FibonacciList = (JSONArray) sequense.get("Fibonacci");

            for (int i = 0; i < FibonacciList.size(); i++) {
                FibonacciStr = FibonacciStr + FibonacciList.get(i) + " ";
            }
        }
        return FibonacciStr;
    }
}



