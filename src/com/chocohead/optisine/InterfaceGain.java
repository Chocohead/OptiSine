package com.chocohead.optisine;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(TYPE)
@Repeatable(InterfaceGains.class)
public @interface InterfaceGain {
	/** The interface added to the annotated type */
	String value();
}