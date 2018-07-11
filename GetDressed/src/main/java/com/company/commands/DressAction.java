package com.company.commands;

import com.company.domain.DressState;

public interface DressAction {
    String FAIL = "fail";

    String executeDress(DressState dressState);

    boolean dependenciesSatisfied(DressState dressState);
}
