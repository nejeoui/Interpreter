package com.nejeoui.interpreter.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.python.core.PyException;
import org.python.util.PythonInterpreter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nejeoui.interpreter.dto.InterpreterQuery;
import com.nejeoui.interpreter.dto.InterpreterResult;
import com.nejeoui.interpreter.dto.InterpreterType;
import com.nejeoui.interpreter.pooling.InterpretersHashMap;

@RestController
public class InterpreterController {

	private Logger logger = LoggerFactory.getLogger(InterpreterController.class);

	/**
	 * 
	 * @param InterpreterQuery in Json format
	 * @return InterpreterResult in Json format
	 * @author a.nejeoui<a.nejeoui@gmail.com>
	 */
	@RequestMapping("/exec")
	@ResponseBody
	public InterpreterResult exec(@RequestBody InterpreterQuery query, HttpServletRequest request) {
		InterpreterResult result = new InterpreterResult();
		HttpSession session = request.getSession(true);
		PythonInterpreter interpreter = InterpretersHashMap.get(session.getId());
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		try {
			interpreter.setOut(out);
			interpreter.setErr(out);
			interpreter.exec(query.getInterpreterCode(InterpreterType.PYTHON));
			out.flush();

			logger.info(out.toString());
			result.setResult(out.toString());
		} catch (PyException | IOException e) {
			e.printStackTrace();
			result.setResult("--Error-- :" + out.toString());
			logger.error(e.getMessage());

		}
		return result;
	}

	/**
	 * 
	 * clean the PythonInterpreter associated to the current HttpSession
	 * @return InterpreterResult
	 * @author a.nejeoui<a.nejeoui@gmail.com>
	 */
	@RequestMapping("/clean")
	public void clean(HttpServletRequest request) {
		HttpSession session = request.getSession(true);
		InterpretersHashMap.cleanLocals(session.getId());
	}

}
