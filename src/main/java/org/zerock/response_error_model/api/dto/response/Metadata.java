package org.zerock.response_error_model.api.dto.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Metadata {
    private int resultCount;
}