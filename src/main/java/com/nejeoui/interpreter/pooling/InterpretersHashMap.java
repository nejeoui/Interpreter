package com.nejeoui.interpreter.pooling;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.python.core.PyObject;
import org.python.util.PythonInterpreter;

public class InterpretersHashMap {

	private static final Map<String, PythonInterpreter> CACH = new ConcurrentHashMap<String, PythonInterpreter>(100,
			0.7f);

	public static PythonInterpreter get(String key) {
		PythonInterpreter interpreter = CACH.get(key);
		if (null == interpreter) {
			interpreter = new PythonInterpreter();
			CACH.put(key, interpreter);
		}
		return interpreter;
	}

	public static void remove(Object key) {
		PythonInterpreter interpreter = CACH.get(key);
		if (null != interpreter) {
			interpreter.close();
		}
		CACH.remove(key);
	}

	public static void cleanAllInterpreters() {
		CACH.forEach((e, v) -> {
			cleanLocals(v);
		});
	}

	public static void cleanLocals(final PythonInterpreter interpreter) {
		if (null == interpreter) {
			return;
		}
		PyObject locals = interpreter.getLocals();
		List<PyObject> pyObjects = new ArrayList<PyObject>();
		for (PyObject local : locals.__iter__().asIterable()) {
			pyObjects.add(local);
		}
		for (PyObject pyObj : pyObjects) {
			interpreter.set(pyObj.toString(), null);

		}
	}

	public static void cleanLocals(final String sessionID) {
		try {
			cleanLocals(get(sessionID));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}