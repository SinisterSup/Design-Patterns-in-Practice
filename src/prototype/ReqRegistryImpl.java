package prototype;

import java.util.HashMap;
import java.util.Map;

public class ReqRegistryImpl implements RequestRegistry {
    Map<String, SecurityRequest> requestMap;

    public ReqRegistryImpl() {
        this.requestMap = new HashMap<String, SecurityRequest>();
    }

    @Override
    public Request getRequest(String keyUrl) {
        if (requestMap.containsKey(keyUrl)) {
            return requestMap.get(keyUrl);
        }
        throw new IllegalArgumentException("Key " + keyUrl + " not found");
//        return null;
    }

    @Override
    public void putRequest(String keyUrl, Request request) {
        requestMap.put(keyUrl, (SecurityRequest) request);
    }
}
