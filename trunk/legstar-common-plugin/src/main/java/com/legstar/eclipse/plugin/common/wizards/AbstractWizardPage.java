/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
package com.legstar.eclipse.plugin.common.wizards;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.ImageHyperlink;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.legstar.eclipse.plugin.common.Activator;
import com.legstar.eclipse.plugin.common.Messages;
import com.legstar.eclipse.plugin.common.preferences.PreferenceUrlHistory;


/**
 * A generic wizard page that gives all LegStar wizards the same look
 * and feel.
 */
public abstract class AbstractWizardPage extends WizardPage {

    /** The initial selection in the workspace. */
    private IStructuredSelection mInitialSelection = null;
    
    /** The main grid layout column number. */
    public static final int LAYOUT_COLUMNS = 3;

    /** Manages the history of URLs entered across sessions. */
    private PreferenceUrlHistory mUrlHistory;
    
    /** Storage key prefix for history of wsdl URLs. */
    public static final String URL_HISTORY_STORE_KEY_PFX = "historyUrl";

	/**
     * Construct a wizard page.
     * @param initialSelection the workbench current selection
     * @param pageName the name of this page
     * @param title the title that should appear on this page
     * @param description the text that should describe the purpose of this page
     */
    protected AbstractWizardPage(
            final IStructuredSelection initialSelection,
            final String pageName,
            final String title,
            final String description) {
        super(pageName);
        setTitle(title);
        setDescription(description);
        mInitialSelection = initialSelection;
		ImageDescriptor image =
            AbstractUIPlugin.
                imageDescriptorFromPlugin(
                		Activator.PLUGIN_ID,
                		Activator.LOGO_IMG);
        setImageDescriptor(image);
    }

    /** {@inheritDoc}*/
    public void createControl(final Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = LAYOUT_COLUMNS;
        gridLayout.verticalSpacing = 9;
        container.setLayout(gridLayout);
        setControl(container);
        
        createExtendedControls(container);
        
        IPreferenceStore store = Activator.getDefault().getPreferenceStore();
        mUrlHistory = new PreferenceUrlHistory(
        		store, URL_HISTORY_STORE_KEY_PFX);
        
        initContents();
        dialogChanged();
    }

    /**
     * Set the initial values for controls on this page.
     */
    protected abstract void initContents();

    /**
     * Add the controls that are specific to this wizard page.
     * @param container the parent container
     */
    protected abstract void createExtendedControls(final Composite container);
    
    /**
     * Process new input from user. Validate all control contents.
     */
    protected abstract void dialogChanged();
    
    /**
     * Adds a label that spans only one column.
     * @param container parent composite
     * @param text the label text
     * @return the new label
     */
    public static Label createLabel(
    		final Composite container, final String text) {
        return createLabel(container, text, 1);
    }

    /**
     * Adds a label that spans only one column.
     * @param container parent composite
     * @param text the label text
     * @param span how many columns of the grid this should span
     * @return the new label
     */
    public static Label createLabel(
    		final Composite container, final String text, final int span) {
        final Label label = new Label(container, SWT.NONE);
        final GridData gridData = new GridData();
        gridData.horizontalSpan = span;
        label.setLayoutData(gridData);
        label.setText(text);
        return label;
    }

    /**
     * Create a text field that fills a grid column.
     * @param container the parent container
     * @return the new text field
     */
    public static Text createText(final Composite container) {
        return createText(container, 1);
    }
    
    /**
     * Create a text field that fills a grid column.
     * @param container the parent container
     * @param span how many columns of the grid this should span
     * @return the new text field
     */
    public static Text createText(final Composite container, final int span) {
        final Text text = new Text(container, SWT.BORDER | SWT.SINGLE);
        final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = span;
        text.setLayoutData(gridData);
        return text;
    }

	/**
	 * Add a new button on a composite.
	 * @param parent the parent composite
	 * @param text text to appear on button
	 * @return the newly created button
	 */
	public static Button createButton(
			final Composite parent, final String text) {
		Button button = new Button(parent, SWT.PUSH);
		button.setText(text);
		return button;
	}

	/**
	 * Create a group container spanning all columns.
	 * @param container the parent container
	 * @param text the group text
	 * @return the new group
	 */
	protected static Group createGroup(
			final Composite container, final String text) {
		return createGroup(container, text, LAYOUT_COLUMNS);
	}

    /**
     * Create a Combo widget.
     * @param container parent composite
     * @return the new combo widget
     */
    public static Combo createCombo(final Composite container) {
        Combo combo = new Combo(container, SWT.SINGLE
                | SWT.BORDER | SWT.V_SCROLL);
        combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        return combo;
    }
    
	/**
	 * Create a container spanning all columns of parent container grid.
	 * @param container the parent container
	 * @param columns the number of columns this containers layout should have
	 * @return the new container
	 */
    public static Canvas createCanvas(
			final Composite container, final int columns) {
		final Canvas canvas = new Canvas(container, SWT.NONE);
		final GridData groupGridData = new GridData(GridData.FILL_HORIZONTAL);
		groupGridData.horizontalSpan = LAYOUT_COLUMNS;
		canvas.setLayoutData(groupGridData);
		canvas.setLayout(new GridLayout(columns, false));
		return canvas;
	}

	/**
	 * Create a group container spanning all columns but with a potentially
	 * different number of columns for its internal layout.
	 * @param container the parent container
	 * @param text the group text
	 * @param columns the number of columns this groups layout should have
	 * @return the new group
	 */
    public static Group createGroup(
			final Composite container, final String text, final int columns) {
		final Group group = new Group(container, SWT.SHADOW_ETCHED_IN);
		final GridData groupGridData = new GridData(GridData.FILL_HORIZONTAL);
		groupGridData.horizontalSpan = LAYOUT_COLUMNS;
		group.setLayoutData(groupGridData);
		group.setLayout(new GridLayout(columns, false));
		group.setText(text);
		return group;
	}

	/**
	 * This type of widget has a textbox and a browse button to lookup a folder
	 * on the file system. The content is tied to a preference store element so
	 * content can be saved and restored.
	 * @param container the parent composite
	 * @param preferenceName the preference store item
	 * @param labelText the label's text appearing before the textbox
	 * @return the composite
	 */
    public static Text createDirectoryFieldEditor(
			final Composite container,
			final String preferenceName,
			final String labelText) {
		DirectoryFieldEditor editor = new DirectoryFieldEditor(preferenceName,
				labelText, container);
		return editor.getTextControl(container);
	}

	/**
	 * This type of widget is a simple textbox preceded by a label.
	 * The content can be initialized from a preference store.
	 * @param container the parent composite
	 * @param store a preference store
	 * @param preferenceName the preference store item
	 * @param labelText the label's text appearing before the textbox
	 * @return the composite
	 */
	protected static Text createTextField(
			final Composite container,
			final IPreferenceStore store,
			final String preferenceName,
			final String labelText) {
		createLabel(container, labelText);
		Text text = createText(container);
		if (preferenceName != null) {
			text.setText(store.getDefaultString(preferenceName));
		}
		return text;
	}

    /**
     * Create a browse button. It pops up a dialog to select a folder and
     * sets an associated text field with the result.
     * @param container parent container
     * @param dialogTitle title that browse dialog should display
     * @param result Text field to update on return from dialog
     * @return a new button
     */
    protected Button createBrowseForContainerButton(
            final Composite container,
            final String dialogTitle,
            final Text result) {
        final Button button = new Button(container, SWT.PUSH);
        button.setText(Messages.browse_button_label);
        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                Path destPath = handleBrowseForContainer(dialogTitle);
                if (destPath == null) {
                    result.setText("");
                } else {
                    result.setText(destPath.toOSString());
                }
            }
        });
        return button;
    }
    
    /**
     * Create a browse button. It pops up a dialog to select files. It
     * then reads each file and store its content in a text area.
     * @param container parent container
     * @param dialogTitle title that browse dialog should display
     * @param result Text field to update on return from dialog
     * @return a new button
     */
    protected Button createBrowseForFileContentButton(
            final Composite container,
            final String dialogTitle,
            final Text result) {
        final Button button = new Button(container, SWT.PUSH);
        button.setText(Messages.browse_button_label);
        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(final SelectionEvent e) {
                result.setText(selectSingleFileContent(dialogTitle));
            }
        });
        return button;
    }
    
    /**
     * Opens a file selection dialog and merges all selected files
     * contents into a single string. 
     * @param dialogTitle title that browse dialog should display
     * @return a cumulative content of all files selected
     */
    protected String selectSingleFileContent(final String dialogTitle) {
        String fileName = handleBrowseForFiles(dialogTitle);
        StringBuilder sb = new StringBuilder();
        if (fileName != null) {
            try {
                sb.append(getContent(fileName));
            } catch (IOException e1) {
                sb.append(
                		NLS.bind(Messages.file_open_error_msg,
                				fileName, e1.getMessage()));
            }
        }
        return sb.toString();
    }
    
    /**
     * Uses the standard file selection dialog to choose a set of files
     * from the file system.
     * @param dialogTitle what the title should say
     * @return an array of selected file names or null
     */
    protected String handleBrowseForFiles(final String dialogTitle) {
        FileDialog dialog = new FileDialog(
                getShell(), SWT.OPEN);
        dialog.setText(dialogTitle);
        return dialog.open();
    }

    /**
     * Reads the content of a file in a string.
     * @param fileName name of the file
     * @return a string with the file content
     * @throws IOException if fails to read file
     */
    protected static String getContent(
            final String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        StringBuilder resStr = new StringBuilder();
        String str = in.readLine();
        while (str != null) {
            resStr.append(str + '\n');
            str = in.readLine();
        }
        in.close();
        return resStr.toString();
    }
    
    /**
     * Create a Hyperlink Eclipse 3.0 style.
     * @param container the parent container
     * @param text the text of the hyperlink
     * @param image an image to show on the left of the ling
     * @param listener what to do when link is clicked
     * @return the new hyperlink
     */
    protected ImageHyperlink createHyperlink(
            final Composite container,
            final String text,
            final Image image,
            final IHyperlinkListener listener) {
    	return createHyperlink(
    			container, text, image, LAYOUT_COLUMNS, listener);
    }
    
    /**
     * Create a Hyperlink Eclipse 3.0 style.
     * @param container the parent container
     * @param text the text of the hyperlink
     * @param image an image to show on the left of the ling
     * @param span how many columns of the grid this should span
     * @param listener what to do when link is clicked
     * @return the new hyperlink
     */
    protected ImageHyperlink createHyperlink(
            final Composite container,
            final String text,
            final Image image,
            final int span,
            final IHyperlinkListener listener) {
        ImageHyperlink link = new ImageHyperlink(container, SWT.NULL);
        link.setText(text);
        link.setImage(image);
        link.setUnderlined(true);
        link.addHyperlinkListener(listener);
        final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = span;
        link.setLayoutData(gridData);
        return link;
    }

    /**
     * Creates a Combo box and additional widgets. This group of widgets allow
     * users to enter a URL in various ways.
	 * <ul>
	 *  <li>Typing in the URL in a text box</li>
	 *  <li>Selecting a previous URL from the combo box</li>
	 *  <li>Browsing for a local file</li>
	 * </ul>
     * @param container the parent container
     * @param urlType the type of URL this group is supposed to fetch. This is
     *  used for labels.
     * @param modifyListener listener to be notified when the content of the
     *  combo box changes
     * @param selectionListener listener to be notified when a URL is selected
     *  either because the Go button is pressed or a URL was returned from
     *  the file system.
     * @return the Combo box holding URLs
     */
    protected Combo createUrlComboGroup(
    		final Composite container,
    		final String urlType,
    		final ModifyListener modifyListener,
    		final IURLSelectionListener selectionListener) {
    	
        createLabel(container, urlType + " URL");
        
    	final Combo urlCombo = createCombo(container);
    	
        ImageHyperlink link = createHyperlink(
        		container,
        		NLS.bind(Messages.url_select_from_file_system_text, urlType),
        		PlatformUI.getWorkbench().getSharedImages().getImage(
                        ISharedImages.IMG_OBJ_FOLDER),
                2,
                new HyperlinkAdapter() {
        			public void linkActivated(final HyperlinkEvent e) {
        				urlCombo.setText(handleBrowseForFiles(
        						NLS.bind(Messages.url_select_a_file_label,
        								urlType)));
        				selectionListener.urlSelected(urlCombo.getText());
                    	getUrlHistory().add(urlCombo.getText());
        			}
                });
        
        urlCombo.moveBelow(link);
        final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
        gridData.horizontalSpan = 2;
        urlCombo.setLayoutData(gridData);
        urlCombo.addModifyListener(modifyListener);
        
        Button getButton = createButton(container, Messages.go_button_label);
        getButton.addSelectionListener(
        		new SelectionAdapter() {
		            public void widgetSelected(final SelectionEvent e) {
	       				selectionListener.urlSelected(urlCombo.getText());
                    	getUrlHistory().add(urlCombo.getText());
		            }
        		});

    	return urlCombo;
    }
    
    
    /**
     * Uses the standard container selection dialog to choose the new value for
     * a container field.
     * @param dialogTitle what the title should say
     * @return a Path to the selected location or null
     */
    private Path handleBrowseForContainer(final String dialogTitle) {
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(
                getShell(), null, true, dialogTitle);
        if (dialog.open() == ContainerSelectionDialog.OK) {
            Object[] result = dialog.getResult();
            if (result.length == 1) {
                return (Path) result[0];
            }
        }
        return null;
    }
    
	/**
	 * Invalidate the dialog content if error message is not null and make sure
	 * error message is displayed.
	 * @param errorMessage the text
	 */
    protected void updateStatus(final String errorMessage) {
        setErrorMessage(errorMessage);
        setPageComplete(errorMessage == null);
		((AbstractWizard) getWizard()).setCanFinish(
				(errorMessage == null) ? true : false);
    }

    /**
     * @return the initial selection when this page is entered
     */
    public final IStructuredSelection getInitialSelection() {
        return mInitialSelection;
    }

    /**
     * @param initialSelection the initial selection when this page is entered
     *  to set
     */
    public final void setInitialSelection(
    		final IStructuredSelection initialSelection) {
        mInitialSelection = initialSelection;
    }

    /**
     * Pops an error message.
     * @param shell parent shell
     * @param dialogTitle the error dialog title
     * @param pluginID the parent plugin ID
     * @param shortMessage text
     * @param reason a more detailed explanation
     */
    public static void errorDialog(
            final Shell shell,
            final String dialogTitle,
            final String pluginID,
            final String shortMessage,
            final String reason) {
    	AbstractWizard.errorDialog(
    			shell, dialogTitle, pluginID, shortMessage, reason);
    }
    
    /**
     * Log exception.
     * @param innerException exception
     * @param pluginID plugin ID
     */
    public static void logCoreException(
            final Throwable innerException,
            final String pluginID) {
    	AbstractWizard.logCoreException(innerException, pluginID);
    }

    /**
     * Create a formatted core exception.
     * @param e an exception
     * @throws CoreException the core exception
     */
    public static void throwCoreException(
    		final Exception e) throws CoreException {
    	AbstractWizard.throwCoreException(e);
    }

    /**
     * Create a formatted core exception.
     * @param message the error message
     * @throws CoreException the core exception
     */
    public static void throwCoreException(
    		final String message) throws CoreException {
    	AbstractWizard.throwCoreException(message);
    }

	/**
	 * @return the URL history manager 
	 */
	public final PreferenceUrlHistory getUrlHistory() {
		return mUrlHistory;
	}

	/**
	 * @param urlHistory the URL history manager to set
	 */
	public final void setUrlHistory(
			final PreferenceUrlHistory urlHistory) {
		mUrlHistory = urlHistory;
	}
}
