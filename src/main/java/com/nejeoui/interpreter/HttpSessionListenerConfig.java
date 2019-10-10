package com.nejeoui.interpreter;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nejeoui.interpreter.pooling.InterpretersHashMap;

/**
 * A HttpSessionListener configuration bean {@code HttpSessionListenerConfig}
 * <p>
 * Listen for HttpSessionEvent {@code HttpSessionEvent} HttpSession
 * {@code HttpSession} creation and HttpSession destruction
 * <p>
 *
 * @author <a href="mailto:a.nejeoui@gmail.com">Abderrazzak Nejeoui</a>
 * @see HttpSession
 * @see HttpSessionEvent
 * @since 1.0
 */
@Configuration
public class HttpSessionListenerConfig {
	/**
	 * Self4j Logger
	 */
	private static transient Logger logger = LoggerFactory.getLogger(HttpSessionListenerConfig.class);

	@Bean
	public HttpSessionListener httpSessionListener() {
		return new HttpSessionListener() {
			/**
			 * associate a PythonInterpreter to each newly created session
			 */
			@Override
			public void sessionCreated(HttpSessionEvent se) {
				String key = se.getSession().getId();
				InterpretersHashMap.get(key);
				logger.info("Interpreter initialized : key+" + key + " sessionTimout (seconds):"
						+ se.getSession().getMaxInactiveInterval());
			}

			/**
			 * clean the PythonInterpreter associated to the destroyed session
			 */
			@Override
			public void sessionDestroyed(HttpSessionEvent se) {
				String key = se.getSession().getId();
				InterpretersHashMap.remove(key);
				logger.info("Interpreter removed from cach : key+" + key);

			}
		};
	}
}