package org.zerock.response_error_model.api.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GradeRequest {
    @NotNull(message = "grade 값 비어있음")
    @Min(value = 1, message = "1보다 작은 값을 사용할 수 없음.")
    @Max(value = 5, message = "5보다 큰 값을 사용할 수 없음.")
    private int grade;

    private double cost;
}