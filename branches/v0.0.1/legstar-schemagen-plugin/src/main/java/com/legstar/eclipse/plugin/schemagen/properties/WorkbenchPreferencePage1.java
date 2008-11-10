/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/
package com.legstar.eclipse.plugin.schemagen.properties;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.jface.preference.IPreferenceStore;
import com.legstar.eclipse.plugin.schemagen.Activator;
import com.legstar.eclipse.plugin.schemagen.SchemagenPreferences;

/**
 * A preference page to setup settings for XML schema generation.
 *
 */
public class WorkbenchPreferencePage1
	extends PreferencePage
	implements IWorkbenchPreferencePage,  SelectionListener {

	/** The group label text. */
	public static final String GROUP_LABEL_TEXT = "XML schema options";
	
	/** The namespace prefix label text. */
	public static final String NS_PREFIX_LABEL_TEXT =
		"Namespace prefix:";
	
	/** XML schema namespace prefix. */
	private Text mTxNamespacePrefix;

	/**
	 * Create a composite with a grid layout and given number of columns.
	 * @param parent the owner
	 * @param columns number of colums the layout should have
	 * @return the newly created composite
	 */
	private Composite createComposite(
			final Composite parent, final int columns) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		layout.numColumns = columns;
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);
		return composite;
	}

	/**
	 * Create a label with a given text.
	 * @param parent the owner
	 * @param text label text
	 * @return the newly created label
	 */
	private Label createLabel(
			final Composite parent, final String text) {
		Label label = new Label(parent, SWT.LEFT);
		label.setText(text);
		return label;
	}

	/**
	 * Create a group with a given text.
	 * @param parent the owner
	 * @param text label text
	 * @param columns number of colums the layout should have
	 * @return the newly created group
	 */
	private Group createGroup(
			final Composite parent, final String text, final int columns) {
		Group group = new Group(parent, SWT.SHADOW_ETCHED_IN);
		group.setText(text);
		GridLayout layout = new GridLayout();
		group.setLayout(layout);
		layout.numColumns = columns;
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.grabExcessHorizontalSpace = true;
		group.setLayoutData(data);
		return group;
	}

	/**
	 * Create a Text field with a given text.
	 * @param parent the owner
	 * @param label label text
	 * @return the newly created Text field
	 */
	private Text createText(
			final Composite parent, final String label) {
		Text text = new Text(parent, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		text.setLayoutData(gd);
		text.setEditable(true);
		text.setText(label);
		text.addSelectionListener(this);
		return text;
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(
	 * org.eclipse.ui.IWorkbench)
	 * @param workbench pointer to workbench
	 */
	public final void init(final IWorkbench workbench) {
		initializeDefaultPreferences(getPreferenceStore());
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#doGetPreferenceStore()
	 * @return a preference store
	 */
	protected final IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	/**
	 * Setup the reference store with default values.
	 * @param store the current preferences store
	 */
	private void initializeDefaultPreferences(final IPreferenceStore store) {
		store.setDefault(
				SchemagenPreferences.NS_PREFIX_PREF,
				SchemagenPreferences.DEFAULT_NS_PREFIX);
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(
	 * org.eclipse.swt.widgets.Composite)
	 * @param parent the parent composite
	 * @return the new control
	 */
	@Override
	protected final Control createContents(final Composite parent) {

		//compositeTab1 << parent
		Composite compositeTab1 = createComposite(parent, 2);
		final Group antGroup = createGroup(compositeTab1, GROUP_LABEL_TEXT, 2);

		createLabel(antGroup, NS_PREFIX_LABEL_TEXT);
		
		mTxNamespacePrefix = createText(antGroup,
				SchemagenPreferences.DEFAULT_NS_PREFIX); 

		initializeValues();
		return compositeTab1;
	}

	/**
	 * Initialize widgets with values coming from the preference store.
	 */
	private void initializeValues()	{
		IPreferenceStore store = getPreferenceStore();

		mTxNamespacePrefix.setText(store.getString(
				SchemagenPreferences.NS_PREFIX_PREF));

	}

	/**
	 * Method declared on PreferencePage.
	 * @return true if OK confirmed
	 */
	public final boolean performOk() {
		storeValues();
		Activator.getDefault().savePluginPreferences();
		return true;
	}

	/**
	 * Method declared on PreferencePage.
	 */
	protected final void performDefaults() {
		super.performDefaults();
		initializeDefaults();

	}
	/**
	 * Save the preference values in the preferences store.
	 */
	private void storeValues() {
		IPreferenceStore store = getPreferenceStore();

		store.setValue(SchemagenPreferences.NS_PREFIX_PREF,
				mTxNamespacePrefix.getText());
	}

	/**
	 * Reinitializes values from default settings.
	 */
	private void initializeDefaults() {
		IPreferenceStore store = getPreferenceStore();
		mTxNamespacePrefix.setText(store.getDefaultString(
				SchemagenPreferences.NS_PREFIX_PREF));
		storeValues();
	}
	
	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(
	 * org.eclipse.swt.events.SelectionEvent)
	 * @param e selection event
	 */
	public final void widgetDefaultSelected(final SelectionEvent e) {

	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(
	 * org.eclipse.swt.events.SelectionEvent)
	 * @param e selection event
	 */
	public final void widgetSelected(final SelectionEvent e) {
	}

}