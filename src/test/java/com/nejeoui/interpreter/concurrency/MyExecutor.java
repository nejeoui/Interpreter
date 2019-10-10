package com.nejeoui.interpreter.concurrency;

import java.util.Date;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyExecutor extends ThreadPoolExecutor {
	private final ConcurrentHashMap<Runnable, Date> startTimes;

	public MyExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
			BlockingQueue<Runnable> workQueue) {
		super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
		startTimes = new ConcurrentHashMap<>();
	}

	@Override
	public void shutdown() {
		super.shutdown();
	}

	@Override 
    public List<Runnable> shutdownNow() { 
       
      return super.shutdownNow(); 
    }

	@Override 
    protected void beforeExecute(Thread t, Runnable r) { 
      startTimes.put(r, new Date()); 
    }
	
	@Override 
    protected void afterExecute(Runnable r, Throwable t) { 
     
    } 

	
}
