package com.iota.iri.tangle;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by paul on 3/8/17 for iri.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SizedArray {
    int length();
}
