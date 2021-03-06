package com.rapidftr.model;

import net.rim.device.api.ui.text.NumericTextFilter;

import com.rapidftr.screens.ManageChildScreen;

public class NumericTextboxFormField extends TextboxFormField {

	public NumericTextboxFormField(String name, String displayName, String type) {
		super(name, displayName, type);
	}

	public void initializeLayout(ManageChildScreen newChildScreen) {
		super.initializeLayout(newChildScreen);
		field.setFilter(new NumericTextFilter());
	}
}
