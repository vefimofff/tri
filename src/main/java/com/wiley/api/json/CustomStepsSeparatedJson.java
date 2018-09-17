package com.wiley.api.json;

import java.util.HashMap;
import java.util.Map;

/**
 *  Json model for a Test Case to be used for serialization/deserialization of request/response data
 *
 * "custom_steps_separated": [
 {
 "content": "Step 1",
 "expected": "Expected Result 1"
 },
 {
 "content": "Step 2",
 "expected": "Expected Result 2"
 }
 ],
 */
public class CustomStepsSeparatedJson {
    private String content;
    private String expected;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExpected() {
        return expected;
    }

    public void setExpected(String expected) {
        this.expected = expected;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

