package prototype;

public interface RequestRegistry {
    Request getRequest(String keyUrl);
    void putRequest(String keyUrl, Request request);
}
