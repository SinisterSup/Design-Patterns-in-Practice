package prototype;

public class RequestBody {
    String name;
    String bookmarksUrl;

    public RequestBody(String bookmarksUrl, String name) {
        this.name = name;
        this.bookmarksUrl = bookmarksUrl;
    }

    public RequestBody(RequestBody otherReqBody) {
        this.name = otherReqBody.name;
        this.bookmarksUrl = otherReqBody.bookmarksUrl;
    }

    public RequestBody clone() {
        return new RequestBody(this);
    }
}
