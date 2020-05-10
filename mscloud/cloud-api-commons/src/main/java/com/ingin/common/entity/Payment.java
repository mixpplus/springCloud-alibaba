package com.ingin.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-07 17:36
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
