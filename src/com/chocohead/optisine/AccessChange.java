package com.chocohead.optisine;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(CLASS)
@Target({TYPE, FIELD, METHOD, CONSTRUCTOR})
public @interface AccessChange {
	enum Access {
		PRIVATE, PACKAGE, PROTECTED, PUBLIC
	}

	/** The previous access of the annotated target */
	Access was();
}