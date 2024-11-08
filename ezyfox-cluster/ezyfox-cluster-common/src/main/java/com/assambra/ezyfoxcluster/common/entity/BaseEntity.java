package com.assambra.ezyfoxcluster.common.entity;

import com.assambra.ezyfoxcluster.common.enums.EntityType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class BaseEntity {
    protected Long id;
    protected EntityType entityType;
}
