package com.wxl.common.to;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Auto-generated: 2022-06-03 11:2:17
 *
 * @author bejson.com (i@bejson.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberPrice {
    private Long id;
    private String name;
    private BigDecimal price;
}
