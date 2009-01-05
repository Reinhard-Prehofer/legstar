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
package com.legstar.cixs.jaxws.gen.vm;

import java.io.File;

import com.legstar.cixs.gen.AbstractTestTemplate;
import com.legstar.cixs.gen.Samples;
import com.legstar.cixs.jaxws.gen.Jaxws2CixsGenerator;
import com.legstar.cixs.jaxws.model.CixsJaxwsService;
import com.legstar.codegen.CodeGenUtil;


/**
 * Test the generation of a JAX-WS endpoint implementation for an adapter.
 *
 */
public class ImplementationVelocityTemplatesTest extends AbstractTestTemplate {

    /**
     * Case of a commarea driven target program.
     * @throws Exception if test fails
     */
    public void testLsfileae() throws Exception {

        CixsJaxwsService model = Samples.getLsfileae();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, model.getPackageName(), true);
        Jaxws2CixsGenerator.generateImplementation(
                model, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                model.getImplementationClassName() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileae;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileae.Dfhcommarea;"));
        assertTrue(resStr.contains("@WebService(endpointInterface = \"com.legstar.test.cixs.lsfileae.Lsfileae\","));
        assertTrue(resStr.contains("serviceName = \"lsfileaeService\","));
        assertTrue(resStr.contains("targetNamespace = \"http://cixs.test.legstar.com/lsfileae\")"));
        assertTrue(resStr.contains("private static final String  SERVICE_ADAPTER_NAME = \"lsfileae\";"));
        assertTrue(resStr.contains("/** Invoker implementation for operation lsfileae. */"));
        assertTrue(resStr.contains("private LsfileaeOperationInvoker mLsfileaeOperationInvoker;"));
        assertTrue(resStr.contains("public LsfileaeImpl() {"));
        assertTrue(resStr.contains("mLsfileaeOperationInvoker = new LsfileaeOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("public final Dfhcommarea lsfileae("));
        assertTrue(resStr.contains("final Dfhcommarea request,"));
        assertTrue(resStr.contains("final LsfileaeHostHeader hostHeader)"));
        assertTrue(resStr.contains("throws LsfileaeException {"));
        assertTrue(resStr.contains("return getLsfileaeOperationInvoker().lsfileae("));
        assertTrue(resStr.contains("final LsfileaeHostHeader hostHeader) {"));
        assertTrue(resStr.contains("public String getRequestID(final LsfileaeHostHeader hostHeader) {"));
        assertTrue(resStr.contains("* @return the invoker implementation for operation lsfileae"));
        assertTrue(resStr.contains("public LsfileaeOperationInvoker getLsfileaeOperationInvoker() {"));
        assertTrue(resStr.contains("return mLsfileaeOperationInvoker;"));
        assertTrue(resStr.contains(
                "* @param operationInvoker the invoker implementation for operation lsfileae to set"));
        assertTrue(resStr.contains("public void setLsfileaeOperationInvoker("));
        assertTrue(resStr.contains("final LsfileaeOperationInvoker operationInvoker) {"));
        assertTrue(resStr.contains("mLsfileaeOperationInvoker = operationInvoker;"));
    }

    /**
     * Case of a commarea driven target program with input layout different from output layout.
     * @throws Exception if test fails
     */
    public void testLsfileal() throws Exception {

        CixsJaxwsService model = Samples.getLsfileal();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, model.getPackageName(), true);
        Jaxws2CixsGenerator.generateImplementation(
                model, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                model.getImplementationClassName() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileal;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileal.RequestParms;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileal.ReplyData;"));
        assertTrue(resStr.contains("/** Invoker implementation for operation lsfileal. */"));
        assertTrue(resStr.contains("private LsfilealOperationInvoker mLsfilealOperationInvoker;"));
        assertTrue(resStr.contains("mLsfilealOperationInvoker = new LsfilealOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("public final ReplyData lsfileal("));
        assertTrue(resStr.contains("final RequestParms request,"));
        assertTrue(resStr.contains("return getLsfilealOperationInvoker().lsfileal("));
        assertTrue(resStr.contains("* @return the invoker implementation for operation lsfileal"));
        assertTrue(resStr.contains("public LsfilealOperationInvoker getLsfilealOperationInvoker() {"));
        assertTrue(resStr.contains("return mLsfilealOperationInvoker;"));
        assertTrue(resStr.contains(
                "* @param operationInvoker the invoker implementation for operation lsfileal to set"));
        assertTrue(resStr.contains("public void setLsfilealOperationInvoker("));
        assertTrue(resStr.contains("final LsfilealOperationInvoker operationInvoker) {"));
    }

    /**
     * Case of a container driven target program.
     * @throws Exception if test fails
     */
    public void testLsfileac() throws Exception {

        CixsJaxwsService model = Samples.getLsfileac();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, model.getPackageName(), true);
        Jaxws2CixsGenerator.generateImplementation(
                model, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                model.getImplementationClassName() + ".java");

        assertTrue(resStr.contains("public class LsfileacImpl extends AbstractServiceAdapter implements Lsfileac {"));
        assertTrue(resStr.contains("mLsfileacOperationInvoker = new LsfileacOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("public final LsfileacResponseHolder lsfileac("));
        assertTrue(resStr.contains("final LsfileacRequestHolder request,"));
        assertTrue(resStr.contains("return getLsfileacOperationInvoker().lsfileac("));
        assertTrue(resStr.contains("public LsfileacOperationInvoker getLsfileacOperationInvoker() {"));
        assertTrue(resStr.contains("return mLsfileacOperationInvoker;"));
        assertTrue(resStr.contains("public void setLsfileacOperationInvoker("));
        assertTrue(resStr.contains("final LsfileacOperationInvoker operationInvoker) {"));
        assertTrue(resStr.contains("mLsfileacOperationInvoker = operationInvoker;"));
    }

    /**
     * Case of a multi method service adapter.
     * @throws Exception if test fails
     */
    public void testLsfileax() throws Exception {

        CixsJaxwsService model = Samples.getLsfileax();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, model.getPackageName(), true);
        Jaxws2CixsGenerator.generateImplementation(
                model, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                model.getImplementationClassName() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfileax;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileae.Dfhcommarea;"));
        assertTrue(resStr.contains("@WebService(endpointInterface = \"com.legstar.test.cixs.lsfileax.Lsfileax\","));
        assertTrue(resStr.contains("serviceName = \"lsfileaxService\","));
        assertTrue(resStr.contains("targetNamespace = \"http://cixs.test.legstar.com/lsfileax\")"));
        assertTrue(resStr.contains("public class LsfileaxImpl extends AbstractServiceAdapter implements Lsfileax {"));
        assertTrue(resStr.contains("private LsfileaeOperationInvoker mLsfileaeOperationInvoker;"));
        assertTrue(resStr.contains("private LsfileacOperationInvoker mLsfileacOperationInvoker;"));
        assertTrue(resStr.contains("public LsfileaxImpl() {"));
        assertTrue(resStr.contains("mLsfileaeOperationInvoker = new LsfileaeOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("mLsfileacOperationInvoker = new LsfileacOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("public final Dfhcommarea lsfileae("));
        assertTrue(resStr.contains("final Dfhcommarea request,"));
        assertTrue(resStr.contains("return getLsfileaeOperationInvoker().lsfileae("));
        assertTrue(resStr.contains("public final LsfileacResponseHolder lsfileac("));
        assertTrue(resStr.contains("final LsfileacRequestHolder request,"));
        assertTrue(resStr.contains("return getLsfileacOperationInvoker().lsfileac("));
        assertTrue(resStr.contains("public LsfileaeOperationInvoker getLsfileaeOperationInvoker() {"));
        assertTrue(resStr.contains("public void setLsfileaeOperationInvoker("));
        assertTrue(resStr.contains("public LsfileacOperationInvoker getLsfileacOperationInvoker() {"));
        assertTrue(resStr.contains("public void setLsfileacOperationInvoker("));
    }

    /**
     * Case where the operation has a different namespace/package than the service.
     * @throws Exception if test fails
     */
    public void testLsfilean() throws Exception {

        CixsJaxwsService model = Samples.getLsfilean();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, model.getPackageName(), true);
        Jaxws2CixsGenerator.generateImplementation(
                model, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                model.getImplementationClassName() + ".java");

        assertTrue(resStr.contains("package com.legstar.test.cixs.lsfilean;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileae.Dfhcommarea;"));
        assertTrue(resStr.contains("import com.legstar.test.cixs.oper.lsfilean.LsfileaeOperationInvoker;"));
        assertTrue(resStr.contains("private static final String  SERVICE_ADAPTER_NAME = \"lsfilean\";"));
        assertTrue(resStr.contains("private LsfileaeOperationInvoker mLsfileaeOperationInvoker;"));
        assertTrue(resStr.contains("mLsfileaeOperationInvoker = new LsfileaeOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("public final Dfhcommarea lsfileae("));
        assertTrue(resStr.contains("final Dfhcommarea request,"));
    }

    /**
     * Case where there is no package name.
     * @throws Exception if test fails
     */
    public void testLsfileap() throws Exception {

        CixsJaxwsService model = Samples.getLsfileap();

        File componentClassFilesDir = CodeGenUtil.classFilesLocation(
                GEN_SRC_DIR, model.getPackageName(), true);
        Jaxws2CixsGenerator.generateImplementation(
                model, getParameters(), componentClassFilesDir);
        String resStr = getSource(
                componentClassFilesDir,
                model.getImplementationClassName() + ".java");

        assertFalse(resStr.contains("package com.legstar.test.cixs.lsfileap;"));
        assertTrue(resStr.contains("import com.legstar.test.coxb.lsfileae.Dfhcommarea;"));
        assertTrue(resStr.contains("private static final String  SERVICE_ADAPTER_NAME = \"lsfileap\";"));
        assertTrue(resStr.contains("private LsfileaeOperationInvoker mLsfileaeOperationInvoker;"));
        assertTrue(resStr.contains("mLsfileaeOperationInvoker = new LsfileaeOperationInvoker(getConfigFileName());"));
        assertTrue(resStr.contains("public final Dfhcommarea lsfileae("));
        assertTrue(resStr.contains("final Dfhcommarea request,"));
    }
}
