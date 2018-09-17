package com.wiley.api.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Json model for a Test Case to be used for serialization/deserialization of request/response data
 *{
 "created_by": 5,
 "created_on": 1392300984,
 "custom_expected": "..",
 "custom_preconds": "..",
 "custom_steps": "..",
 "custom_steps_separated": [
 {
 "content": "Step 1",
 "expected": "Expected Result 1"
 },
 {
 "content": "Step 2",
 "expected": "Expected Result 2"
 }
 ],
 "estimate": "1m 5s",
 "estimate_forecast": null,
 "id": 1,
 "milestone_id": 7,
 "priority_id": 2,
 "refs": "RF-1, RF-2",
 "section_id": 1,
 "suite_id": 1,
 "title": "Change document attributes (author, title, organization)",
 "type_id": 4,
 "updated_by": 1,
 "updated_on": 1393586511
 }
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestCaseJson {
    private Integer createdBy;
    private Integer createdOn;
    private String customExpected;
    private String customPreconds;
    private String customSteps;
    private List<CustomStepsSeparatedJson> customStepsSeparated = null;
    private String estimate;
    private Object estimateForecast;
    private Integer id;
    private Integer milestoneId;
    private Integer priorityId;
    private String refs;
    private Integer sectionId;
    private Integer suiteId;
    private String title;
    private Integer typeId;
    private Integer updatedBy;
    private Integer updatedOn;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Integer createdOn) {
        this.createdOn = createdOn;
    }

    public String getCustomExpected() {
        return customExpected;
    }

    public void setCustomExpected(String customExpected) {
        this.customExpected = customExpected;
    }

    public String getCustomPreconds() {
        return customPreconds;
    }

    public void setCustomPreconds(String customPreconds) {
        this.customPreconds = customPreconds;
    }

    public String getCustomSteps() {
        return customSteps;
    }

    public void setCustomSteps(String customSteps) {
        this.customSteps = customSteps;
    }

    public List<CustomStepsSeparatedJson> getCustomStepsSeparated() {
        return customStepsSeparated;
    }

    public void setCustomStepsSeparated(List<CustomStepsSeparatedJson> customStepsSeparated) {
        this.customStepsSeparated = customStepsSeparated;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public Object getEstimateForecast() {
        return estimateForecast;
    }

    public void setEstimateForecast(Object estimateForecast) {
        this.estimateForecast = estimateForecast;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMilestoneId() {
        return milestoneId;
    }

    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }

    public Integer getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Integer priorityId) {
        this.priorityId = priorityId;
    }

    public String getRefs() {
        return refs;
    }

    public void setRefs(String refs) {
        this.refs = refs;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getSuiteId() {
        return suiteId;
    }

    public void setSuiteId(Integer suiteId) {
        this.suiteId = suiteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Integer getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Integer updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
