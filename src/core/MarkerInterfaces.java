package core;

import java.io.Serializable;

public interface MarkerInterfaces extends Serializable, Cloneable{
	//no members in it.
	//Just a declaration without any method or variables
	//It is a special indicator to the JVM to handle internally
	//For example, Serializable, Clonable interfaces are marker interface
	
	//If Serializable interface is mentioned, JVM will convert the states of an object to stream of bytes that used to write on disk or transfer over nextwork
	//Static variables/methods are not serializable by default, after deserialization the value will be null.
	//Transient keyword is used to tell JVM not include to bytes stream explicitly. This will avoid the password or any sensitive information to be saved or transfered.
	//Final variable with transient will be serializable if it is compile time constant
	//like final tranisent int a = 10, this data will be streamed due to complier inlining. If runtime constant like final transient String name; this will not be streamed.
	
	//Volatile -> The variable values will be allocated in the main memory. It can be visible to all the threads.
	//Data is not protected so data loss/corruption may occur.
}
