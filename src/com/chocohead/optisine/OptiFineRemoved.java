package com.chocohead.optisine;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target(TYPE)
@Repeatable(OptiFineLost.class)
public @interface OptiFineRemoved {
	enum Type {
		INTERFACE, METHOD, FIELD;
	}

	/** The {@link Type} of the removed member */
	Type type();

	/** The full name of the removed member */
	String name();
}