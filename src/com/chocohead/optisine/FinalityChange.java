package com.chocohead.optisine;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target({FIELD, METHOD, CONSTRUCTOR, TYPE})
public @interface FinalityChange {
	enum Finality {
		GAIN, LOST
	}

	/** How the finality of the annotated target changed */
	Finality change();
}