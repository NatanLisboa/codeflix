package com.codeflix.admin.catalog.domain.validation;

public abstract class Validator {

    private final ValidationHandler validationHandler;

    public abstract void validate();

    protected Validator(final ValidationHandler validationHandler) {
        this.validationHandler = validationHandler;
    }

    protected ValidationHandler validationHandler() {
        return this.validationHandler;
    }

}
