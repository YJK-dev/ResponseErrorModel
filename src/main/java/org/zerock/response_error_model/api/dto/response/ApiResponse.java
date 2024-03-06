package org.zerock.response_error_model.api.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Builder
@Data
@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    private Status status;
    private Metadata metadata;
    private List<T> results;
    private Map<String, Map<String, String>> data;


    public void setStatus(Status status) {
        this.status = status;
    }


    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}