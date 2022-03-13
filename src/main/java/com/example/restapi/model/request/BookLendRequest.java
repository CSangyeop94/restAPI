package com.example.restapi.model.request;

import java.util.List;
import lombok.Data;

@Data
public class BookLendRequest {
    private List<Long> bookIds;
    private Long memberId;
    private Long bookId;

}
