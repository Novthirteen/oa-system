/* =====================================================================
 *
 * Copyright (c) Sourceforge INFORMATION TECHNOLOGY All rights reserved.
 *
 * =====================================================================
 */

package net.sourceforge.utils;

/**
 * �ṩ��д��
 * @author ych
 * @version 1.0 (2005-10-9)
 */
public class RWLock
{
	private int givenLocks;
	private int waitingWriters;
	public static boolean TRACE = false;
	private static ThreadLocal flag = new ThreadLocal();

		
	private Object mutex;
	
	/**
     * ���캯��
     *
	 */
	public RWLock()
	{
		mutex = new Object();
		givenLocks = 0;
		waitingWriters = 0;
	}
	
    /**
     * ȡ��һ������
     *
     */
	public void getReadLock()
	{
		synchronized(mutex)
		{

			try
			{
				while((givenLocks == -1) || (waitingWriters != 0))
				{
					if(TRACE)
						System.out.println(Thread.currentThread().toString() + "waiting for readlock");
					mutex.wait();
				}
			}
			catch(java.lang.InterruptedException e)
			{
				System.out.println(e);
			}
			
			givenLocks++;
			flag.set("readlock");
			
			if(TRACE)
				System.out.println(Thread.currentThread().toString() + " got readlock, GivenLocks = " + givenLocks);
			
		}
	}
	
    /**
     * ȡ��һ��д��
     *
     */
	public void getWriteLock()
	{
		synchronized(mutex)
		{
			waitingWriters++;
			try
			{
				while(givenLocks != 0 && (givenLocks != 1 || flag.get() == null))
				{
					if(TRACE)
						System.out.println(Thread.currentThread().toString() + "waiting for writelock");
					mutex.wait();
				}
			}
			catch(java.lang.InterruptedException e)
			{
				System.out.println(e);
			}
			
			waitingWriters--;
			givenLocks = -1;
			flag.set(null);
	
			if(TRACE)
				System.out.println(Thread.currentThread().toString() + " got writelock, GivenLocks = " + givenLocks);
		}
	}
	
	/**
     * �ͷ��� 
     *
	 */
	public void releaseLock()
	{	
		
		synchronized(mutex)
		{
			mutex.notifyAll();	
			if(givenLocks == 0)
				return;
				
			if(givenLocks == -1)
				givenLocks = 0;
			else {
				givenLocks--;
				flag.set(null);
			}
			
			if(TRACE)
				System.out.println(Thread.currentThread().toString() + " released lock, GivenLocks = " + givenLocks);

			
		}
	}


}