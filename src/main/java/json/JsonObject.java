package json;
import java.util.ArrayList;
/**
 * Created by Andrii_Rodionov on 1/3/2017.
 */
public class JsonObject extends Json {
    private ArrayList<JsonPair> pairs;
    //private JsonPair[] jsonPairs;
    public JsonObject(JsonPair... jsonPairs) {
        for (int i = 0; i < jsonPairs.length; i++) {
            pairs.add(jsonPairs[i]);
        }
    }

    @Override
    public String toJson() {
        if (pairs.size() == 0) {
            return "{}";
        } else {
            String res = "{";
            for (int i = 0; i < pairs.size(); i++) {
                res += pairs.get(i).key + ": " + pairs.get(i).value;
                if (i == pairs.size() - 1) {
                    res += "}";
                } else {
                    res += ", ";
                }
            }
            return res;
        }
    }

    public void add(JsonPair jsonPair) {
        // ToDo
    }

    public Json find(String name) {
        // ToDo
        return null;
    }

    public JsonObject projection(String... names) {
        // ToDo
        return null;
    }
}
