package prototype;

public class Main {
    public static void main(String[] args) {
        RequestBody requestBody = new RequestBody("Google", "www.google.com");
        Request reqPrototype = new Request("bookmarks.com", new RequestHeaders(), requestBody);
        Request secReqPrototype = new SecurityRequest("bookmarks.com", new RequestHeaders(), requestBody);
        Request reqClone = reqPrototype.clone();

        RequestRegistry reqRegistry = new ReqRegistryImpl();
        reqRegistry.putRequest("basic", reqPrototype);
        reqRegistry.putRequest("security", secReqPrototype);

        Request secReqClone = reqRegistry.getRequest("security").clone();

        System.out.println(secReqClone.body.name);
        System.out.println(reqClone.body.bookmarksUrl);

    }

}
