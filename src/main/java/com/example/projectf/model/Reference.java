package com.example.projectf.model;

import org.springframework.data.annotation.Id;

import java.io.Serializable;

public class Reference implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String RefId;
    

	/**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the refId
     */
    public String getRefId() {
        return RefId;
    }
    /**
     * @param refId the refId to set
     */
    public void setRefId(String refId) {
        RefId = refId;
    }

}
