package prototype;

public class Request {
    String url;
    RequestHeaders headers;
    RequestBody body;

    public Request(String url, RequestHeaders headers, RequestBody body) {
        this.url = url;
        this.headers = headers;
        this.body = body;
    }

    public Request(Request other) {
        this.url = other.url;
        this.headers = other.headers;
        this.body = other.body.clone();
    }

    public Request clone() {
        return new Request(this);
    }
}
