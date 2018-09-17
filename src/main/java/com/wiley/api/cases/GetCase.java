package com.wiley.api.cases;

import com.wiley.TrConnection;
import com.wiley.api.crud.Read;
import com.wiley.api.json.TestCaseJson;
import com.wiley.http.RaAuthorizedGet;
import io.restassured.response.Response;

/**
 * Don't forget to create javadoc for a class!
 */
public class GetCase implements Read<TestCaseJson> {
    private final String id;
    private final TrConnection tr;

    public GetCase(final String id, final TrConnection tr) {
        this.id = id;
        this.tr = tr;
    }

    public TestCaseJson read() {
        String url = this.tr.getUrl() + "index.php?/api/v2/get_case/:" + this.id;
        Response resp = new RaAuthorizedGet(url, this.tr.getLogin(), this.tr.getPassword()).send();
        return resp.as(TestCaseJson.class);
    }
}
