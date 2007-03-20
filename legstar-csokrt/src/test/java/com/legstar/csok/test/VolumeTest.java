package com.legstar.csok.test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;

import com.legstar.csok.client.CicsSocket;
import com.legstar.csok.client.CicsSocketEndpoint;
import com.legstar.messaging.Address;
import com.legstar.messaging.CommareaPart;
import com.legstar.messaging.ConnectionException;
import com.legstar.messaging.HeaderPart;
import com.legstar.messaging.Message;
import com.legstar.messaging.MessagePart;
import com.legstar.messaging.Request;
import com.legstar.messaging.RequestException;

import junit.framework.TestCase;

public class VolumeTest extends TestCase {

	private static final int MAX_ITERATIONS = 5;
	
	private static final String HOST_CHARSET = "IBM01140";
	
	/** Single thread iterating through simple requests with wait time
	 * @throws UnsupportedEncodingException */
	public void testSingleIterateSimpleWithWait() throws UnsupportedEncodingException {
		long startTime = System.currentTimeMillis();
		try {
			CicsSocketEndpoint endpoint = Util.getEndpoint("TheMainframe");
			endpoint.setHostTraceMode(false); // dont flood the host
			CicsSocket cs = new CicsSocket("testSingleIterateSimpleWithWait", endpoint);
			cs.connect("STREAM2");
			HashMap < String, String > map = new HashMap < String, String >();
			map.put("CICSProgram", "T1SLEEPT");
			map.put("CICSLength", "39");
			map.put("CICSDataLength", "8");
			List <MessagePart> inputParts = new ArrayList <MessagePart>();
			MessagePart inCommarea1 = new CommareaPart(Util.toByteArray("f0f0f0f0f0f0f0f3"));
			inputParts.add(inCommarea1);
			HeaderPart dp = new HeaderPart(map, inputParts.size(), HOST_CHARSET);
			Address address = new Address("TheMainframe");
			Message requestMessage = new Message(dp, inputParts);
			Request request = new Request("testSingleIterateSimpleWithWait", address, requestMessage);
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				cs.sendRequest(request);
				cs.recvResponse(request);
				cs.keepUOW();
				String reply = new String(request.getResponseMessage().getDataParts().get(0).getContent(), HOST_CHARSET);
				assertEquals("00000003P390    LEG1", reply.substring(0, 20));
			}
			cs.close();
			long endTime = System.currentTimeMillis();
			System.out.println("Duration millisecs=" + (endTime - startTime));
		} catch (ConnectionException e) {
			fail("testSingleIterateSimpleWithWait failed=" + e);
		} catch (RequestException e) {
			fail("testSingleIterateSimpleWithWait failed=" + e);
		} catch (ConfigurationException e) {
			fail("testSingleIterateSimpleWithWait failed=" + e);
		}
	}

	/** Single thread iterating through simple requests
	 * @throws UnsupportedEncodingException */
	public void testSingleIterateSimpleConnectionReused() throws UnsupportedEncodingException {
		long startTime = System.currentTimeMillis();
		try {
			CicsSocketEndpoint endpoint = Util.getEndpoint("TheMainframe");
			endpoint.setHostTraceMode(false); // dont flood the host
			CicsSocket cs = new CicsSocket("testSingleIterateSimpleConnectionReused", endpoint);
			cs.connect("STREAM2");
			HashMap < String, String > map = new HashMap < String, String >();
			map.put("CICSProgram", "LSFILEAE");
			map.put("CICSLength", "79");
			map.put("CICSDataLength", "6");
			List <MessagePart> inputParts = new ArrayList <MessagePart>();
			MessagePart inCommarea = new CommareaPart(Util.toByteArray("F0F0F0F1F0F0"));
			inputParts.add(inCommarea);
			HeaderPart dp = new HeaderPart(map, inputParts.size(), HOST_CHARSET);
			Address address = new Address("TheMainframe");
			Message requestMessage = new Message(dp, inputParts);
			Request request = new Request("testSingleIterateSimpleConnectionReused", address, requestMessage);
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				cs.sendRequest(request);
				cs.recvResponse(request);
				cs.commitUOW();
				assertEquals("f0f0f0f1f0f0e24b40c44b40c2d6d9d4c1d54040404040404040e2e4d9d9c5e86b40c5d5c7d3c1d5c44040404040f3f2f1f5f6f7f7f8f2f640f1f140f8f15bf0f1f0f04bf1f15c5c5c5c5c5c5c5c5c",
						Util.toHexString(request.getResponseMessage().getDataParts().get(0).getContent()));
			}
			cs.close();
			long endTime = System.currentTimeMillis();
			System.out.println("Duration millisecs=" + (endTime - startTime));
		} catch (ConnectionException e) {
			fail("testSingleIterateSimpleConnectionReused failed=" + e);
		} catch (RequestException e) {
			fail("testSingleIterateSimpleConnectionReused failed=" + e);
		} catch (ConfigurationException e) {
			fail("testSingleIterateSimpleConnectionReused failed=" + e);
		}
	}

	/** Single thread iterating through simple requests
	 * @throws UnsupportedEncodingException */
	public void testSingleIterateSimple() throws UnsupportedEncodingException {
		long startTime = System.currentTimeMillis();
		try {
			CicsSocketEndpoint endpoint = Util.getEndpoint("TheMainframe");
			endpoint.setHostTraceMode(false); // dont flood the host
			CicsSocket cs = new CicsSocket("testSingleIterateSimple", endpoint);
			HashMap < String, String > map = new HashMap < String, String >();
			map.put("CICSProgram", "LSFILEAE");
			map.put("CICSLength", "79");
			map.put("CICSDataLength", "6");
			List <MessagePart> inputParts = new ArrayList <MessagePart>();
			MessagePart inCommarea = new CommareaPart(Util.toByteArray("F0F0F0F1F0F0"));
			inputParts.add(inCommarea);
			HeaderPart dp = new HeaderPart(map, inputParts.size(), HOST_CHARSET);
			Address address = new Address("TheMainframe");
			Message requestMessage = new Message(dp, inputParts);
			Request request = new Request("testSingleIterateSimple", address, requestMessage);
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				cs.connect("STREAM2");
				cs.sendRequest(request);
				cs.recvResponse(request);
				cs.commitUOW();
				cs.close();
				assertEquals("f0f0f0f1f0f0e24b40c44b40c2d6d9d4c1d54040404040404040e2e4d9d9c5e86b40c5d5c7d3c1d5c44040404040f3f2f1f5f6f7f7f8f2f640f1f140f8f15bf0f1f0f04bf1f15c5c5c5c5c5c5c5c5c",
						Util.toHexString(request.getResponseMessage().getDataParts().get(0).getContent()));
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Duration millisecs=" + (endTime - startTime));
		} catch (ConnectionException e) {
			fail("testSingleIterateSimple failed=" + e);
		} catch (RequestException e) {
			fail("testSingleIterateSimple failed=" + e);
		} catch (ConfigurationException e) {
			fail("testSingleIterateSimple failed=" + e);
		}
	}

	/** Single thread iterates thru large data requests
	 * @throws UnsupportedEncodingException */
	public void testSingleIterateVolume() throws UnsupportedEncodingException {
		try {
			CicsSocketEndpoint endpoint = Util.getEndpoint("TheMainframe");
			endpoint.setHostTraceMode(true); // dont flood the host
			CicsSocket cs = new CicsSocket("testSingleIterateVolume", endpoint);
			cs.connect("STREAM2");
			HashMap < String, String > map = new HashMap < String, String >();
			map.put("CICSProgram", "T1VOLUME");
			map.put("CICSLength", "32767");
			map.put("CICSDataLength", "32767");
			List <MessagePart> inputParts = new ArrayList <MessagePart>();
			byte[] content = new byte[32767];
			byte[] startEC = Util.toByteArray("d7c7d47ec9c7e8c3d9c3e3d36bd9c5c7");
			byte[] endEC = Util.toByteArray("d7c1d9d47e4d7dd5d6c4e8d5c1d46bd3");
			System.arraycopy(startEC, 0, content, 0, 16);
			System.arraycopy(endEC, 0, content, 32751, 16);
			MessagePart inCommarea1 = new CommareaPart(content);
			inputParts.add(inCommarea1);
			HeaderPart dp = new HeaderPart(map, inputParts.size(), HOST_CHARSET);
			Address address = new Address("TheMainframe");
			Message requestMessage = new Message(dp, inputParts);
			Request request = new Request("testSingleIterateVolume", address, requestMessage);
			for (int i = 0; i < MAX_ITERATIONS; i++) {
				cs.sendRequest(request);
				cs.recvResponse(request);
				cs.keepUOW();
				System.arraycopy(request.getResponseMessage().getDataParts().get(0).getContent(), 0, startEC, 0, 16);
				System.arraycopy(request.getResponseMessage().getDataParts().get(0).getContent(), 32751, endEC, 0, 16);
				assertEquals("d7c1d9d47e4d7dd5d6c4e8d5c1d46bd3", Util.toHexString(startEC));
				assertEquals("d7c7d47ec9c7e8c3d9c3e3d36bd9c5c7", Util.toHexString(endEC));
			}
			cs.close();
		} catch (ConnectionException e) {
			fail("testSingleIterateVolume failed=" + e);
		} catch (RequestException e) {
			e.printStackTrace();
			fail("testSingleIterateVolume failed=" + e);
		} catch (ConfigurationException e) {
			fail("testSingleIterateVolume failed=" + e);
		}
	}
	
}
