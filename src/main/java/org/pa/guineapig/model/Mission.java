package org.pa.guineapig.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Mission {

    private String dtcReasonCode;
    private Integer amount;
    private List<String> comments = new ArrayList<>();

}
