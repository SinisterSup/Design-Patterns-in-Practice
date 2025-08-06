package prototype;

public class SecurityRequest extends Request {
    public SecurityRequest(String url, RequestHeaders headers, RequestBody body) {
        super(url, headers, body);
    }

    public SecurityRequest(SecurityRequest secReq) {
        super(secReq);
    }

    @Override
    public Request clone() {
        return new SecurityRequest(this);
    }
}
