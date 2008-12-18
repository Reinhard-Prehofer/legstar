/*******************************************************************************
 * Copyright (c) 2008 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.coxb.gen;

import com.legstar.codegen.CodeGenUtil;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.coxb.ICobolChoiceBinding;
import com.legstar.coxb.gen.CoxbGenModel;
import com.legstar.coxb.impl.reflect.CComplexReflectBinding;
import com.legstar.util.JaxbUtil;


/**
 * Test the individual velocity templates.
 *
 */
public class VelocityTemplatesTest extends AbstractTestTemplate {

	/** This generator name. */
	private static final String BINDING_GENERATOR_NAME =
		"LegStar Binding generator";

    /** @{inheritDoc}*/
    public void setUp() {
        super.setUp();
        CodeGenUtil.checkDirectory(GEN_SRC_DIR, true);
    }
    
	/**
	 * A complex type case.
	 * @throws Exception if generation fails
	 */
	public void testGenAllTypes() throws Exception {

		com.legstar.test.coxb.alltypes.ObjectFactory objectFactory
		= new com.legstar.test.coxb.alltypes.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.alltypes.Dfhcommarea"));

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.alltypes");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.alltypes.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "DfhcommareaBinding");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-complex.vm",
				"binding", ce,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

		String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolStringBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayStringBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolBinaryBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayBinaryBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolPackedDecimalBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayPackedDecimalBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolOctetStreamBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolFloatBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayFloatBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolDoubleBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayDoubleBinding;"));
		assertTrue(resStr.contains("public DfhcommareaBinding("));
		assertTrue(resStr.contains("final Dfhcommarea valueObject) {"));
		assertTrue(resStr.contains("this(\"\", \"\", null, valueObject);"));
		assertTrue(resStr.contains("import java.math.BigInteger;"));
		assertTrue(resStr.contains("import java.math.BigDecimal;"));
		assertTrue(resStr.contains("sString.setByteLength(4);"));
		assertTrue(resStr.contains("sString.setCobolName(\"S-STRING\");"));
		assertTrue(resStr.contains("sShort.setByteLength(2);"));
		assertTrue(resStr.contains("sShort.setCobolName(\"S-SHORT\");"));
		assertTrue(resStr.contains("sShort.setIsSigned(true);"));
		assertTrue(resStr.contains("aBinary.setByteLength(4);"));
		assertTrue(resStr.contains("aBinary.setCobolName(\"A-BINARY\");"));
		assertTrue(resStr.contains("aBinary.setMinOccurs(2);"));
		assertTrue(resStr.contains("sString.setObjectValue(mValueObject.getSString());"));
		assertTrue(resStr.contains("sUshort.setObjectValue(mValueObject.getSUshort());"));
		assertTrue(resStr.contains("aDec.setObjectValue(mValueObject.getADec());"));
		assertTrue(resStr.contains("aFloat.setObjectValue(mValueObject.getAFloat());"));
		assertTrue(resStr.contains("aDouble.setObjectValue(mValueObject.getADouble());"));

		assertTrue(resStr.contains("mValueObject.setSString((String) bindingValue);"));
        assertTrue(resStr.contains("List < Double > listADouble = cast(bindingValue);"));
		assertTrue(resStr.contains("mValueObject.getADouble().clear();"));
		assertTrue(resStr.contains("mValueObject.getADouble().addAll(listADouble);"));
	}

    /**
     * A complex array type case.
     * @throws Exception if generation fails
     */
	public void testGenArrayssm() throws Exception {

		com.legstar.test.coxb.arrayssm.ObjectFactory objectFactory
		= new com.legstar.test.coxb.arrayssm.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.arrayssm.Dfhcommarea"));

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.arrayssm");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.arrayssm.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "DfhcommareaBinding");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-complex.vm",
				"binding", ce,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import java.util.List;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayComplexBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayStringBinding;"));
		assertTrue(resStr.contains("import com.legstar.test.coxb.arrayssm.TableComplex;"));

		assertTrue(resStr.contains("public ICobolArrayStringBinding _tableSimple;"));
		assertTrue(resStr.contains("public ICobolArrayComplexBinding _tableComplexWrapper;"));
		assertTrue(resStr.contains("public ICobolComplexBinding _tableComplexWrapperItem;"));
		assertTrue(resStr.contains("public ICobolComplexBinding _tableComplex2;"));
		assertTrue(resStr.contains("public ICobolArrayZonedDecimalBinding _tableSimpleNumeric;"));

		assertTrue(resStr.contains("tableSimple = BF.createArrayStringBinding(\"TableSimple\","));
		assertTrue(resStr.contains("tableSimple.setByteLength(3);"));
		assertTrue(resStr.contains("tableSimple.setCobolName(\"TABLE-SIMPLE\");"));
		assertTrue(resStr.contains("tableSimple.setMinOccurs(2);"));
		assertTrue(resStr.contains("tableSimple.setMaxOccurs(2);"));
		assertTrue(resStr.contains("tableComplexWrapperItem = new TableComplexBinding(\"TableComplexWrapperItem\","));
		assertTrue(resStr.contains("\"TableComplex\", this, null);"));
		assertTrue(resStr.contains("tableComplexWrapper = new TableComplexWrapperBinding(\"TableComplexWrapper\","));
		assertTrue(resStr.contains("\"TableComplex\", this, _tableComplexWrapperItem);"));

        assertTrue(resStr.contains("List < TableComplex > listTableComplexWrapper = cast(bindingValue);"));
		assertTrue(resStr.contains("mValueObject.getTableComplex().clear();"));
		assertTrue(resStr.contains("mValueObject.getTableComplex().addAll(listTableComplexWrapper);"));
	}

    /**
     * A complex array wrapper type case.
     * @throws Exception if generation fails
     */
	public void testGenArrayssmWrapper() throws Exception {

		com.legstar.test.coxb.arrayssm.ObjectFactory objectFactory
		= new com.legstar.test.coxb.arrayssm.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.arrayssm.Dfhcommarea"));

		ICobolArrayComplexBinding ca = (ICobolArrayComplexBinding) ce.getChildrenList().get(1);

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.arrayssm");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.arrayssm.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "TableComplexWrapperBinding");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-complex-array.vm",
				"binding", ca,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolComplexBinding;"));
		assertTrue(resStr.contains("import java.util.List;"));
		assertTrue(resStr.contains("import java.util.ArrayList;"));
		assertTrue(resStr.contains("import com.legstar.test.coxb.arrayssm.TableComplex;"));
		assertTrue(resStr.contains("public class TableComplexWrapperBinding"));
		assertTrue(resStr.contains("extends CArrayComplexBinding {"));
		assertTrue(resStr.contains("private List < TableComplex > mValueObject;"));
		assertTrue(resStr.contains("super(bindingName, fieldName, TableComplex.class, null, parentBinding, complexItemBinding);"));
		assertTrue(resStr.contains("setMinOccurs(3);"));
		assertTrue(resStr.contains("setMaxOccurs(3);"));
		assertTrue(resStr.contains("mValueObject = new ArrayList < TableComplex >();"));
		assertTrue(resStr.contains("mValueObject.add((TableComplex) getComplexItemBinding()."));
		assertTrue(resStr.contains("getObjectValue(TableComplex.class));"));

		assertTrue(resStr.contains("public final List < TableComplex > getTableComplex() throws HostException {"));
		assertTrue(resStr.contains("return (List < TableComplex >) getObjectValue(TableComplex.class);"));
	}

    /**
     * A complex type containing a variable size array case.
     * @throws Exception if generation fails
     */
	public void testGenArraysdo() throws Exception {

		com.legstar.test.coxb.arraysdo.ObjectFactory objectFactory
		= new com.legstar.test.coxb.arraysdo.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.arraysdo.Dfhcommarea"));

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.arraysdo");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.arraysdo.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "DfhcommareaBinding");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-complex.vm",
				"binding", ce,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import java.util.List;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayStringBinding;"));

		assertTrue(resStr.contains("public ICobolZonedDecimalBinding _tableSize;"));
		assertTrue(resStr.contains("public ICobolArrayStringBinding _tableOdo;"));

		assertTrue(resStr.contains("tableSize = BF.createZonedDecimalBinding(\"TableSize\","));
		assertTrue(resStr.contains("\"TableSize\", Integer.class, this);"));
		assertTrue(resStr.contains("tableSize.setCobolName(\"TABLE-SIZE\");"));
		assertTrue(resStr.contains("tableSize.setIsODOObject(true);"));
		assertTrue(resStr.contains("tableSize.setByteLength(2);"));
		assertTrue(resStr.contains("tableSize.setTotalDigits(2);"));
		assertTrue(resStr.contains("tableOdo = BF.createArrayStringBinding(\"TableOdo\","));
		assertTrue(resStr.contains("\"TableOdo\", String.class, this);"));
		assertTrue(resStr.contains("tableOdo.setCobolName(\"TABLE-ODO\");"));
		assertTrue(resStr.contains("tableOdo.setByteLength(5);"));
		assertTrue(resStr.contains("tableOdo.setMinOccurs(1);"));
		assertTrue(resStr.contains("tableOdo.setMaxOccurs(100);"));
		assertTrue(resStr.contains("tableOdo.setDependingOn(\"TABLE-SIZE\");"));
		assertTrue(resStr.contains("tableSize.setObjectValue(mValueObject.getTableSize());"));
		assertTrue(resStr.contains("setCounterValue(_tableOdo.getDependingOn(),"));
		assertTrue(resStr.contains("((List < ? >) mValueObject.getTableOdo()).size());"));

		assertTrue(resStr.contains("mValueObject.setTableSize((Integer) bindingValue);"));
        assertTrue(resStr.contains("List < String > listTableOdo = cast(bindingValue);"));
		assertTrue(resStr.contains("mValueObject.getTableOdo().clear();"));
		assertTrue(resStr.contains("mValueObject.getTableOdo().addAll(listTableOdo);"));
	}

    /**
     * A complex type containing a redefine case.
     * @throws Exception if generation fails
     */
	public void testGenRedsimpt() throws Exception {

		com.legstar.test.coxb.redsimpt.ObjectFactory objectFactory
		= new com.legstar.test.coxb.redsimpt.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.redsimpt.Dfhcommarea"));

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.redsimpt");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.redsimpt.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "DfhcommareaBinding");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-complex.vm",
				"binding", ce,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolChoiceBinding;"));
		assertTrue(resStr.contains("public ICobolChoiceBinding _cDefinition1Choice;"));
		assertTrue(resStr.contains("cDefinition1Choice = new CDefinition1ChoiceBinding(\"CDefinition1Choice\", this);"));
		assertTrue(resStr.contains("cDefinition1Choice.setCobolName(\"C-DEFINITION-1\");"));
		assertTrue(resStr.contains("cDefinition1Choice.setByteLength(18);"));
		assertTrue(resStr.contains("cDefinition1Choice.setUnmarshalChoiceStrategyClassName("));
		assertTrue(resStr.contains("\"com.legstar.coxb.cust.redsimpt.ChoiceSelector\");"));
	}

    /**
     * A choice type case.
     * @throws Exception if generation fails
     */
	public void testGenRedsimptChoice() throws Exception {

		com.legstar.test.coxb.redsimpt.ObjectFactory objectFactory
		= new com.legstar.test.coxb.redsimpt.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.redsimpt.Dfhcommarea"));

		ICobolChoiceBinding cc = (ICobolChoiceBinding) ce.getChildrenList().get(0);

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.redsimpt");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.redsimpt.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "CDefinition1ChoiceBinding");


		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-choice.vm",
				"binding", cc,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolComplexBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.common.CChoiceBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolZonedDecimalBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolStringBinding;"));
		assertTrue(resStr.contains("public ICobolStringBinding _cDefinition1;"));
		assertTrue(resStr.contains("public ICobolZonedDecimalBinding _cDefinition2;"));
		assertTrue(resStr.contains("setUnmarshalChoiceStrategyClassName("));
		assertTrue(resStr.contains("public ICobolZonedDecimalBinding _cDefinition2;"));
		assertTrue(resStr.contains("\"com.legstar.coxb.cust.redsimpt.ChoiceSelector\");"));
		assertTrue(resStr.contains("cDefinition1 = BF.createStringBinding(\"CDefinition1\","));
		assertTrue(resStr.contains("\"CDefinition1\", String.class, getParentBinding());"));
		assertTrue(resStr.contains("cDefinition1.setCobolName(\"C-DEFINITION-1\");"));
		assertTrue(resStr.contains("cDefinition1.setByteLength(18);"));
		assertTrue(resStr.contains("cDefinition1.setUnmarshalChoiceStrategyClassName("));
		assertTrue(resStr.contains("\"com.legstar.coxb.cust.redsimpt.ChoiceSelector\");"));
		assertTrue(resStr.contains("cDefinition2 = BF.createZonedDecimalBinding(\"CDefinition2\","));
		assertTrue(resStr.contains("\"CDefinition2\", Long.class, getParentBinding());"));
		assertTrue(resStr.contains("cDefinition2.setCobolName(\"C-DEFINITION-2\");"));
		assertTrue(resStr.contains("cDefinition2.setByteLength(18);"));
		assertTrue(resStr.contains("cDefinition2.setTotalDigits(18);"));
		assertTrue(resStr.contains("cDefinition2.setRedefines(\"C-DEFINITION-1\");"));
		assertTrue(resStr.contains("addAlternative(_cDefinition1);"));
		assertTrue(resStr.contains("addAlternative(_cDefinition2);"));

		assertTrue(resStr.contains("value = getDfhcommarea().getCDefinition1();"));
		assertTrue(resStr.contains("cDefinition1.setObjectValue(value);"));
		assertTrue(resStr.contains("value = getDfhcommarea().getCDefinition2();"));
		assertTrue(resStr.contains("cDefinition2.setObjectValue(value);"));

		assertTrue(resStr.contains("getDfhcommarea().setCDefinition1("));
		assertTrue(resStr.contains("(String) bindingValue);"));
		assertTrue(resStr.contains("getDfhcommarea().setCDefinition2("));
		assertTrue(resStr.contains("(Long) bindingValue);"));

		assertTrue(resStr.contains("public final Dfhcommarea getDfhcommarea() throws HostException {"));
		assertTrue(resStr.contains("return ((DfhcommareaBinding) getParentBinding()).getDfhcommarea();"));
		assertTrue(resStr.contains("return (Dfhcommarea) getParentValueObject();"));
	}

    /**
     * A choice strategy type case.
     * @throws Exception if generation fails
     */
	public void testGenRedsimptChoiceStrategy() throws Exception {

		com.legstar.test.coxb.redsimpt.ObjectFactory objectFactory
		= new com.legstar.test.coxb.redsimpt.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.redsimpt.Dfhcommarea"));

		ICobolChoiceBinding cc = (ICobolChoiceBinding) ce.getChildrenList().get(0);

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.redsimpt");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.redsimpt.bind");
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("choice-strategy-type", "Unmarshal");
		getParameters().put("choice-strategy-qualified-class-name", "com.legstar.coxb.cust.redsimpt.ChoiceSelector");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-choice-strategy.vm",
				"binding", cc,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("package com.legstar.coxb.cust.redsimpt;"));
		assertTrue(resStr.contains("public class ChoiceSelector implements ICobolUnmarshalChoiceStrategy {"));
		assertTrue(resStr.contains("Dfhcommarea valueObject = (Dfhcommarea) choice.getObjectValue(Dfhcommarea.class);"));
		assertTrue(resStr.contains("return choice.getAlternativeByName(\"CDefinition1\");"));
		assertTrue(resStr.contains("return choice.getAlternativeByName(\"CDefinition2\");"));
	}

    /**
     * A binding to a POJO case.
     * @throws Exception if generation fails
     */
	public void testGenJvmQueryReply() throws Exception {

		com.legstar.test.coxb.jvmquery.ObjectFactory objectFactory
		= new com.legstar.test.coxb.jvmquery.ObjectFactory();

		CComplexReflectBinding ce = new CComplexReflectBinding(
				objectFactory,
				JaxbUtil.loadClass("com.legstar.test.coxb.jvmquery.JvmQueryReply"));

		CoxbGenModel coxbContext = new CoxbGenModel();
		coxbContext.setJaxbPackageName("com.legstar.test.coxb.jvmquery");
		coxbContext.setCoxbPackageName("com.legstar.test.coxb.jvmquery.bind");
		coxbContext.setAlternativePackageName("com.legstar.xsdc.test.cases.jvmquery");
		coxbContext.setAlternativeFactoryName("ObjectFactory");
		
		getParameters().put("coxbContext", coxbContext);
		getParameters().put("binding-class-name", "JvmQueryReplyBinding");

		CodeGenUtil.processTemplate(
				BINDING_GENERATOR_NAME,
				"vlc/coxb-bind-complex.vm",
				"binding", ce,
				getParameters(),
				CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.common.CComplexBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolBinaryBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.CobolBindingFactory;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolBindingFactory;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolStringBinding;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolArrayStringBinding;"));
		assertTrue(resStr.contains("import java.util.List;"));
		assertTrue(resStr.contains("import com.legstar.coxb.ICobolComplexBinding;"));
		
		assertTrue(resStr.contains("import com.legstar.xsdc.test.cases.jvmquery.JVMQueryReply;"));
		
		assertTrue(resStr.contains("public class JvmQueryReplyBinding"));
		assertTrue(resStr.contains("private JVMQueryReply mValueObject;"));
		assertTrue(resStr.contains("public ICobolBinaryBinding _envVarValuesCounter;"));
		assertTrue(resStr.contains("public ICobolStringBinding _country;"));
		assertTrue(resStr.contains("public ICobolStringBinding _currencySymbol;"));
		assertTrue(resStr.contains("public ICobolArrayStringBinding _envVarValues;"));
		assertTrue(resStr.contains("public ICobolStringBinding _formattedDate;"));
		assertTrue(resStr.contains("public ICobolStringBinding _language;"));

		assertTrue(resStr.contains("public JvmQueryReplyBinding("));
		assertTrue(resStr.contains("final JVMQueryReply valueObject) {"));
		assertTrue(resStr.contains("super(bindingName, fieldName, JVMQueryReply.class, null, parentBinding);"));

		assertTrue(resStr.contains("mValueObject = new JVMQueryReply();"));
		assertTrue(resStr.contains("if (type.equals(JVMQueryReply.class)) {"));
		assertTrue(resStr.contains("if (bindingValue.getClass().equals(JVMQueryReply.class)) {"));
		assertTrue(resStr.contains("mValueObject = (JVMQueryReply) bindingValue;"));
		assertTrue(resStr.contains("public final JVMQueryReply getJVMQueryReply() {"));
	}

	/**
     * Generate a host to java transformer case.
     * @throws Exception if generation fails
     */
    public void testGenHostToJavaTransformer() throws Exception {

        com.legstar.test.coxb.lsfileae.ObjectFactory objectFactory
        = new com.legstar.test.coxb.lsfileae.ObjectFactory();

        CComplexReflectBinding ce = new CComplexReflectBinding(
                objectFactory,
                JaxbUtil.loadClass("com.legstar.test.coxb.lsfileae.Dfhcommarea"));

        CoxbGenModel coxbContext = new CoxbGenModel();
        coxbContext.setJaxbPackageName("com.legstar.test.coxb.lsfileae");
        coxbContext.setCoxbPackageName("com.legstar.test.coxb.lsfileae.bind");
        
        getParameters().put("coxbContext", coxbContext);
        getParameters().put("binding-class-name", "DfhcommareaBinding");

        CodeGenUtil.processTemplate(
                BINDING_GENERATOR_NAME,
                "vlc/coxb-bind-host-to-java-transformer.vm",
                "binding", ce,
                getParameters(),
                CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
        assertTrue(resStr.contains("DfhcommareaHostToJavaTransformer transformer = new DfhcommareaHostToJavaTransformer();"));
        assertTrue(resStr.contains("Dfhcommarea javaValue = (Dfhcommarea) transformer.transform(hostByteArray);"));
        assertTrue(resStr.contains("public class DfhcommareaHostToJavaTransformer extends AbstractHostToJavaTransformer {"));
        assertTrue(resStr.contains("public DfhcommareaHostToJavaTransformer() {"));
        assertTrue(resStr.contains("public DfhcommareaHostToJavaTransformer(CobolContext cobolContext) {"));
        assertTrue(resStr.contains("public DfhcommareaHostToJavaTransformer(final String hostCharset) {"));
        assertTrue(resStr.contains("return new DfhcommareaBinding();"));
    }

    /**
     * Generate a java to host transformer case.
     * @throws Exception if generation fails
     */
    public void testGenJavaToHostTransformer() throws Exception {

        com.legstar.test.coxb.lsfileae.ObjectFactory objectFactory
        = new com.legstar.test.coxb.lsfileae.ObjectFactory();

        CComplexReflectBinding ce = new CComplexReflectBinding(
                objectFactory,
                JaxbUtil.loadClass("com.legstar.test.coxb.lsfileae.Dfhcommarea"));

        CoxbGenModel coxbContext = new CoxbGenModel();
        coxbContext.setJaxbPackageName("com.legstar.test.coxb.lsfileae");
        coxbContext.setCoxbPackageName("com.legstar.test.coxb.lsfileae.bind");
        
        getParameters().put("coxbContext", coxbContext);
        getParameters().put("binding-class-name", "DfhcommareaBinding");

        CodeGenUtil.processTemplate(
                BINDING_GENERATOR_NAME,
                "vlc/coxb-bind-java-to-host-transformer.vm",
                "binding", ce,
                getParameters(),
                CodeGenUtil.getFile(GEN_SRC_DIR, "test.txt"));

        String resStr = getSource(GEN_SRC_DIR, "/test.txt");
        assertTrue(resStr.contains("DfhcommareaJavaToHostTransformer transformer = new DfhcommareaJavaToHostTransformer();"));
        assertTrue(resStr.contains("byte[] hostByteArray = (Dfhcommarea) transformer.transform(javaValue);"));
        assertTrue(resStr.contains("public class DfhcommareaJavaToHostTransformer extends AbstractJavaToHostTransformer {"));
        assertTrue(resStr.contains("public DfhcommareaJavaToHostTransformer() {"));
        assertTrue(resStr.contains("public DfhcommareaJavaToHostTransformer(CobolContext cobolContext) {"));
        assertTrue(resStr.contains("public DfhcommareaJavaToHostTransformer(final String hostCharset) {"));
        assertTrue(resStr.contains("return new DfhcommareaBinding();"));
    }
}
