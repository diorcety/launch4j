/*
	Launch4j (http://launch4j.sourceforge.net/)
	Cross-platform Java application wrapper for creating Windows native executables.

	Copyright (c) 2004, 2015 Grzegorz Kowal
	All rights reserved.

	Redistribution and use in source and binary forms, with or without modification,
	are permitted provided that the following conditions are met:
	
	1. Redistributions of source code must retain the above copyright notice,
	   this list of conditions and the following disclaimer.
	
	2. Redistributions in binary form must reproduce the above copyright notice,
	   this list of conditions and the following disclaimer in the documentation
	   and/or other materials provided with the distribution.
	
	3. Neither the name of the copyright holder nor the names of its contributors
	   may be used to endorse or promote products derived from this software without
	   specific prior written permission.
	
	THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
	AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
	THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
	ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
	FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
	(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
	LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
	AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
	OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
	OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

/*
 * Created on Sep 3, 2005
 */
package net.sf.launch4j.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LdDefaults {
	private static final List<String> GUI_OBJECTS_32 = Arrays.asList(new String[] {
			"w32api/crt2.o",
			"head32/guihead.o",
			"head32/head.o" });

	private static final List<String> GUI_OBJECTS_64 = Arrays.asList(new String[] {
			"w64api/crt2.o",
			"head64/guihead.o",
			"head64/head.o" });

	private static final List<String> CONSOLE_OBJECTS_32 = Arrays.asList(new String[] {
			"w32api/crt2.o",
			"head32/consolehead.o",
			"head32/head.o" });

	private static final List<String> CONSOLE_OBJECTS_64 = Arrays.asList(new String[] {
			"w64api/crt2.o",
			"head64/consolehead.o",
			"head64/head.o" });
	
	private static final List<String> JNI_GUI_OBJECTS_32 = Arrays.asList(new String[] {
			"w32api_jni/crt2.o",
			"head32_jni_BETA/jniguihead.o",
			"head32_jni_BETA/head.o",
			"head32_jni_BETA/jnihead.o" });

	private static final List<String> JNI_GUI_OBJECTS_64 = Arrays.asList(new String[] {
			"w64api_jni/crt2.o",
			"head64_jni_BETA/jniguihead.o",
			"head64_jni_BETA/head.o",
			"head64_jni_BETA/jnihead.o" });

	private static final List<String> JNI_CONSOLE_OBJECTS_32 = Arrays.asList(new String[] {
			"w32api_jni/crt2.o",
			"head32_jni_BETA/jniconsolehead.o",
			"head32_jni_BETA/head.o",
			"head32_jni_BETA/jnihead.o" });

	private static final List<String> JNI_CONSOLE_OBJECTS_64 = Arrays.asList(new String[] {
			"w64api_jni/crt2.o",
			"head64_jni_BETA/jniconsolehead.o",
			"head64_jni_BETA/head.o",
			"head64_jni_BETA/jnihead.o" });

	private static final Map<String, List<String>> HEADER_OBJECTS_32;
	private static final Map<String, List<String>> HEADER_OBJECTS_64;

	private static final List<String> LIBS_32 = Arrays.asList(new String[] {
			"w32api/libmingw32.a",
			"w32api/libmingwex.a",
			"w32api/libgcc.a",
			"w32api/libmsvcrt.a",
			"w32api/libmsvcrt.a",
			"w32api/libkernel32.a",
			"w32api/libuser32.a",
			"w32api/libadvapi32.a",
			"w32api/libshell32.a" });

	private static final List<String> LIBS_64 = Arrays.asList(new String[] {
			"w64api/libmingw32.a",
			"w64api/libmingwex.a",
			"w64api/libgcc.a",
			"w64api/libmsvcrt.a",
			"w64api/libmsvcrt.a",
			"w64api/libkernel32.a",
			"w64api/libuser32.a",
			"w64api/libadvapi32.a",
			"w64api/libshell32.a" });

	private static final List<String> JNI_LIBS_32 = Arrays.asList(new String[] {
			"w32api_jni/libmingw32.a",
			"w32api_jni/libmingwex.a",
			"w32api_jni/libgcc.a",
			"w32api_jni/libmsvcrt.a",
			"w32api_jni/libmsvcrt.a",
			"w32api_jni/libmoldname.a",
			"w32api_jni/libkernel32.a",
			"w32api_jni/libuser32.a",
			"w32api_jni/libadvapi32.a",
			"w32api_jni/libshell32.a" });

	private static final List<String> JNI_LIBS_64 = Arrays.asList(new String[] {
			"w64api_jni/libmingw32.a",
			"w64api_jni/libmingwex.a",
			"w64api_jni/libgcc.a",
			"w64api_jni/libmsvcrt.a",
			"w64api_jni/libmsvcrt.a",
			"w64api_jni/libmoldname.a",
			"w64api_jni/libkernel32.a",
			"w64api_jni/libuser32.a",
			"w64api_jni/libadvapi32.a",
			"w64api_jni/libshell32.a" });


	static {
		HEADER_OBJECTS_32 = new HashMap<String, List<String>>();
		HEADER_OBJECTS_32.put(Config.GUI_HEADER, GUI_OBJECTS_32);
		HEADER_OBJECTS_32.put(Config.CONSOLE_HEADER, CONSOLE_OBJECTS_32);
		HEADER_OBJECTS_32.put(Config.JNI_GUI_HEADER, JNI_GUI_OBJECTS_32);
		HEADER_OBJECTS_32.put(Config.JNI_CONSOLE_HEADER, JNI_CONSOLE_OBJECTS_32);

		HEADER_OBJECTS_64 = new HashMap<String, List<String>>();
		HEADER_OBJECTS_64.put(Config.GUI_HEADER, GUI_OBJECTS_64);
		HEADER_OBJECTS_64.put(Config.CONSOLE_HEADER, CONSOLE_OBJECTS_64);
		HEADER_OBJECTS_64.put(Config.JNI_GUI_HEADER, JNI_GUI_OBJECTS_64);
		HEADER_OBJECTS_64.put(Config.JNI_CONSOLE_HEADER, JNI_CONSOLE_OBJECTS_64);
	}

	private LdDefaults() {
	}

	public static List<String> getHeaderObjects(String headerType, String runtimeBits) {
		if (Jre.RUNTIME_BITS_64.equals(runtimeBits)) {
			return HEADER_OBJECTS_64.get(headerType);
		} else if (Jre.RUNTIME_BITS_32.equals(runtimeBits)) {
			return HEADER_OBJECTS_32.get(headerType);
		}
		throw new IllegalArgumentException("Unknown runtimeBits: " + runtimeBits);
	}
	
	public static List<String> getLibs(String headerType, String runtimeBits) {
		boolean gui = Config.GUI_HEADER.equals(headerType)
				|| Config.CONSOLE_HEADER.equals(headerType);
		boolean jni = Config.JNI_GUI_HEADER.equals(headerType)
				|| Config.JNI_CONSOLE_HEADER.equals(headerType);
		if (Jre.RUNTIME_BITS_64.equals(runtimeBits)) {
			if (gui) {
				return LIBS_64;
			}
			if (jni) {
				return JNI_LIBS_64;
			}
			throw new IllegalArgumentException("Unknown headerType: " + headerType);
		} else if (Jre.RUNTIME_BITS_32.equals(runtimeBits)) {
			if (gui) {
				return LIBS_32;
			}
			if (jni) {
				return JNI_LIBS_32;
			}
			throw new IllegalArgumentException("Unknown headerType: " + headerType);
		}
		throw new IllegalArgumentException("Unknown runtimeBits: " + runtimeBits);
	}
}
