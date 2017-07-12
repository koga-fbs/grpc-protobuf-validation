package com.serious.validation.support;

import com.google.common.base.Preconditions;
import com.serious.validation.AbstractValidator;
import validation.Validation;

import java.util.Collection;

/**
 * Created by Serious on 2017/6/28.
 */
public class RepeatMaxValidator extends AbstractValidator {

    public RepeatMaxValidator() {
        validators.put(Validation.repeatMax.getDescriptor(), this);
    }

    @Override
    protected void doValidate(Object fieldValue, Object extensionValue, String errInfo) {
        Long extensionValueLong = (Long) extensionValue;
        Collection fieldValueCol = (Collection) fieldValue;
        String err = errInfo + "error with RepeatMax";
        Preconditions.checkArgument(fieldValueCol.size() < extensionValueLong, err);
    }
}
