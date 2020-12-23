package com.songlingadmin.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author songling
 * @since 2020-07-01
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Songling implements Serializable {

    private static final long serialVersionUID=1L;

      private Long id;

    private String name;

    private Integer number;


}
