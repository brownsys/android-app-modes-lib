/*
 * The AIDL compile won't be able to locate our self-defined ModeData 
 * even if it implements the Parcelable interface. To propagate our 
 * implementation to the AIDL compiler, we need to define and aidl file which
 * declares the class as Parcelable
 */

package edu.brown.cs.systems.modes.data;

parcelable ModeData;